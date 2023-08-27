package com.anupreeet.employeemanagementspringbootrestfulapi.service.impl;

import com.anupreeet.employeemanagementspringbootrestfulapi.model.Employee;
import com.anupreeet.employeemanagementspringbootrestfulapi.repository.EmployeeRepository;
import com.anupreeet.employeemanagementspringbootrestfulapi.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
