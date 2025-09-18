# Student Management API

A **Spring Boot RESTful API** for managing student records.  
This project demonstrates **full CRUD operations** with proper validation, error handling, and MySQL integration. It can serve as a backend for a student management system or learning project.

---

## **Table of Contents**

- [Overview](#overview)  
- [Features](#features)  
- [Technologies Used](#technologies-used)  
- [Database Design](#database-design)  
- [Project Structure](#project-structure)  
- [API Endpoints](#api-endpoints)  
- [Validation Rules](#validation-rules)  
- [Custom Error Handling](#custom-error-handling)  
- [Setup & Installation](#setup--installation)  
- [Testing](#testing)  
- [Future Enhancements](#future-enhancements)  
- [Author](#author)  

---

## **Overview**

This project implements a **Spring Boot backend** for managing students.  
It provides endpoints to:

- Add new students  
- Fetch all students  
- Fetch a student by ID or email  
- Update existing students  
- Delete students  

It uses **Spring Data JPA** (Hibernate) for database operations, **MySQL** for data persistence, and **REST APIs** for communication.  

---

## **Features**

- CRUD operations for student records  
- Validation on name, email, and age  
- Unique email constraint  
- Custom JSON-based error responses  
- Automatic table creation with Hibernate (`ddl-auto=update`)  
- Logging of SQL queries in console  

---

## **Technologies Used**

- Java 21  
- Spring Boot 3.3
- Spring Data JPA (Hibernate)
- Spring MVC
- MySQL 8  
- Maven  
- VS Code / IntelliJ IDEA  
- REST Client / Postman  

---

## **Database Design**

**Database:** `studentdb`  

**Table:** `students`

| Column | Type        | Constraints                       |
|--------|------------|-----------------------------------|
| id     | BIGINT     | Primary Key, Auto Increment        |
| name   | VARCHAR    | Not Null, 3–50 characters         |
| email  | VARCHAR    | Not Null, Unique, Valid Email     |
| age    | INT        | Not Null, Between 18–30           |

**Sample SQL:**
CREATE DATABASE IF NOT EXISTS studentdb;

CREATE TABLE IF NOT EXISTS students (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    age INT NOT NULL
);
## **Future Enhancements**

Add pagination & sorting for GET endpoints
Implement Spring Security for authentication and authorization:
Protect endpoints with role-based access (e.g., admin, user)
Use JWT token-based authentication for stateless security
Secure sensitive operations like POST, PUT, DELETE
Build a React frontend to consume API
Implement search by name or age range
Add logging and monitoring for production readiness

## Author

Dheerajpatel55
GitHub: https://github.com/Dheerajpatel55

```text
git clone https://github.com/Dheerajpatel55/Student-Management-API.git
cd Student-Management-API


