package com.youcefmegoura.presenceqr.model;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple4;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.2.
 */
@SuppressWarnings("rawtypes")
public class Transaction extends Contract {
    public static final String BINARY = "0x608060405234801561001057600080fd5b50610fab806100206000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c806324aceeb41461005c57806327506f531461007857806333ea3dc81461009957806346c3bd1f146100cc5780639ace38c2146100e8575b600080fd5b61007660048036038101906100719190610863565b61011b565b005b6100806101a7565b6040516100909493929190610abe565b60405180910390f35b6100b360048036038101906100ae9190610b1f565b6104b0565b6040516100c39493929190610ba5565b60405180910390f35b6100e660048036038101906100e19190610b1f565b61057d565b005b61010260048036038101906100fd9190610b1f565b6105be565b6040516101129493929190610ba5565b60405180910390f35b600060405180608001604052806000548152602001848152602001838152602001428152509050806001600080600081548092919061015990610c20565b91905055815260200190815260200160002060008201518160000155602082015181600101908161018a9190610e74565b506040820151816002015560608201518160030155905050505050565b6060806060806000805467ffffffffffffffff8111156101ca576101c9610702565b5b6040519080825280602002602001820160405280156101f85781602001602082028036833780820191505090505b5090506000805467ffffffffffffffff81111561021857610217610702565b5b60405190808252806020026020018201604052801561024b57816020015b60608152602001906001900390816102365790505b5090506000805467ffffffffffffffff81111561026b5761026a610702565b5b6040519080825280602002602001820160405280156102995781602001602082028036833780820191505090505b5090506000805467ffffffffffffffff8111156102b9576102b8610702565b5b6040519080825280602002602001820160405280156102e75781602001602082028036833780820191505090505b5090506000805b6000548110156104985760006001600083815260200190815260200160002060000154031561048557600160008281526020019081526020016000206000015486838151811061034157610340610f46565b5b60200260200101818152505060016000828152602001908152602001600020600101805461036e90610c97565b80601f016020809104026020016040519081016040528092919081815260200182805461039a90610c97565b80156103e75780601f106103bc576101008083540402835291602001916103e7565b820191906000526020600020905b8154815290600101906020018083116103ca57829003601f168201915b50505050508583815181106103ff576103fe610f46565b5b6020026020010181905250600160008281526020019081526020016000206002015484838151811061043457610433610f46565b5b602002602001018181525050600160008281526020019081526020016000206003015483838151811061046a57610469610f46565b5b602002602001018181525050818061048190610c20565b9250505b808061049090610c20565b9150506102ee565b50848484849850985098509850505050505090919293565b600060606000806000600160008781526020019081526020016000209050806000015481600101826002015483600301548280546104ed90610c97565b80601f016020809104026020016040519081016040528092919081815260200182805461051990610c97565b80156105665780601f1061053b57610100808354040283529160200191610566565b820191906000526020600020905b81548152906001019060200180831161054957829003601f168201915b505050505092509450945094509450509193509193565b600160008281526020019081526020016000206000808201600090556001820160006105a99190610676565b60028201600090556003820160009055505050565b60016020528060005260406000206000915090508060000154908060010180546105e790610c97565b80601f016020809104026020016040519081016040528092919081815260200182805461061390610c97565b80156106605780601f1061063557610100808354040283529160200191610660565b820191906000526020600020905b81548152906001019060200180831161064357829003601f168201915b5050505050908060020154908060030154905084565b50805461068290610c97565b6000825580601f1061069457506106b3565b601f0160209004906000526020600020908101906106b291906106b6565b5b50565b5b808211156106cf5760008160009055506001016106b7565b5090565b6000604051905090565b600080fd5b600080fd5b600080fd5b600080fd5b6000601f19601f8301169050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b61073a826106f1565b810181811067ffffffffffffffff8211171561075957610758610702565b5b80604052505050565b600061076c6106d3565b90506107788282610731565b919050565b600067ffffffffffffffff82111561079857610797610702565b5b6107a1826106f1565b9050602081019050919050565b82818337600083830152505050565b60006107d06107cb8461077d565b610762565b9050828152602081018484840111156107ec576107eb6106ec565b5b6107f78482856107ae565b509392505050565b600082601f830112610814576108136106e7565b5b81356108248482602086016107bd565b91505092915050565b6000819050919050565b6108408161082d565b811461084b57600080fd5b50565b60008135905061085d81610837565b92915050565b6000806040838503121561087a576108796106dd565b5b600083013567ffffffffffffffff811115610898576108976106e2565b5b6108a4858286016107ff565b92505060206108b58582860161084e565b9150509250929050565b600081519050919050565b600082825260208201905092915050565b6000819050602082019050919050565b6108f48161082d565b82525050565b600061090683836108eb565b60208301905092915050565b6000602082019050919050565b600061092a826108bf565b61093481856108ca565b935061093f836108db565b8060005b8381101561097057815161095788826108fa565b975061096283610912565b925050600181019050610943565b5085935050505092915050565b600081519050919050565b600082825260208201905092915050565b6000819050602082019050919050565b600081519050919050565b600082825260208201905092915050565b60005b838110156109e35780820151818401526020810190506109c8565b60008484015250505050565b60006109fa826109a9565b610a0481856109b4565b9350610a148185602086016109c5565b610a1d816106f1565b840191505092915050565b6000610a3483836109ef565b905092915050565b6000602082019050919050565b6000610a548261097d565b610a5e8185610988565b935083602082028501610a7085610999565b8060005b85811015610aac5784840389528151610a8d8582610a28565b9450610a9883610a3c565b925060208a01995050600181019050610a74565b50829750879550505050505092915050565b60006080820190508181036000830152610ad8818761091f565b90508181036020830152610aec8186610a49565b90508181036040830152610b00818561091f565b90508181036060830152610b14818461091f565b905095945050505050565b600060208284031215610b3557610b346106dd565b5b6000610b438482850161084e565b91505092915050565b610b558161082d565b82525050565b600082825260208201905092915050565b6000610b77826109a9565b610b818185610b5b565b9350610b918185602086016109c5565b610b9a816106f1565b840191505092915050565b6000608082019050610bba6000830187610b4c565b8181036020830152610bcc8186610b6c565b9050610bdb6040830185610b4c565b610be86060830184610b4c565b95945050505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b6000610c2b8261082d565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff8203610c5d57610c5c610bf1565b5b600182019050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b60006002820490506001821680610caf57607f821691505b602082108103610cc257610cc1610c68565b5b50919050565b60008190508160005260206000209050919050565b60006020601f8301049050919050565b600082821b905092915050565b600060088302610d2a7fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82610ced565b610d348683610ced565b95508019841693508086168417925050509392505050565b6000819050919050565b6000610d71610d6c610d678461082d565b610d4c565b61082d565b9050919050565b6000819050919050565b610d8b83610d56565b610d9f610d9782610d78565b848454610cfa565b825550505050565b600090565b610db4610da7565b610dbf818484610d82565b505050565b5b81811015610de357610dd8600082610dac565b600181019050610dc5565b5050565b601f821115610e2857610df981610cc8565b610e0284610cdd565b81016020851015610e11578190505b610e25610e1d85610cdd565b830182610dc4565b50505b505050565b600082821c905092915050565b6000610e4b60001984600802610e2d565b1980831691505092915050565b6000610e648383610e3a565b9150826002028217905092915050565b610e7d826109a9565b67ffffffffffffffff811115610e9657610e95610702565b5b610ea08254610c97565b610eab828285610de7565b600060209050601f831160018114610ede5760008415610ecc578287015190505b610ed68582610e58565b865550610f3e565b601f198416610eec86610cc8565b60005b82811015610f1457848901518255600182019150602085019450602081019050610eef565b86831015610f315784890151610f2d601f891682610e3a565b8355505b6001600288020188555050505b505050505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fdfea264697066735822122077efcc89f4c2989921af7164a36bc96c9ef177672af491e5160673513bd7925664736f6c63430008110033";

