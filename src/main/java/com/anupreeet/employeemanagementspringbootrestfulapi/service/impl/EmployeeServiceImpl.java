package com.anupreeet.employeemanagementspringbootrestfulapi.service.impl;

import com.anupreeet.employeemanagementspringbootrestfulapi.exception.ResourceNotFoundException;
import com.anupreeet.employeemanagementspringbootrestfulapi.model.Employee;
import com.anupreeet.employeemanagementspringbootrestfulapi.repository.EmployeeRepository;
import com.anupreeet.employeemanagementspringbootrestfulapi.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByID(long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        } else {
            throw new ResourceNotFoundException("Employee", "ID", id);
        }
    }
}
