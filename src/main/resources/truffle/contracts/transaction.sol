pragma solidity ^0.8.0;

contract Transaction {
    struct TransactionInfo {
        uint id;
        uint studentId;
        uint courseId;
        uint256 created;
    }

    uint nextId;
    mapping (uint => TransactionInfo) public transactions;

    function addTransaction(uint _studentId, uint _courseId, uint256 _created) public {
        TransactionInfo memory transaction = TransactionInfo({
        id: nextId,
        studentId: _studentId,
        courseId: _courseId,
        created: _created
        });
        transactions[nextId++] = transaction;
    }

    function removeTransaction(uint _id) public {
        delete transactions[_id];
    }

    function updateTransaction(uint _id, uint _studentId, uint _courseId, uint256 _created) public {
        transactions[_id].studentId = _studentId;
        transactions[_id].courseId = _courseId;
        transactions[_id].created = _created;
    }

    function getTransaction(uint _id) public view returns (uint, uint, uint, uint256) {
        TransactionInfo storage transaction = transactions[_id];
        return (transaction.studentId, transaction.courseId, transaction.created);
    }

    function getAllTransactions() public view returns (uint[] memory, uint[] memory, uint[] memory, uint256[] memory) {
        uint[] memory ids = new uint[](nextId);
        uint[] memory studentIds = new uint[](nextId);
        uint[] memory courseIds = new uint[](nextId);
        uint256[] memory dates = new uint256[](nextId);

        uint i = 0;
        for (uint j = 0; j < nextId; j++) {
            if (transactions[j].id == 0) continue;
            ids[i] = transactions[j].id;
            studentIds[i] = transactions[j].studentId;
            courseIds[i] = transactions[j].courseId;
            dates[i] = transactions[j].created;
            i++;
        }

        return (ids, studentIds, courseIds, dates);
    }
}
