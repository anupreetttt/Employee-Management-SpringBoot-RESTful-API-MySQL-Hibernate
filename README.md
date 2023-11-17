# Employee Management RESTful API

## Overview

This project implements a Serverless RESTful API for managing employee records. It is built using Java, Spring Boot, AWS (Lambda, API Gateway), MySQL, and Hibernate. The application follows a RESTful architecture and leverages AWS Lambda, API Gateway, Spring Boot, MySQL, and Hibernate to handle these operations in a serverless manner, ensuring scalability and efficient data management.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Functionalities](#functionalities)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Technologies Used

- Java: Programming language used for backend development.
- Spring Boot: Framework for building Java-based web applications.
- AWS (Lambda, API Gateway): Serverless computing and API management platform.
- MySQL: Database management system used for data storage.
- Hibernate: Object-Relational Mapping (ORM) tool for mapping Java classes to database tables.

## Functionalities Implemented

### EmployeeController

- Created a REST API for employee management with endpoints for creating, retrieving, updating, and deleting employee data.
- Utilized Spring's `@RestController` and `@RequestMapping` for API handling.
- Implemented CRUD operations for employees.

### Exception Handling

- Implemented custom exception handling for the resource not found scenario using `ResourceNotFoundException`.

### Employee Model

- Defined the structure of the employee data using the `Employee` class with relevant fields.

### EmployeeRepository

- Utilized Spring Data JPA's `JpaRepository` for database operations related to employees.

### EmployeeService

- Created an interface to define service methods for employee operations.

### EmployeeServiceImpl

- Implemented the service interface, providing functionalities to save, retrieve, update, and delete employee records.

### Project Startup

#### EmployeeManagementSpringBootResTfulApiApplication

- Main application class responsible for starting the Spring Boot application.


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
   git clone https://github.com/your-username/employee-management-api.git

2. **Build the Project:**
   ```bash
   cd employee-management-api
   ./mvnw clean install

3. **Run the Application:**
   ```bash
   ./mvnw spring-boot:run

## Testing

You can test the endpoints using Postman or CURL

## Usage
The application will be accessible at http://localhost:8080.
Use API endpoints mentioned in the Functionalities section.
