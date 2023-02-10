const Course = artifacts.require('Course.sol')
module.exports = function(_deployer) {
    _deployer.deploy(Course)
};