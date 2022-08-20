package com.amazon.demo.service;

import com.amazon.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee saveEmployee(Employee employee);

    Employee getEmployeeByID(Long id);

    void deleteEmployee(Long id);

    Employee updateEmployee(Employee employee);
}
