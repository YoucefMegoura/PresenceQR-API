package com.youcefmegoura.presenceqr.configuration;

import org.springframework.context.annotation.Configuration;

import java.math.BigInteger;
import java.util.Map;

import static java.util.Map.entry;

@Configuration
public class BlockChainConfiguration {

    public final static String BLOCKCHAINE_NETWORK_URL = "http://localhost:7545"; //TODO:: move to application.properties
    public final static String PRIVATE_KEY_ACCT1 = "f1705eae3f3329d066bf78df1cda5693d824f23b167399101b8aa98620c49eeb";
    public final static String PRIVATE_KEY_ACCT2 = "7947594e939ade366aeb90fb1e7a6ea73a26c0954ec20a929b235bc555416a08";
    public final static String PRIVATE_KEY_ACCT3 = "d96b2e3366ef9a80532c769ab9a2da02e338bf23b5cb196923fe5bb29d0920a2";
    public final static String CONTRACT_ADDRESS = "0x557f6253c78dBF44EA6dF78084765231beBc7Bb2";


    public final static String Acct1 = "0x80d8363A9411993Cd1FEcA106C88a3F4f7d92a37";
    public final static String Acct2 = "0x99ff8484ED65EdC2c72977cf50a28F374609fFd3";
    public final static String Acct3 = "0x7D842f054872aea433c6979ef1743832Eb479558";
    public final static Map<Integer, String> accountMap = Map.ofEntries(
            entry(1, Acct1),
            entry(2, Acct2),
            entry(3, Acct3)
    );

    public final static BigInteger GAS_LIMIT = BigInteger.valueOf(6721000L); //TODO:: move to application.properties
    public final static BigInteger GAS_PRICE = BigInteger.valueOf(200000000L); //TODO:: move to application.properties


}
