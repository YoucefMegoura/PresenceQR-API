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
public class Course extends Contract {
    public static final String BINARY = "0x608060405234801561001057600080fd5b506110fd806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c806304e48bd11461006757806307d0b79e146100885780630b91e28d146100a45780635f1ee60b146100d657806396f979d2146100f2578063df3addfa14610125575b600080fd5b61006f610141565b60405161007f949392919061096b565b60405180910390f35b6100a2600480360381019061009d9190610b41565b61044a565b005b6100be60048036038101906100b99190610bc4565b6104aa565b6040516100cd93929190610c4a565b60405180910390f35b6100f060048036038101906100eb9190610c88565b61056e565b005b61010c60048036038101906101079190610bc4565b6105fb565b60405161011c9493929190610cf7565b60405180910390f35b61013f600480360381019061013a9190610bc4565b6106b3565b005b6060806060806000805467ffffffffffffffff81111561016457610163610a16565b5b6040519080825280602002602001820160405280156101925781602001602082028036833780820191505090505b5090506000805467ffffffffffffffff8111156101b2576101b1610a16565b5b6040519080825280602002602001820160405280156101e557816020015b60608152602001906001900390816101d05790505b5090506000805467ffffffffffffffff81111561020557610204610a16565b5b6040519080825280602002602001820160405280156102335781602001602082028036833780820191505090505b5090506000805467ffffffffffffffff81111561025357610252610a16565b5b6040519080825280602002602001820160405280156102815781602001602082028036833780820191505090505b5090506000805b6000548110156104325760006001600083815260200190815260200160002060000154031561041f5760016000828152602001908152602001600020600001548683815181106102db576102da610d43565b5b60200260200101818152505060016000828152602001908152602001600020600101805461030890610da1565b80601f016020809104026020016040519081016040528092919081815260200182805461033490610da1565b80156103815780601f1061035657610100808354040283529160200191610381565b820191906000526020600020905b81548152906001019060200180831161036457829003601f168201915b505050505085838151811061039957610398610d43565b5b602002602001018190525060016000828152602001908152602001600020600201548483815181106103ce576103cd610d43565b5b602002602001018181525050600160008281526020019081526020016000206003015483838151811061040457610403610d43565b5b602002602001018181525050818061041b90610e01565b9250505b808061042a90610e01565b915050610288565b50848484849850985098509850505050505090919293565b8260016000868152602001908152602001600020600101908161046d9190610ff5565b5081600160008681526020019081526020016000206002018190555080600160008681526020019081526020016000206003018190555050505050565b6060600080600060016000868152602001908152602001600020905080600101816002015482600301548280546104e090610da1565b80601f016020809104026020016040519081016040528092919081815260200182805461050c90610da1565b80156105595780601f1061052e57610100808354040283529160200191610559565b820191906000526020600020905b81548152906001019060200180831161053c57829003601f168201915b50505050509250935093509350509193909250565b60006040518060800160405280600054815260200185815260200184815260200183815250905080600160008060008154809291906105ac90610e01565b9190505581526020019081526020016000206000820151816000015560208201518160010190816105dd9190610ff5565b50604082015181600201556060820151816003015590505050505050565b600160205280600052604060002060009150905080600001549080600101805461062490610da1565b80601f016020809104026020016040519081016040528092919081815260200182805461065090610da1565b801561069d5780601f106106725761010080835404028352916020019161069d565b820191906000526020600020905b81548152906001019060200180831161068057829003601f168201915b5050505050908060020154908060030154905084565b600160008281526020019081526020016000206000808201600090556001820160006106df91906106f4565b60028201600090556003820160009055505050565b50805461070090610da1565b6000825580601f106107125750610731565b601f0160209004906000526020600020908101906107309190610734565b5b50565b5b8082111561074d576000816000905550600101610735565b5090565b600081519050919050565b600082825260208201905092915050565b6000819050602082019050919050565b6000819050919050565b6107908161077d565b82525050565b60006107a28383610787565b60208301905092915050565b6000602082019050919050565b60006107c682610751565b6107d0818561075c565b93506107db8361076d565b8060005b8381101561080c5781516107f38882610796565b97506107fe836107ae565b9250506001810190506107df565b5085935050505092915050565b600081519050919050565b600082825260208201905092915050565b6000819050602082019050919050565b600081519050919050565b600082825260208201905092915050565b60005b8381101561087f578082015181840152602081019050610864565b60008484015250505050565b6000601f19601f8301169050919050565b60006108a782610845565b6108b18185610850565b93506108c1818560208601610861565b6108ca8161088b565b840191505092915050565b60006108e1838361089c565b905092915050565b6000602082019050919050565b600061090182610819565b61090b8185610824565b93508360208202850161091d85610835565b8060005b85811015610959578484038952815161093a85826108d5565b9450610945836108e9565b925060208a01995050600181019050610921565b50829750879550505050505092915050565b6000608082019050818103600083015261098581876107bb565b9050818103602083015261099981866108f6565b905081810360408301526109ad81856107bb565b905081810360608301526109c181846107bb565b905095945050505050565b6000604051905090565b600080fd5b600080fd5b6109e98161077d565b81146109f457600080fd5b50565b600081359050610a06816109e0565b92915050565b600080fd5b600080fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b610a4e8261088b565b810181811067ffffffffffffffff82111715610a6d57610a6c610a16565b5b80604052505050565b6000610a806109cc565b9050610a8c8282610a45565b919050565b600067ffffffffffffffff821115610aac57610aab610a16565b5b610ab58261088b565b9050602081019050919050565b82818337600083830152505050565b6000610ae4610adf84610a91565b610a76565b905082815260208101848484011115610b0057610aff610a11565b5b610b0b848285610ac2565b509392505050565b600082601f830112610b2857610b27610a0c565b5b8135610b38848260208601610ad1565b91505092915050565b60008060008060808587031215610b5b57610b5a6109d6565b5b6000610b69878288016109f7565b945050602085013567ffffffffffffffff811115610b8a57610b896109db565b5b610b9687828801610b13565b9350506040610ba7878288016109f7565b9250506060610bb8878288016109f7565b91505092959194509250565b600060208284031215610bda57610bd96109d6565b5b6000610be8848285016109f7565b91505092915050565b600082825260208201905092915050565b6000610c0d82610845565b610c178185610bf1565b9350610c27818560208601610861565b610c308161088b565b840191505092915050565b610c448161077d565b82525050565b60006060820190508181036000830152610c648186610c02565b9050610c736020830185610c3b565b610c806040830184610c3b565b949350505050565b600080600060608486031215610ca157610ca06109d6565b5b600084013567ffffffffffffffff811115610cbf57610cbe6109db565b5b610ccb86828701610b13565b9350506020610cdc868287016109f7565b9250506040610ced868287016109f7565b9150509250925092565b6000608082019050610d0c6000830187610c3b565b8181036020830152610d1e8186610c02565b9050610d2d6040830185610c3b565b610d3a6060830184610c3b565b95945050505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b60006002820490506001821680610db957607f821691505b602082108103610dcc57610dcb610d72565b5b50919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b6000610e0c8261077d565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff8203610e3e57610e3d610dd2565b5b600182019050919050565b60008190508160005260206000209050919050565b60006020601f8301049050919050565b600082821b905092915050565b600060088302610eab7fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82610e6e565b610eb58683610e6e565b95508019841693508086168417925050509392505050565b6000819050919050565b6000610ef2610eed610ee88461077d565b610ecd565b61077d565b9050919050565b6000819050919050565b610f0c83610ed7565b610f20610f1882610ef9565b848454610e7b565b825550505050565b600090565b610f35610f28565b610f40818484610f03565b505050565b5b81811015610f6457610f59600082610f2d565b600181019050610f46565b5050565b601f821115610fa957610f7a81610e49565b610f8384610e5e565b81016020851015610f92578190505b610fa6610f9e85610e5e565b830182610f45565b50505b505050565b600082821c905092915050565b6000610fcc60001984600802610fae565b1980831691505092915050565b6000610fe58383610fbb565b9150826002028217905092915050565b610ffe82610845565b67ffffffffffffffff81111561101757611016610a16565b5b6110218254610da1565b61102c828285610f68565b600060209050601f83116001811461105f576000841561104d578287015190505b6110578582610fd9565b8655506110bf565b601f19841661106d86610e49565b60005b8281101561109557848901518255600182019150602085019450602081019050611070565b868310156110b257848901516110ae601f891682610fbb565b8355505b6001600288020188555050505b50505050505056fea2646970667358221220555284898f7456062408a1608dad5491b92d7a272a11d2307460a8500c08c19e64736f6c63430008110033";

