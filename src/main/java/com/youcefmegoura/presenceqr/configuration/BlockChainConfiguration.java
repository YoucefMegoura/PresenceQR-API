package com.youcefmegoura.presenceqr.configuration;

import org.springframework.context.annotation.Configuration;

import java.math.BigInteger;
import java.util.Map;

import static java.util.Map.entry;

@Configuration
public class BlockChainConfiguration {

    public final static String BLOCKCHAINE_NETWORK_URL = "http://localhost:7545";
    public final static String PRIVATE_KEY_ACCT1 = "2b439c5e0cfdc5997402e1ea12fbc889c701b482ce5bf0c8c8cb750df582bb49";
    public final static String PRIVATE_KEY_ACCT2 = "0edfc33a87260632b17edcde95594abb83b272a054a3374a4c82309f11f31c5d";
    public final static String PRIVATE_KEY_ACCT3 = "e9f75d5f2e897450890ea05274f4bf6104c7eb1b34112bb72cebb305a9320a95";
    public final static String CONTRACT_ADDRESS = "0x361731720310c0B6398117B1eD245F1F89633a50";


    public final static String Acct1 = "0xC9d69d02a6Bc687267A081907f61F9AB3D5D4d1E";
    public final static String Acct2 = "0x7ae7A743Ef000a9A7f7C0dAB49cfdDa8e02B8665";
    public final static String Acct3 = "0x326471C4822f5B93b8B706B59322CD697e784E52";
    public final static Map<Integer, String> accountMap = Map.ofEntries(
            entry(1, Acct1),
            entry(2, Acct2),
            entry(3, Acct3)
    );

    public final static BigInteger GAS_LIMIT = BigInteger.valueOf(6721000L);
    public final static BigInteger GAS_PRICE = BigInteger.valueOf(200000000L);


}
