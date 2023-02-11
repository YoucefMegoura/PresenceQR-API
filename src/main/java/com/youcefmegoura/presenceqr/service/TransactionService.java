package com.youcefmegoura.presenceqr.service;

import com.youcefmegoura.presenceqr.dto.TransactionDTO;
import com.youcefmegoura.presenceqr.model.Transaction;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tuples.generated.Tuple3;
import org.web3j.tuples.generated.Tuple4;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;
import org.web3j.tx.gas.StaticGasProvider;

import java.io.IOException;
import java.math.BigInteger;
import java.time.Instant;

import static com.youcefmegoura.presenceqr.configuration.BlockChainConfiguration.*;
import static com.youcefmegoura.presenceqr.service.BlockchainUtilsService.getCredentialsFromPrivateKey;

@Slf4j
@Service
public class TransactionService {
    //TODO:: add logger
    private Web3j web3j;
    private Transaction transactionSmartContract;

    private static Logger logger = LoggerFactory.getLogger(TransactionService.class);

    public TransactionService() {
        web3j = Web3j.build(new HttpService(BLOCKCHAINE_NETWORK_URL));

        ContractGasProvider contractGasProvider = new StaticGasProvider(GAS_PRICE, GAS_LIMIT);
        TransactionManager transactionManager = new RawTransactionManager(
                web3j,
                getCredentialsFromPrivateKey(2)
        );
        transactionSmartContract = Transaction.load(
                CONTRACT_ADDRESS,  // Contract address
                web3j,
                transactionManager, // Accout
                contractGasProvider
        );
        try {
            logger.info("Connected to Ethereum client version: "
                    + web3j.web3ClientVersion().send().getWeb3ClientVersion());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String save(TransactionDTO transactionDTO) {
        TransactionReceipt receipt = null;
        try {
            logger.info("Credentials loaded");

            transactionDTO.setCreated(Instant.now().getEpochSecond());

            receipt = transactionSmartContract.addTransaction(
                            String.valueOf(transactionDTO.getStudentId()),
                            BigInteger.valueOf(transactionDTO.getCourseId())
                    )
                    .send();
            logger.info(receipt.toString());
        } catch (Exception e) {
            logger.info("Exception message : " + e.getMessage());
            e.printStackTrace();
        }
        return receipt != null ? receipt.getTransactionHash() : null;
    }

    public Object[] findById(long id) throws Exception {
        Tuple4<BigInteger, String, BigInteger, BigInteger> tuple4 = transactionSmartContract.getTransaction(BigInteger.valueOf(id)).send();
        Object[] array = {tuple4.component1(), tuple4.component2(), tuple4.component3(), tuple4.component4()};

        return array;
    }

}
