package com.amazon.demo.service;

import com.amazon.demo.model.Employee;
import com.amazon.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    private static List<Employee> employeeList = new ArrayList<>();

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee getEmployeeByID(Long id) {
        Optional<Employee> opt = repository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new RuntimeException("No Records found with id " + id);
        }
    }

    @Override
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return repository.save(employee);
    }
}
