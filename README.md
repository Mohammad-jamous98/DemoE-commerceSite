# 🛒 AutomationFinaleProject-April

This project is an automated end-to-end test suite for an e-commerce demo site using **Selenium WebDriver**, **TestNG**, and **Java**, with data integration from a **MySQL** database.

## 📌 Project Overview

This automation framework covers:

- 🔍 Searching for products
- 🛍️ Adding random available items to the shopping cart
- 🔄 Handling "Out of Stock" scenarios
- 🧾 Proceeding through the checkout process
- 🔐 Login/Signup using real test data from MySQL
- 💵 Completing order with "Cash on Delivery" option

## ⚙️ Tech Stack

- **Java 17**
- **Selenium WebDriver 4.31.0**
- **TestNG 7.11.0**
- **MySQL Connector/J 9.3.0**
- **Maven** (Build Tool)

## 🗃️ Database

The project connects to a local MySQL database `classicmodels` to retrieve user credentials and other personal data for login/registration steps.

```sql
SELECT * FROM customers WHERE customerNumber = 555;
```

## 📁 Project Structure

```
└── src
    └── test
        └── java
            └── DemoE_commerceSite
                └── DemoE_commerceSite
                    ├── AppTest.java      # Main test cases (search, cart, checkout)
                    └── MySetup.java      # (Optional) Setup utilities
```

## 🧪 How to Run

1. Make sure **MySQL** is running and contains a `classicmodels` database with valid test data.
2. Clone this repo:
   ```bash
   git clone https://github.com/your-username/AutomationFinaleProject-April.git
   ```
3. Navigate to the project:
   ```bash
   cd AutomationFinaleProject-April
   ```
4. Run tests with Maven:
   ```bash
   mvn clean test
   ```

## 📸 Features Covered

| Feature               | Status         |
| --------------------- | -------------- |
| Product Search        | ✅ Implemented |
| Random Product Add    | ✅ Implemented |
| Out of Stock Handling | ✅ Implemented |
| Cart Navigation       | ✅ Implemented |
| User Login/Signup     | ✅ Implemented |
| Checkout & Payment    | ✅ Implemented |

## 🧠 Author

Developed by **Mohammad Jamous** – Junior QA Engineer passionate about automation and real-world testing scenarios.

---

> ✅ For any bugs, suggestions, or contributions, feel free to open an issue or pull request.
