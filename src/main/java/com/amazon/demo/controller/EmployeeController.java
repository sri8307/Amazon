package com.amazon.demo.controller;

import com.amazon.demo.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    //handler method
    @GetMapping("/employees")
    public String getAllEmployees() {
        return "Employee Information";
    }

    @GetMapping("/employee/{id}")
    public String getEmployee(@PathVariable("id") int id) {
        return "Employee by ID :" + id;
    }

    @PostMapping("/addEmployee")
    public String saveEmployee(@RequestBody Employee employee) {
        return "Employee Saved Successfully!" + employee;
    }

    @PutMapping("/updateEmployee/{id}")
    public String updateEmployee(@PathVariable String id,@RequestBody Employee employee) {
        return "Employee Saved Successfully!" + employee;
    }

    @GetMapping("/employee")
    public String deleteEmployee(@RequestParam("id") String id) {
        return "Employee deleted with ID :" + id;
    }
}
