# Bank Management System - Java

A simple **Bank Management System built using Java** that manages customers, bank accounts, transactions, and teller operations.

## Features

* Create bank accounts
* Search account by account number
* Deposit money
* Withdraw money
* Transfer money between accounts
* Check account balance
* View transaction history
* Manage bank teller information
* Display branch vault balance
* Track total transactions

## Technologies Used

* Java
* Java Collections
* HashMap
* ArrayList
* LocalDateTime

## Java Concepts Used

* Classes and Objects
* Encapsulation
* Constructors
* Getters and Setters
* JavaBean concepts
* Static variables
* Composition
* Collections
* Basic validation

## Project Structure

```text
Bank-Management-System-Java/
│
├── BankOperation.java
├── BankService.java
├── BankTeller.java
├── Customer.java
├── Account.java
└── Transaction.java
```

## How It Works

`BankOperation.java` is the main class that runs the application.

`BankService.java` handles the main banking operations such as account creation, account search, deposit, withdrawal, transfer, balance checking, and transaction history.

`HashMap` is used to store accounts using the account number as the key, while `ArrayList` is used to store transaction records.

`BankTeller.java` manages teller information and branch status.

## How to Run

1. Clone the repository.
2. Open the project in a Java IDE or terminal.
3. Compile all Java files:

```bash
javac *.java
```

4. Run the main class:

```bash
java BankOperation
```

## Author

**Anshika Jain**

B.Tech - Computer Science Engineering
