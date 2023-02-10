package com.youcefmegoura.presenceqr.model;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
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
import org.web3j.tuples.generated.Tuple5;
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
public class Student extends Contract {
    public static final String BINARY = "0x608060405234801561001057600080fd5b50610d6e806100206000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c806306ead22e1461005c5780632815f71c14610090578063642f9163146100ac5780636af83845146100df578063a03bdf5d146100fb575b600080fd5b610076600480360381019061007191906105dc565b610117565b6040516100879594939291906106a8565b60405180910390f35b6100aa60048036038101906100a5919061083e565b61025d565b005b6100c660048036038101906100c191906105dc565b6102e2565b6040516100d694939291906108f1565b60405180910390f35b6100f960048036038101906100f491906105dc565b61043a565b005b61011560048036038101906101109190610944565b61048b565b005b600160205280600052604060002060009150905080600001549080600101805461014090610a12565b80601f016020809104026020016040519081016040528092919081815260200182805461016c90610a12565b80156101b95780601f1061018e576101008083540402835291602001916101b9565b820191906000526020600020905b81548152906001019060200180831161019c57829003601f168201915b5050505050908060020154908060030180546101d490610a12565b80601f016020809104026020016040519081016040528092919081815260200182805461020090610a12565b801561024d5780601f106102225761010080835404028352916020019161024d565b820191906000526020600020905b81548152906001019060200180831161023057829003601f168201915b5050505050908060040154905085565b836001600087815260200190815260200160002060010190816102809190610bef565b50826001600087815260200190815260200160002060020181905550816001600087815260200190815260200160002060030190816102bf9190610bef565b508060016000878152602001908152602001600020600401819055505050505050565b60606000606060008060016000878152602001908152602001600020905080600101816002015482600301836004015483805461031e90610a12565b80601f016020809104026020016040519081016040528092919081815260200182805461034a90610a12565b80156103975780601f1061036c57610100808354040283529160200191610397565b820191906000526020600020905b81548152906001019060200180831161037a57829003601f168201915b505050505093508180546103aa90610a12565b80601f01602080910402602001604051908101604052809291908181526020018280546103d690610a12565b80156104235780601f106103f857610100808354040283529160200191610423565b820191906000526020600020905b81548152906001019060200180831161040657829003601f168201915b505050505091509450945094509450509193509193565b600160008281526020019081526020016000206000808201600090556001820160006104669190610535565b600282016000905560038201600061047e9190610535565b6004820160009055505050565b60006040518060a00160405280600054815260200186815260200185815260200184815260200183815250905080600160008060008154809291906104cf90610cf0565b9190505581526020019081526020016000206000820151816000015560208201518160010190816105009190610bef565b506040820151816002015560608201518160030190816105209190610bef565b50608082015181600401559050505050505050565b50805461054190610a12565b6000825580601f106105535750610572565b601f0160209004906000526020600020908101906105719190610575565b5b50565b5b8082111561058e576000816000905550600101610576565b5090565b6000604051905090565b600080fd5b600080fd5b6000819050919050565b6105b9816105a6565b81146105c457600080fd5b50565b6000813590506105d6816105b0565b92915050565b6000602082840312156105f2576105f161059c565b5b6000610600848285016105c7565b91505092915050565b610612816105a6565b82525050565b600081519050919050565b600082825260208201905092915050565b60005b83811015610652578082015181840152602081019050610637565b60008484015250505050565b6000601f19601f8301169050919050565b600061067a82610618565b6106848185610623565b9350610694818560208601610634565b61069d8161065e565b840191505092915050565b600060a0820190506106bd6000830188610609565b81810360208301526106cf818761066f565b90506106de6040830186610609565b81810360608301526106f0818561066f565b90506106ff6080830184610609565b9695505050505050565b600080fd5b600080fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b61074b8261065e565b810181811067ffffffffffffffff8211171561076a57610769610713565b5b80604052505050565b600061077d610592565b90506107898282610742565b919050565b600067ffffffffffffffff8211156107a9576107a8610713565b5b6107b28261065e565b9050602081019050919050565b82818337600083830152505050565b60006107e16107dc8461078e565b610773565b9050828152602081018484840111156107fd576107fc61070e565b5b6108088482856107bf565b509392505050565b600082601f83011261082557610824610709565b5b81356108358482602086016107ce565b91505092915050565b600080600080600060a0868803121561085a5761085961059c565b5b6000610868888289016105c7565b955050602086013567ffffffffffffffff811115610889576108886105a1565b5b61089588828901610810565b94505060406108a6888289016105c7565b935050606086013567ffffffffffffffff8111156108c7576108c66105a1565b5b6108d388828901610810565b92505060806108e4888289016105c7565b9150509295509295909350565b6000608082019050818103600083015261090b818761066f565b905061091a6020830186610609565b818103604083015261092c818561066f565b905061093b6060830184610609565b95945050505050565b6000806000806080858703121561095e5761095d61059c565b5b600085013567ffffffffffffffff81111561097c5761097b6105a1565b5b61098887828801610810565b9450506020610999878288016105c7565b935050604085013567ffffffffffffffff8111156109ba576109b96105a1565b5b6109c687828801610810565b92505060606109d7878288016105c7565b91505092959194509250565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b60006002820490506001821680610a2a57607f821691505b602082108103610a3d57610a3c6109e3565b5b50919050565b60008190508160005260206000209050919050565b60006020601f8301049050919050565b600082821b905092915050565b600060088302610aa57fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82610a68565b610aaf8683610a68565b95508019841693508086168417925050509392505050565b6000819050919050565b6000610aec610ae7610ae2846105a6565b610ac7565b6105a6565b9050919050565b6000819050919050565b610b0683610ad1565b610b1a610b1282610af3565b848454610a75565b825550505050565b600090565b610b2f610b22565b610b3a818484610afd565b505050565b5b81811015610b5e57610b53600082610b27565b600181019050610b40565b5050565b601f821115610ba357610b7481610a43565b610b7d84610a58565b81016020851015610b8c578190505b610ba0610b9885610a58565b830182610b3f565b50505b505050565b600082821c905092915050565b6000610bc660001984600802610ba8565b1980831691505092915050565b6000610bdf8383610bb5565b9150826002028217905092915050565b610bf882610618565b67ffffffffffffffff811115610c1157610c10610713565b5b610c1b8254610a12565b610c26828285610b62565b600060209050601f831160018114610c595760008415610c47578287015190505b610c518582610bd3565b865550610cb9565b601f198416610c6786610a43565b60005b82811015610c8f57848901518255600182019150602085019450602081019050610c6a565b86831015610cac5784890151610ca8601f891682610bb5565b8355505b6001600288020188555050505b505050505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b6000610cfb826105a6565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff8203610d2d57610d2c610cc1565b5b60018201905091905056fea264697066735822122022151448286674d13c1b3df9b7652e39451b0a792ec6e007bc2ce385d608a04364736f6c63430008110033";

