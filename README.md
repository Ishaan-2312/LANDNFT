Land NFT Ownership System

Overview
This project is a Land NFT Registration and Transfer System, where land ownership is tokenized as NFTs (Non-Fungible Tokens) on the Ethereum blockchain.
It enables property owners to mint NFTs representing their land, list properties for sale, and transfer ownership through smart contracts securely, reducing the need for intermediaries.
The backend is built using Spring Boot and interacts with the Ethereum blockchain through Web3j.

Features

Mint Land NFTs: Register land ownership on-chain by minting NFTs.

Transfer Ownership: Secure land transfer by transferring the associated NFT.

Track Geolocation: Each land NFT is linked to location metadata (longitude, latitude, address).

Database Integration: Land and transaction details are stored off-chain in a relational database.

Smart Contract Interaction: Direct communication with the deployed smart contract on Ethereum.

List Lands for Sale: Sellers can list their land NFTs on a marketplace endpoint.

Technologies Used

Java 17

Spring Boot

Web3j (Ethereum blockchain interaction)

PostgreSQL or MySQL (Database)

Solidity (Smart Contract)

Remix IDE (for Smart Contract deployment)

Sepolia Testnet (for testing)

Project Structure

Smart Contract: Solidity file for minting and transferring NFTs.

Backend (Spring Boot):

LandController: APIs for registering, listing, and transferring lands.

LandService: Business logic for land operations.

LandRepository: JPA repository for database operations.

Web3Service: Ethereum smart contract interaction.

Entity classes: Land, LandTransfer, etc.

How It Works

Register Land:
Owner submits land details (name, location, size, etc.). Backend mints a new NFT using the smart contract and records it in the database.

List for Sale:
Owner can list the land NFT on the marketplace. Details like price and seller contact are saved.

Transfer Ownership:
Upon sale, backend triggers a smart contract call to transfer the NFT. Ownership records are updated on blockchain and database.

Setup Instructions

Clone the Repository:
GitHub link: [Insert Your Repo Link Here]

Smart Contract Deployment:

Use Remix IDE.

Deploy the LandNFT.sol contract to Sepolia Testnet.

Save the contract address and ABI.

Spring Boot Application Setup:

Update application.properties with:

Infura or Alchemy URL

Wallet private key

Contract address

Run mvn clean install.

Start the application using mvn spring-boot:run.

Database:

Set up PostgreSQL or MySQL.

Configure connection details in application.properties.

API Endpoints

POST /api/land/register: Register a new land and mint NFT.

GET /api/land/all: Fetch all registered lands.

POST /api/land/list-for-sale: List a land NFT for sale.

POST /api/land/transfer: Transfer NFT ownership.

GET /api/land/{id}: Get details of a land by ID.

Smart Contract Key Functions

mintLandNFT(address owner, string memory metadataURI): Mint new land NFT.

transferLandNFT(address from, address to, uint256 tokenId): Transfer land NFT between owners.

tokenURI(uint256 tokenId): Retrieve metadata of a land NFT.

Future Enhancements

Integrate Frontend (React.js or Vue.js) for land listing.

Add payment integration (Crypto or Fiat).

Add support for fractional land ownership.

Implement auction-based sales for NFTs.

License

This project is licensed under the MIT License.


