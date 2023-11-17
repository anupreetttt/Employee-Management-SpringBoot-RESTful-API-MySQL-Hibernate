# Employee Management RESTful API

## Overview

This project implements a Serverless RESTful API for managing employee records. It is built using Java, Spring Boot, AWS (Lambda, API Gateway), MySQL, and Hibernate.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Functionalities](#functionalities)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)

## Technologies Used

- Java
- Spring Boot
- AWS (Lambda, API Gateway)
- MySQL
- Hibernate

## Functionalities

1. **Create Employee Record:**
   - Endpoint: `POST /api/employees`
   - Create a new employee record by providing employee details (first name, last name, email).

2. **Retrieve Employee Records:**
   - Endpoint: `GET /api/employees`
   - Retrieve a list of all employee records.

3. **Retrieve Employee by ID:**
   - Endpoint: `GET /api/employees/{id}`
   - Retrieve details of a specific employee by providing the employee's ID.

4. **Update Employee Record:**
   - Endpoint: `PUT /api/employees/{id}`
   - Update an existing employee record by providing the updated details.

5. **Delete Employee Record:**
   - Endpoint: `DELETE /api/employees/{id}`
   - Delete an employee record by providing the employee's ID.

## Project Structure

The project follows a standard Spring Boot structure:

- `src/main/java/com.anupreeet.employeemanagementspringbootrestfulapi`: Contains Java source code.
- `src/main/resources`: Contains application properties.
- `src/test`: Contains test cases.

## Setup and Installation

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/employee-management-api.git https://github.com/anupreetttt/Employee-Management-SpringBoot-RESTful-API-MySQL-Hibernate.git

2. **Build the Project:**
   ```bash
   cd employee-management-api
   ./mvnw clean install

3. **Run the Application:**
   ```bash
   ./mvnw spring-boot:run


## Usage
The application will be accessible at http://localhost:8080.
Use API endpoints mentioned in the Functionalities section.
