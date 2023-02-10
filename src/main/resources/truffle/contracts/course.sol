pragma solidity ^0.8.0;

contract Course {
    struct CourseInfo {
        uint id;
        string name;
        uint creditHours;
        uint256 startDate;
    }

    uint nextId;
    mapping (uint => CourseInfo) public courses;

    function addCourse(string memory _name, uint _creditHours, uint256 _startDate) public {
        CourseInfo memory course = CourseInfo({
        id: nextId,
        name: _name,
        creditHours: _creditHours,
        startDate: _startDate
        });
        courses[nextId++] = course;
    }

    function removeCourse(uint _id) public {
        delete courses[_id];
    }

    function updateCourse(uint _id, string memory _name, uint _creditHours, uint256 _startDate) public {
        courses[_id].name = _name;
        courses[_id].creditHours = _creditHours;
        courses[_id].startDate = _startDate;
    }

    function getCourse(uint _id) public view returns (string memory, uint, uint256) {
        CourseInfo storage course = courses[_id];
        return (course.name, course.creditHours, course.startDate);
    }

    function getAllCourses() public view returns (uint[] memory, string[] memory, uint[] memory, uint256[] memory) {
        uint[] memory ids = new uint[](nextId);
        string[] memory names = new string[](nextId);
        uint[] memory creditHours = new uint[](nextId);
        uint256[] memory dates = new uint256[](nextId);

        uint i = 0;
        for (uint j = 0; j < nextId; j++) {
            if (courses[j].id == 0) continue;
            ids[i] = courses[j].id;
            names[i] = courses[j].name;
            creditHours[i] = courses[j].creditHours;
            dates[i] = courses[j].startDate;
            i++;
        }

        return (ids, names, creditHours, dates);
    }
}
