const Student = artifacts.require('Student.sol')
module.exports = function(_deployer) {
    _deployer.deploy(Student)
};