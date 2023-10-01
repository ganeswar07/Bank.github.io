

# Banking System Project

## Overview

The Banking System Project is a simple Java application that simulates a basic banking system. It allows users to create new accounts, log in with existing accounts, and perform various banking operations such as checking balance, withdrawing, depositing, and viewing the transaction history.

## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
  - [New User Registration](#new-user-registration)
  - [Existing User Login](#existing-user-login)
  - [Banking Operations](#banking-operations)
- [Project Structure](#project-structure)
- [Contributing](#contributing)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/ganeswar07/Banking-System.git
   cd Banking-System
   ```

2. Compile the Java files:
   ```bash
   javac com/bank/*.java
   ```

3. Run the main class:
   ```bash
   java com.bank.Main
   ```

## Usage

### New User Registration

1. Select option 1 for New User when prompted.
2. Enter your first name, last name, and other required details.
3. The system will generate an account number, user ID, and password.
4. Make note of these details for future logins.

### Existing User Login

1. Select option 2 for Existing User when prompted.
2. Enter your user ID and password when prompted.

### Banking Operations

1. After logging in, you will have various options:
   - A: Check Balance
   - B: Withdraw
   - C: Deposit
   - D: Passbook
   - E: Account Detail
   - F: Logout

2. Follow the on-screen instructions to perform the desired banking operation.

## Project Structure

- `com.bank`: Package containing Java files for the banking system.
  - `Main.java`: Main class serving as the entry point.
  - `Login.java`: Class handling user login and registration.
  - `BankAccount.java`: Class representing a user's bank account.
  - `NewUser.java`: Class for new user registration.
  - `ExistingUser.java`: Class for existing user login.
  - `BankingMenu.java`: Class for displaying the banking menu.

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.





## Contact Me

If you have any questions, suggestions, or feedback, feel free to contact me through [GitHub](https://github.com/ganeswar07).

