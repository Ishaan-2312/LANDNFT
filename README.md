# 🌍 Land NFT Registry System – Blockchain-Powered Land Ownership

A next-gen decentralized **Land Ownership Platform** built with **Spring Boot** and **Solidity**, where every land record is securely stored as an **NFT** on the Ethereum blockchain. This ensures **transparency**, **authenticity**, and **tamper-proof** land transfers — backed by a powerful **AI chatbot** to guide users throughout the process!

---

## 🚀 Why This Project?

Traditional land registration systems are plagued with fraud, loss of documents, and lack of transparency. This project eliminates all of that by:

- Minting land ownership as **ERC721 NFTs**
- Ensuring only authorized registrars can register lands
- Tracking every transfer and ownership on-chain
- Providing an **AI-powered chatbot** to assist users in real-time

---

## 🔧 Tech Stack

| Layer | Tools |
|------|-------|
| **Backend** | Java, Spring Boot |
| **Smart Contract** | Solidity (ERC721 Standard) |
| **Blockchain** | Ethereum Sepolia Testnet |
| **Web3 Integration** | Web3j |
| **Database** | MySQL / H2 |
| **Security** | Spring Security + JWT |
| **AI Assistant** | Gemini API (Chatbot for user guidance) |

---

## 💡 Key Features

✅ Register land as unique NFTs  
✅ Role-based access: `USER`, `REGISTRAR`, `SUPER_ADMIN`  
✅ Transfer ownership between wallet addresses  
✅ Integrated **AI chatbot** for guidance and support  
✅ Web3 connectivity via Web3j + Infura  
✅ Password hashing with BCrypt  
✅ On-chain verification of ownership

---

## 🤖 AI Chatbot for Help

We’ve integrated **Google Gemini (LLM)** to power a chatbot that can:

- Guide users through land registration steps
- Explain how NFTs represent land ownership
- Assist registrars with proper procedures
- Answer questions in **Hindi + English**

🎯 No more confusion — every user has a helpful AI assistant.

---

## 📄 Smart Contract Summary (`LandOwnershipNFT.sol`)

```solidity
function registerLand(string memory _location, string memory _landId) public;
function transferLand(address _to, uint256 _tokenId) public;
function getLandOwner(uint256 _tokenId) public view returns (address);

 
 
