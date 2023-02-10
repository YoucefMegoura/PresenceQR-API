const SimpleStorage = artifacts.require('SimpleStorage.sol')
module.exports = function(_deployer) {
    _deployer.deploy(SimpleStorage)
};