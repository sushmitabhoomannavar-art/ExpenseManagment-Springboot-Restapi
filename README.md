# Personal Expense Manager REST API

## Project Description

This project is a Spring Boot REST API that helps users manage their personal expenses. It allows users to add, view, filter, calculate, and delete expense records. The project uses Spring Boot, Spring Data JPA, and MySQL.

---

## Features

- Add a new expense
- View all expenses
- Filter expenses by category
- Calculate total expenses
- Calculate total expenses by category
- Delete an expense

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman
- Eclipse IDE

---

## Project Structure

```
src
 ├── controller
 │     └── ExpenseController.java
 ├── dao
 │     └── ExpenseDao.java
 ├── entity
 │     └── Expense.java
 ├── repository
 │     └── ExpenseRepository.java
 ├── service
 │     └── ExpenseService.java
 └── ExpenseManagerApplication.java
```

---

## Installation

### 1. Clone the repository

```bash
git clone https://github.com/your-username/expense-manager.git
```

### 2. Open the project

Import the project into Eclipse or IntelliJ as a Maven Project.

### 3. Create MySQL Database

```sql
CREATE DATABASE expense_db;
```

### 4. Configure Database

Update `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/expense_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 5. Install Dependencies

```bash
mvn clean install
```

---

## Run the Application

Run the Spring Boot application.

```
ExpenseManagerApplication.java
```

Or use Maven:

```bash
mvn spring-boot:run
```

The server starts on:

```
http://localhost:8089
```

(Change the port if your application uses a different one.)

---

## API Endpoints

### Add Expense

```
POST /expense
```

### View All Expenses

```
GET /expense
```

### Filter by Category

```
GET /expense/category/{category}
```

Example:

```
GET /expense/category/Food
```

### Calculate Total Expense

```
GET /expense/total
```

### Calculate Total Expense by Category

```
GET /expense/total/{category}
```

Example:

```
GET /expense/total/Food
```

### Delete Expense

```
DELETE /expense/{id}
```

Example:

```
DELETE /expense/101
```

---

## Sample Request

```json
{
    "title":"Groceries",
    "amount":1500.75,
    "category":"Food",
    "date":"2026-07-31"
}
```

---

## Sample Response

```json
{
    "id":101,
    "title":"Groceries",
    "amount":1500.75,
    "category":"Food",
    "date":"2026-07-31"
}
```

---

## Running Tests

You can test the REST APIs using **Postman**.

Or run Maven tests:

```bash
mvn test
```

Expected result:

- All tests should pass successfully.

---
<img width="953" height="537" alt="image" src="https://github.com/user-attachments/assets/0b069dfa-19ed-4e73-887d-9e4db8da3d2b" />
<img width="959" height="541" alt="image" src="https://github.com/user-attachments/assets/e57c9f5b-e2f5-471f-8baf-eea48e31d525" />



## Author

**Sushmita Bhoomannavar**
