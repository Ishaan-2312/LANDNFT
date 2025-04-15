# 🏞️ Land NFT Registration System

A Spring Boot + Web3j backend that interacts with an Ethereum smart contract to register and transfer **land ownership as NFTs**.

## 🔧 Tech Stack

- **Backend**: Java + Spring Boot
- **Blockchain**: Solidity Smart Contract (ERC721)
- **Web3 Integration**: Web3j
- **Security**: Spring Security + BCrypt
- **Database**: H2 / MySQL (configurable)
- **Smart Contract Deployment**: Remix IDE (Sepolia Testnet)

## 💡 Features

- Register users with wallet address and roles
- Role-based authentication (USER, REGISTRAR, SUPER_ADMIN)
- Register land as NFTs on-chain
- Transfer land NFTs between addresses
- Password hashing & secure authentication

-Works with MetaMask wallet on Sepolia Testnet

-Web3j connects using Infura/Alchemy + Private Key (set in env/properties)

-Make sure the contract is deployed and Java wrappers are generated via web3j

## 📄 Smart Contract Overview

```solidity
// LandOwnershipNFT.sol
function registerLand(string memory _location, string memory _landId) public;
function transferLand(address _to, uint256 _tokenId) public;
function getLandOwner(uint256 _tokenId) public view returns (address);


 
 
