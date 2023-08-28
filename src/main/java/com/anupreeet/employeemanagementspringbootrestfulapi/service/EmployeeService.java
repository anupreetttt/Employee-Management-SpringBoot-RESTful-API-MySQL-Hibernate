package com.anupreeet.employeemanagementspringbootrestfulapi.service;

import com.anupreeet.employeemanagementspringbootrestfulapi.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee getEmployeeByID(long id);
    Employee updateEmployee(Employee employee, long id);
}
