package com.amazon.demo.controller;

import com.amazon.demo.model.Employee;
import com.amazon.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //handler method
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") Long id) {

        return employeeService.getEmployeeByID(id);
    }

    @PostMapping("/addEmployee")
    public Employee saveEmployee(@Valid @RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/updateEmployee/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/remove")
    public void deleteEmployee(@RequestParam("id") Long id) {
        employeeService.deleteEmployee(id);
    }
}
