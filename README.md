A monolithic Spring Boot application built with Java 21, MySQL, Spring Security, and JPA, implementing a secure banking wallet system.
Features include user registration, authentication with BCrypt password encryption, clean layered architecture, and REST APIs designed using industry best practices.
This project demonstrates real-world backend skills suitable for mid-level Java developer roles.

Tech Stack

Java 21 | Spring Boot | Spring Security | JPA/Hibernate | MySQL | Maven

🚀 **Features Implemented (So Far)**

👤 User Registration & Management
🔐 Authentication Module (Login)
🔑 Password Encryption using BCrypt
🛡️ Spring Security Integration
🗄️ MySQL Database with JPA/Hibernate
📦 Clean Package Structure (Controller, Service, Repository)
⚙️ Monolithic Architecture (Interview-friendly)

com.example.bankingwallet
│
├── auth
│   ├── AuthController
│   ├── AuthService
│   ├── JwtUtil
│
├── user
│   ├── User
│   ├── UserController
│   ├── UserRepository
│   ├── UserService
│
├── exception
│   └── GlobalExceptionHandler
│
└── BankingWalletApplication.java
