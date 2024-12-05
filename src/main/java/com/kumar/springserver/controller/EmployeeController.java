package com.kumar.springserver.controller;

import com.kumar.springserver.model.employee.Employee;
import com.kumar.springserver.model.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class EmployeeController {
    
    private final EmployeeService dao;
    
    @GetMapping("/")
    public String defaultPage() {
        return "Employee-Backend";
    }
    
    @GetMapping("/employee/get-all")
    public List<Employee> getAllEmployees() {
        return dao.getAllEmployees();
    }
    
    @PostMapping("/employee/save")
    public Employee save(@RequestBody Employee employee) {
        return dao.save(employee);
    }
    
    
}
