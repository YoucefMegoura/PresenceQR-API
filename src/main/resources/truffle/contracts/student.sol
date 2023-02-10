pragma solidity ^0.8.0;

contract Student {
    struct StudentInfo {
        uint id;
        string name;
        uint age;
        string studentAddress;
        uint256 dateOfAdmission;
    }

    uint nextId;
    mapping (uint => StudentInfo) public students;

    function addStudent(string memory _name, uint _age, string memory _studentAddress, uint256 _dateOfAdmission) public {
        StudentInfo memory student = StudentInfo({
        id: nextId,
        name: _name,
        age: _age,
        studentAddress: _studentAddress,
        dateOfAdmission: _dateOfAdmission
        });
        students[nextId++] = student;
    }

    function removeStudent(uint _id) public {
        delete students[_id];
    }

    function updateStudent(uint _id, string memory _name, uint _age, string memory _studentAddress, uint256 _dateOfAdmission) public {
        students[_id].name = _name;
        students[_id].age = _age;
        students[_id].studentAddress = _studentAddress;
        students[_id].dateOfAdmission = _dateOfAdmission;
    }

    function getStudent(uint _id) public view returns (string memory, uint, string memory, uint256) {
        StudentInfo storage student = students[_id];
        return (student.name, student.age, student.studentAddress, student.dateOfAdmission);
    }
}
