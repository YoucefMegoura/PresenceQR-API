const Transaction = artifacts.require('Transaction.sol')
module.exports = function(_deployer) {
    _deployer.deploy(Transaction)
};