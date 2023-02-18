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
    public static final String BINARY = "0x60806040526000805534801561001457600080fd5b50610f4b806100246000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c806324aceeb41461005c57806327506f531461007857806333ea3dc81461009957806346c3bd1f146100cc5780639ace38c2146100e8575b600080fd5b61007660048036038101906100719190610803565b61011b565b005b6100806101a7565b6040516100909493929190610a5e565b60405180910390f35b6100b360048036038101906100ae9190610abf565b610450565b6040516100c39493929190610b45565b60405180910390f35b6100e660048036038101906100e19190610abf565b61051d565b005b61010260048036038101906100fd9190610abf565b61055e565b6040516101129493929190610b45565b60405180910390f35b600060405180608001604052806000548152602001848152602001838152602001428152509050806001600080600081548092919061015990610bc0565b91905055815260200190815260200160002060008201518160000155602082015181600101908161018a9190610e14565b506040820151816002015560608201518160030155905050505050565b6060806060806000805467ffffffffffffffff8111156101ca576101c96106a2565b5b6040519080825280602002602001820160405280156101f85781602001602082028036833780820191505090505b5090506000805467ffffffffffffffff811115610218576102176106a2565b5b60405190808252806020026020018201604052801561024b57816020015b60608152602001906001900390816102365790505b5090506000805467ffffffffffffffff81111561026b5761026a6106a2565b5b6040519080825280602002602001820160405280156102995781602001602082028036833780820191505090505b5090506000805467ffffffffffffffff8111156102b9576102b86106a2565b5b6040519080825280602002602001820160405280156102e75781602001602082028036833780820191505090505b50905060005b600054811015610439576000600160008381526020019081526020016000209050806000015486838151811061032657610325610ee6565b5b60200260200101818152505080600101805461034190610c37565b80601f016020809104026020016040519081016040528092919081815260200182805461036d90610c37565b80156103ba5780601f1061038f576101008083540402835291602001916103ba565b820191906000526020600020905b81548152906001019060200180831161039d57829003601f168201915b50505050508583815181106103d2576103d1610ee6565b5b602002602001018190525080600201548483815181106103f5576103f4610ee6565b5b602002602001018181525050806003015483838151811061041957610418610ee6565b5b60200260200101818152505050808061043190610bc0565b9150506102ed565b508383838397509750975097505050505090919293565b6000606060008060006001600087815260200190815260200160002090508060000154816001018260020154836003015482805461048d90610c37565b80601f01602080910402602001604051908101604052809291908181526020018280546104b990610c37565b80156105065780601f106104db57610100808354040283529160200191610506565b820191906000526020600020905b8154815290600101906020018083116104e957829003601f168201915b505050505092509450945094509450509193509193565b600160008281526020019081526020016000206000808201600090556001820160006105499190610616565b60028201600090556003820160009055505050565b600160205280600052604060002060009150905080600001549080600101805461058790610c37565b80601f01602080910402602001604051908101604052809291908181526020018280546105b390610c37565b80156106005780601f106105d557610100808354040283529160200191610600565b820191906000526020600020905b8154815290600101906020018083116105e357829003601f168201915b5050505050908060020154908060030154905084565b50805461062290610c37565b6000825580601f106106345750610653565b601f0160209004906000526020600020908101906106529190610656565b5b50565b5b8082111561066f576000816000905550600101610657565b5090565b6000604051905090565b600080fd5b600080fd5b600080fd5b600080fd5b6000601f19601f8301169050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6106da82610691565b810181811067ffffffffffffffff821117156106f9576106f86106a2565b5b80604052505050565b600061070c610673565b905061071882826106d1565b919050565b600067ffffffffffffffff821115610738576107376106a2565b5b61074182610691565b9050602081019050919050565b82818337600083830152505050565b600061077061076b8461071d565b610702565b90508281526020810184848401111561078c5761078b61068c565b5b61079784828561074e565b509392505050565b600082601f8301126107b4576107b3610687565b5b81356107c484826020860161075d565b91505092915050565b6000819050919050565b6107e0816107cd565b81146107eb57600080fd5b50565b6000813590506107fd816107d7565b92915050565b6000806040838503121561081a5761081961067d565b5b600083013567ffffffffffffffff81111561083857610837610682565b5b6108448582860161079f565b9250506020610855858286016107ee565b9150509250929050565b600081519050919050565b600082825260208201905092915050565b6000819050602082019050919050565b610894816107cd565b82525050565b60006108a6838361088b565b60208301905092915050565b6000602082019050919050565b60006108ca8261085f565b6108d4818561086a565b93506108df8361087b565b8060005b838110156109105781516108f7888261089a565b9750610902836108b2565b9250506001810190506108e3565b5085935050505092915050565b600081519050919050565b600082825260208201905092915050565b6000819050602082019050919050565b600081519050919050565b600082825260208201905092915050565b60005b83811015610983578082015181840152602081019050610968565b60008484015250505050565b600061099a82610949565b6109a48185610954565b93506109b4818560208601610965565b6109bd81610691565b840191505092915050565b60006109d4838361098f565b905092915050565b6000602082019050919050565b60006109f48261091d565b6109fe8185610928565b935083602082028501610a1085610939565b8060005b85811015610a4c5784840389528151610a2d85826109c8565b9450610a38836109dc565b925060208a01995050600181019050610a14565b50829750879550505050505092915050565b60006080820190508181036000830152610a7881876108bf565b90508181036020830152610a8c81866109e9565b90508181036040830152610aa081856108bf565b90508181036060830152610ab481846108bf565b905095945050505050565b600060208284031215610ad557610ad461067d565b5b6000610ae3848285016107ee565b91505092915050565b610af5816107cd565b82525050565b600082825260208201905092915050565b6000610b1782610949565b610b218185610afb565b9350610b31818560208601610965565b610b3a81610691565b840191505092915050565b6000608082019050610b5a6000830187610aec565b8181036020830152610b6c8186610b0c565b9050610b7b6040830185610aec565b610b886060830184610aec565b95945050505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b6000610bcb826107cd565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff8203610bfd57610bfc610b91565b5b600182019050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b60006002820490506001821680610c4f57607f821691505b602082108103610c6257610c61610c08565b5b50919050565b60008190508160005260206000209050919050565b60006020601f8301049050919050565b600082821b905092915050565b600060088302610cca7fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82610c8d565b610cd48683610c8d565b95508019841693508086168417925050509392505050565b6000819050919050565b6000610d11610d0c610d07846107cd565b610cec565b6107cd565b9050919050565b6000819050919050565b610d2b83610cf6565b610d3f610d3782610d18565b848454610c9a565b825550505050565b600090565b610d54610d47565b610d5f818484610d22565b505050565b5b81811015610d8357610d78600082610d4c565b600181019050610d65565b5050565b601f821115610dc857610d9981610c68565b610da284610c7d565b81016020851015610db1578190505b610dc5610dbd85610c7d565b830182610d64565b50505b505050565b600082821c905092915050565b6000610deb60001984600802610dcd565b1980831691505092915050565b6000610e048383610dda565b9150826002028217905092915050565b610e1d82610949565b67ffffffffffffffff811115610e3657610e356106a2565b5b610e408254610c37565b610e4b828285610d87565b600060209050601f831160018114610e7e5760008415610e6c578287015190505b610e768582610df8565b865550610ede565b601f198416610e8c86610c68565b60005b82811015610eb457848901518255600182019150602085019450602081019050610e8f565b86831015610ed15784890151610ecd601f891682610dda565b8355505b6001600288020188555050505b505050505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fdfea26469706673582212204ef8b1143d28f6d3137f7438bd28360145b6a94027deff6f59301e618cac272464736f6c63430008110033";

    public static final String FUNC_TRANSACTIONS = "transactions";

    public static final String FUNC_ADDTRANSACTION = "addTransaction";

    public static final String FUNC_REMOVETRANSACTION = "removeTransaction";

    public static final String FUNC_GETTRANSACTION = "getTransaction";

    public static final String FUNC_GETALLTRANSACTIONS = "getAllTransactions";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
        _addresses.put("5777", "0x12b034d5e5210171d3bef466A9C151136D6D3BE1");
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
