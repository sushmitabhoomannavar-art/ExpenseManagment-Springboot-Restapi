# AInotes.md

# AI Notes – Personal Expense Manager REST API

## Project
Spring Boot REST API for Personal Expense Manager

---

## 1. Which parts of the code were AI-generated vs. written by me

### AI-generated
The following code was initially suggested by AI:

- Project structure
- Expense entity class
- Repository interface extending JpaRepository
- Service layer methods
- REST Controller endpoints
- MySQL dependencies (pom.xml)
- application.properties configuration
- CRUD API endpoint design
- Repository custom method:
  ```java
  List<Expense> findByCategory(String category);
  ```
- Logic to calculate:
  - Total expenses
  - Total expenses by category
- Sample JSON for testing APIs

### Written/Modified by me

I wrote and modified the project in Eclipse by:

- Creating all packages and Java classes
- Writing the code manually instead of copy-pasting everything
- Configuring the project and database
- Running the application
- Testing all APIs using Postman
- Creating MySQL database
- Adding expense records
- Fixing compilation errors
- Changing endpoint URLs according to my project
- Implementing ID generation starting from 101
- Returning JSON response for total expense using Map

---

## 2. What I validated, tested, or changed in the AI output, and why

I verified each API using Postman.

### Changes made

- Changed ID generation according to project requirement.
- Corrected repository methods.
- Corrected controller mapping URLs.
- Fixed syntax errors suggested by AI.
- Changed the total expense response from:

```json
3021.25
```

to

```json
{
   "totalExpense": 3021.25
}
```

because JSON object responses are easier to understand and follow REST API best practices.

Similarly, for category total:

```json
{
   "category":"Food",
   "totalExpense":1821.25
}
```

I also tested:

- POST /expense
- GET /expense
- GET /expense/category/{category}
- GET /expense/total
- GET /expense/total/{category}
- DELETE /expense/{id}

All APIs returned the expected results.

---

## 3. AI suggestions I decided not to use

I did not use some AI suggestions because they were unnecessary for my project.

Examples:

- Lombok annotations (@Data, @Getter, @Setter)
  - I used normal getter and setter methods for better understanding.

- DTO classes
  - My project is small, so returning entities and Map responses was sufficient.

- Advanced exception handling
  - Not required for the basic CRUD assignment.

- Returning only a numeric value for total expense.
  - I changed it to a JSON object because it is more readable.

---

## Summary

AI helped me understand the project structure, repository methods, service logic, REST endpoints, and testing process.

I manually implemented the code, tested each endpoint using Postman, corrected errors, modified responses where required, and verified that the application worked correctly.