    public static final String FUNC_COURSES = "courses";

    public static final String FUNC_ADDCOURSE = "addCourse";

    public static final String FUNC_REMOVECOURSE = "removeCourse";

    public static final String FUNC_UPDATECOURSE = "updateCourse";

    public static final String FUNC_GETCOURSE = "getCourse";

    public static final String FUNC_GETALLCOURSES = "getAllCourses";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
        _addresses.put("5777", "0xc588e48B2c727Bb9e52231E3E1222F83d3280b40");
    }

    @Deprecated
    protected Course(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Course(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Course(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Course(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<Tuple4<BigInteger, String, BigInteger, BigInteger>> courses(BigInteger param0) {
        final Function function = new Function(FUNC_COURSES, 
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

    public RemoteFunctionCall<TransactionReceipt> addCourse(String _name, BigInteger _creditHours, BigInteger _startDate) {
        final Function function = new Function(
                FUNC_ADDCOURSE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.generated.Uint256(_creditHours), 
                new org.web3j.abi.datatypes.generated.Uint256(_startDate)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> removeCourse(BigInteger _id) {
        final Function function = new Function(
                FUNC_REMOVECOURSE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> updateCourse(BigInteger _id, String _name, BigInteger _creditHours, BigInteger _startDate) {
        final Function function = new Function(
                FUNC_UPDATECOURSE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.generated.Uint256(_creditHours), 
                new org.web3j.abi.datatypes.generated.Uint256(_startDate)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Tuple3<String, BigInteger, BigInteger>> getCourse(BigInteger _id) {
        final Function function = new Function(FUNC_GETCOURSE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple3<String, BigInteger, BigInteger>>(function,
                new Callable<Tuple3<String, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple3<String, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<String, BigInteger, BigInteger>(
                                (String) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue());
                    }
                });
    }

    public RemoteFunctionCall<Tuple4<List<BigInteger>, List<String>, List<BigInteger>, List<BigInteger>>> getAllCourses() {
        final Function function = new Function(FUNC_GETALLCOURSES, 
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
    public static Course load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Course(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Course load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Course(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Course load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Course(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Course load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Course(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Course> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Course.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Course> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Course.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Course> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Course.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Course> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Course.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}
