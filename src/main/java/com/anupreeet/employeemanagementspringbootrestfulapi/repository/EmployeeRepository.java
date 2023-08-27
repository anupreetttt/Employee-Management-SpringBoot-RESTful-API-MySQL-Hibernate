package com.anupreeet.employeemanagementspringbootrestfulapi.repository;

import com.anupreeet.employeemanagementspringbootrestfulapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