    public static final String FUNC_TRANSACTIONS = "transactions";

    public static final String FUNC_ADDTRANSACTION = "addTransaction";

    public static final String FUNC_REMOVETRANSACTION = "removeTransaction";

    public static final String FUNC_GETTRANSACTION = "getTransaction";

    public static final String FUNC_GETALLTRANSACTIONS = "getAllTransactions";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
        _addresses.put("5777", "0x557f6253c78dBF44EA6dF78084765231beBc7Bb2");
    }

    @Deprecated
    protected Transaction(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Transaction(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Transaction(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Transaction(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<Tuple4<BigInteger, String, BigInteger, BigInteger>> transactions(BigInteger param0) {
        final Function function = new Function(FUNC_TRANSACTIONS,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple4<BigInteger, String, BigInteger, BigInteger>>(function,
                new Callable<Tuple4<BigInteger, String, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple4<BigInteger, String, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, String, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(),
                                (String) results.get(1).getValue(),
                                (BigInteger) results.get(2).getValue(),
                                (BigInteger) results.get(3).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> addTransaction(String _studentId, BigInteger _courseId) {
        final Function function = new Function(
                FUNC_ADDTRANSACTION,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_studentId),
                        new org.web3j.abi.datatypes.generated.Uint256(_courseId)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> removeTransaction(BigInteger _id) {
        final Function function = new Function(
                FUNC_REMOVETRANSACTION,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Tuple4<BigInteger, String, BigInteger, BigInteger>> getTransaction(BigInteger _id) {
        final Function function = new Function(FUNC_GETTRANSACTION,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple4<BigInteger, String, BigInteger, BigInteger>>(function,
                new Callable<Tuple4<BigInteger, String, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple4<BigInteger, String, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, String, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(),
                                (String) results.get(1).getValue(),
                                (BigInteger) results.get(2).getValue(),
                                (BigInteger) results.get(3).getValue());
                    }
                });
    }

    public RemoteFunctionCall<Tuple4<List<BigInteger>, List<String>, List<BigInteger>, List<BigInteger>>> getAllTransactions() {
        final Function function = new Function(FUNC_GETALLTRANSACTIONS,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}, new TypeReference<DynamicArray<Utf8String>>() {}, new TypeReference<DynamicArray<Uint256>>() {}, new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteFunctionCall<Tuple4<List<BigInteger>, List<String>, List<BigInteger>, List<BigInteger>>>(function,
                new Callable<Tuple4<List<BigInteger>, List<String>, List<BigInteger>, List<BigInteger>>>() {
                    @Override
                    public Tuple4<List<BigInteger>, List<String>, List<BigInteger>, List<BigInteger>> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<List<BigInteger>, List<String>, List<BigInteger>, List<BigInteger>>(
                                convertToNative((List<Uint256>) results.get(0).getValue()),
                                convertToNative((List<Utf8String>) results.get(1).getValue()),
                                convertToNative((List<Uint256>) results.get(2).getValue()),
                                convertToNative((List<Uint256>) results.get(3).getValue()));
                    }
                });
    }

    @Deprecated
    public static Transaction load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Transaction(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Transaction load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Transaction(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Transaction load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Transaction(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Transaction load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Transaction(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Transaction> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Transaction.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Transaction> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Transaction.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Transaction> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Transaction.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Transaction> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Transaction.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}
