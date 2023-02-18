pragma solidity ^0.8.0;

contract Transaction {
    struct TransactionInfo {
        uint id;
        string studentId;
        uint courseId;
        uint256 created;
    }

    uint nextId = 0;
    mapping(uint => TransactionInfo) public transactions;

    function addTransaction(string memory _studentId, uint _courseId) public {
        TransactionInfo memory transaction = TransactionInfo({
        id : nextId,
        studentId : _studentId,
        courseId : _courseId,
        created : block.timestamp
        });
        transactions[nextId++] = transaction;
    }

    function removeTransaction(uint _id) public {
        delete transactions[_id];
    }


    function getTransaction(uint _id) public view returns (uint, string memory, uint, uint256) {
        TransactionInfo storage transaction = transactions[_id];
        return (transaction.id, transaction.studentId, transaction.courseId, transaction.created);
    }

    function getAllTransactions() public view returns (uint[] memory, string[] memory, uint[] memory, uint256[] memory) {
        uint[] memory ids = new uint[](nextId);
        string[] memory studentIds = new string[](nextId);
        uint[] memory courseIds = new uint[](nextId);
        uint256[] memory createds = new uint[](nextId);

        for (uint i = 0; i < nextId; i++) {
            TransactionInfo storage data = transactions[i];
            ids[i] = data.id;
            studentIds[i] = data.studentId;
            courseIds[i] = data.courseId;
            createds[i] = data.created;
        }
        return (ids, studentIds, courseIds, createds);
    }
}
