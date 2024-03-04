package com.example.springexercises.controller;

import com.example.springexercises.model.Employee;
import com.example.springexercises.servis.EmployeeServis;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeServis employeeServis;

    @GetMapping("/employee/all")
    public List<Employee> getEmployees() {
        return employeeServis.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeServis.getEmployee(id);
    }

    @PostMapping("/add_employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeServis.addEmployee(employee);
    }
    @PutMapping("/update_employee/{id}")
    public Employee updateEmployeeById(@PathVariable Long id, @RequestBody Employee employee) {
        return  employeeServis.updateEmployee(id, employee);
    }
}
