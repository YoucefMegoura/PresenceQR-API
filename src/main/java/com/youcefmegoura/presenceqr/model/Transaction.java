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
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple3;
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
    public static final String BINARY = "0x608060405234801561001057600080fd5b5061090e806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c806327506f531461006757806333ea3dc81461008857806346c3bd1f146100ba5780635abe1032146100d65780639ace38c2146100f2578063ed3a7b6814610125575b600080fd5b61006f610141565b60405161007f94939291906105ff565b60405180910390f35b6100a2600480360381019061009d9190610691565b6103be565b6040516100b1939291906106cd565b60405180910390f35b6100d460048036038101906100cf9190610691565b6103f6565b005b6100f060048036038101906100eb9190610704565b61042f565b005b61010c60048036038101906101079190610691565b610486565b60405161011c949392919061076b565b60405180910390f35b61013f600480360381019061013a91906107b0565b6104b6565b005b6060806060806000805467ffffffffffffffff81111561016457610163610803565b5b6040519080825280602002602001820160405280156101925781602001602082028036833780820191505090505b5090506000805467ffffffffffffffff8111156101b2576101b1610803565b5b6040519080825280602002602001820160405280156101e05781602001602082028036833780820191505090505b5090506000805467ffffffffffffffff811115610200576101ff610803565b5b60405190808252806020026020018201604052801561022e5781602001602082028036833780820191505090505b5090506000805467ffffffffffffffff81111561024e5761024d610803565b5b60405190808252806020026020018201604052801561027c5781602001602082028036833780820191505090505b5090506000805b6000548110156103a6576000600160008381526020019081526020016000206000015403156103935760016000828152602001908152602001600020600001548683815181106102d6576102d5610832565b5b602002602001018181525050600160008281526020019081526020016000206001015485838151811061030c5761030b610832565b5b602002602001018181525050600160008281526020019081526020016000206002015484838151811061034257610341610832565b5b602002602001018181525050600160008281526020019081526020016000206003015483838151811061037857610377610832565b5b602002602001018181525050818061038f90610890565b9250505b808061039e90610890565b915050610283565b50848484849850985098509850505050505090919293565b600080600080600160008681526020019081526020016000209050806001015481600201548260030154935093509350509193909250565b60016000828152602001908152602001600020600080820160009055600182016000905560028201600090556003820160009055505050565b82600160008681526020019081526020016000206001018190555081600160008681526020019081526020016000206002018190555080600160008681526020019081526020016000206003018190555050505050565b60016020528060005260406000206000915090508060000154908060010154908060020154908060030154905084565b60006040518060800160405280600054815260200185815260200184815260200183815250905080600160008060008154809291906104f490610890565b9190505581526020019081526020016000206000820151816000015560208201518160010155604082015181600201556060820151816003015590505050505050565b600081519050919050565b600082825260208201905092915050565b6000819050602082019050919050565b6000819050919050565b61057681610563565b82525050565b6000610588838361056d565b60208301905092915050565b6000602082019050919050565b60006105ac82610537565b6105b68185610542565b93506105c183610553565b8060005b838110156105f25781516105d9888261057c565b97506105e483610594565b9250506001810190506105c5565b5085935050505092915050565b6000608082019050818103600083015261061981876105a1565b9050818103602083015261062d81866105a1565b9050818103604083015261064181856105a1565b9050818103606083015261065581846105a1565b905095945050505050565b600080fd5b61066e81610563565b811461067957600080fd5b50565b60008135905061068b81610665565b92915050565b6000602082840312156106a7576106a6610660565b5b60006106b58482850161067c565b91505092915050565b6106c781610563565b82525050565b60006060820190506106e260008301866106be565b6106ef60208301856106be565b6106fc60408301846106be565b949350505050565b6000806000806080858703121561071e5761071d610660565b5b600061072c8782880161067c565b945050602061073d8782880161067c565b935050604061074e8782880161067c565b925050606061075f8782880161067c565b91505092959194509250565b600060808201905061078060008301876106be565b61078d60208301866106be565b61079a60408301856106be565b6107a760608301846106be565b95945050505050565b6000806000606084860312156107c9576107c8610660565b5b60006107d78682870161067c565b93505060206107e88682870161067c565b92505060406107f98682870161067c565b9150509250925092565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b600061089b82610563565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82036108cd576108cc610861565b5b60018201905091905056fea26469706673582212209fe2c5ba39b8fd58454b1e8e8ff1456ae7f8ec1b87a25664d46a985e6379574764736f6c63430008110033";

    public static final String FUNC_TRANSACTIONS = "transactions";

    public static final String FUNC_ADDTRANSACTION = "addTransaction";

    public static final String FUNC_REMOVETRANSACTION = "removeTransaction";

    public static final String FUNC_UPDATETRANSACTION = "updateTransaction";

    public static final String FUNC_GETTRANSACTION = "getTransaction";

    public static final String FUNC_GETALLTRANSACTIONS = "getAllTransactions";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
        _addresses.put("5777", "0xe46c2220220a7ACe470eC3aCA1Fb6D46b5c2778d");
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

    public RemoteFunctionCall<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>> transactions(BigInteger param0) {
        final Function function = new Function(FUNC_TRANSACTIONS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>>(function,
                new Callable<Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple4<BigInteger, BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<BigInteger, BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> addTransaction(BigInteger _studentId, BigInteger _courseId, BigInteger _created) {
        final Function function = new Function(
                FUNC_ADDTRANSACTION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_studentId), 
                new org.web3j.abi.datatypes.generated.Uint256(_courseId), 
                new org.web3j.abi.datatypes.generated.Uint256(_created)), 
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

    public RemoteFunctionCall<TransactionReceipt> updateTransaction(BigInteger _id, BigInteger _studentId, BigInteger _courseId, BigInteger _created) {
        final Function function = new Function(
                FUNC_UPDATETRANSACTION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.generated.Uint256(_studentId), 
                new org.web3j.abi.datatypes.generated.Uint256(_courseId), 
                new org.web3j.abi.datatypes.generated.Uint256(_created)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Tuple3<BigInteger, BigInteger, BigInteger>> getTransaction(BigInteger _id) {
        final Function function = new Function(FUNC_GETTRANSACTION, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple3<BigInteger, BigInteger, BigInteger>>(function,
                new Callable<Tuple3<BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple3<BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue());
                    }
                });
    }

    public RemoteFunctionCall<Tuple4<List<BigInteger>, List<BigInteger>, List<BigInteger>, List<BigInteger>>> getAllTransactions() {
        final Function function = new Function(FUNC_GETALLTRANSACTIONS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}, new TypeReference<DynamicArray<Uint256>>() {}, new TypeReference<DynamicArray<Uint256>>() {}, new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteFunctionCall<Tuple4<List<BigInteger>, List<BigInteger>, List<BigInteger>, List<BigInteger>>>(function,
                new Callable<Tuple4<List<BigInteger>, List<BigInteger>, List<BigInteger>, List<BigInteger>>>() {
                    @Override
                    public Tuple4<List<BigInteger>, List<BigInteger>, List<BigInteger>, List<BigInteger>> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<List<BigInteger>, List<BigInteger>, List<BigInteger>, List<BigInteger>>(
                                convertToNative((List<Uint256>) results.get(0).getValue()), 
                                convertToNative((List<Uint256>) results.get(1).getValue()), 
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
