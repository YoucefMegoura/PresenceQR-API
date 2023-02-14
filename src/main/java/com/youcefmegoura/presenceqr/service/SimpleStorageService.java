package com.youcefmegoura.presenceqr.service;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;

import java.io.IOException;
import java.math.BigInteger;

/**
 * @author youcefmegoura
 * @created 14/02/2023
 */
public interface SimpleStorageService {
    String checkEthConnection();

    String setValue(Integer value);

    BigInteger getValue() throws Exception;

    Credentials getCredentialsFromPrivateKey(Integer account);

    Web3j getWeb3jConnection() throws IOException;
}
