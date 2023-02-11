package com.youcefmegoura.presenceqr.service;

import com.youcefmegoura.presenceqr.model.SimpleStorage;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;
import org.web3j.tx.gas.StaticGasProvider;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Objects;

import static com.youcefmegoura.presenceqr.configuration.BlockChainConfiguration.*;

@Setter
@Getter
@Slf4j
@Service
public class SimpleStorageService {
    private static Logger logger = LoggerFactory.getLogger(SimpleStorageService.class);
    private Web3j web3j;
    private SimpleStorage contract;

    public String checkEthConnection() {
        String result;
        try {
            // We start by creating a new web3j instance to connect to remote nodes on the network.
            Web3j web3j = getWeb3jConnection();
            result = web3j.web3ClientVersion().send().getWeb3ClientVersion();
            logger.info("Connected to Ethereum client version: "
                    + result);

        } catch (Exception e) {
            logger.info("Exception message : " + e.getMessage());
            e.printStackTrace();
            result = "Connection Failed";
        }
        if (result == null) result = "Connection Failed";
        return result;
    }

    public String setValue(Integer value) {
        TransactionReceipt receipt = null;
        try {
            getWeb3jConnection();
            logger.info("Credentials loaded");

            receipt = contract.set(BigInteger.valueOf(value)).send();
            logger.info(receipt.toString());
        } catch (Exception e) {
            logger.info("Exception message : " + e.getMessage());
            e.printStackTrace();
        }
        return receipt.getTransactionHash();
    }

    public BigInteger getData() throws Exception {
        return contract.get().send();
    }


    private Credentials getCredentialsFromPrivateKey(Integer account) {
        if (account.equals(3)) return Credentials.create(PRIVATE_KEY_ACCT3);
        if (account.equals(2)) return Credentials.create(PRIVATE_KEY_ACCT2);
        return Credentials.create(PRIVATE_KEY_ACCT1);
    }

    private Web3j getWeb3jConnection() throws IOException {
        if (Objects.nonNull(web3j)) return web3j;
        web3j = Web3j.build(new HttpService(BLOCKCHAINE_NETWORK_URL));

        ContractGasProvider contractGasProvider = new StaticGasProvider(GAS_PRICE, GAS_LIMIT);
        TransactionManager transactionManager = new RawTransactionManager(
                web3j,
                getCredentialsFromPrivateKey(2)
        );
        contract = SimpleStorage.load(
                CONTRACT_ADDRESS,  // Contract address
                web3j,
                transactionManager, // Accout
                contractGasProvider
        );
        logger.info("Connected to Ethereum client version: "
                + web3j.web3ClientVersion().send().getWeb3ClientVersion());
        return web3j;
    }
}