    public static final String FUNC_STUDENTS = "students";

    public static final String FUNC_ADDSTUDENT = "addStudent";

    public static final String FUNC_REMOVESTUDENT = "removeStudent";

    public static final String FUNC_UPDATESTUDENT = "updateStudent";

    public static final String FUNC_GETSTUDENT = "getStudent";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
        _addresses.put("5777", "0xefe69e2Bf75C5D5c68dd7c8a7c60473C09fB7eE6");
    }

    @Deprecated
    protected Student(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Student(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Student(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Student(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<Tuple5<BigInteger, String, BigInteger, String, BigInteger>> students(BigInteger param0) {
        final Function function = new Function(FUNC_STUDENTS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple5<BigInteger, String, BigInteger, String, BigInteger>>(function,
                new Callable<Tuple5<BigInteger, String, BigInteger, String, BigInteger>>() {
                    @Override
                    public Tuple5<BigInteger, String, BigInteger, String, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<BigInteger, String, BigInteger, String, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (String) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> addStudent(String _name, BigInteger _age, String _studentAddress, BigInteger _dateOfAdmission) {
        final Function function = new Function(
                FUNC_ADDSTUDENT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.generated.Uint256(_age), 
                new org.web3j.abi.datatypes.Utf8String(_studentAddress), 
                new org.web3j.abi.datatypes.generated.Uint256(_dateOfAdmission)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> removeStudent(BigInteger _id) {
        final Function function = new Function(
                FUNC_REMOVESTUDENT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> updateStudent(BigInteger _id, String _name, BigInteger _age, String _studentAddress, BigInteger _dateOfAdmission) {
        final Function function = new Function(
                FUNC_UPDATESTUDENT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.generated.Uint256(_age), 
                new org.web3j.abi.datatypes.Utf8String(_studentAddress), 
                new org.web3j.abi.datatypes.generated.Uint256(_dateOfAdmission)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Tuple4<String, BigInteger, String, BigInteger>> getStudent(BigInteger _id) {
        final Function function = new Function(FUNC_GETSTUDENT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple4<String, BigInteger, String, BigInteger>>(function,
                new Callable<Tuple4<String, BigInteger, String, BigInteger>>() {
                    @Override
                    public Tuple4<String, BigInteger, String, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<String, BigInteger, String, BigInteger>(
                                (String) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (String) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue());
                    }
                });
    }

    @Deprecated
    public static Student load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Student(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Student load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Student(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Student load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Student(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Student load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Student(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Student> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Student.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Student> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Student.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Student> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Student.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Student> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Student.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}
