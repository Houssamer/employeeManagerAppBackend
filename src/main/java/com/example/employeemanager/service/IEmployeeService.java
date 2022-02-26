package com.example.employeemanager.service;

import com.example.employeemanager.exception.UserNotFoundException;
import com.example.employeemanager.model.Employee;

import java.util.Collection;

public interface IEmployeeService {
    Employee addEmployee(Employee employee);
    Collection<Employee> findAllEmployee();
    Employee updateEmployee(Employee employee);
    Employee findEmployee(Long id) throws UserNotFoundException;
    void deleteEmployee(Long id);
}
