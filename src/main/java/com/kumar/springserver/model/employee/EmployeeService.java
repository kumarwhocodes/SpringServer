package com.kumar.springserver.model.employee;

import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    
    private final EmployeeRepository repo;
    
    public Employee save(Employee employee) {
        return repo.save(employee);
    }
    
    public void delete(Employee employee) {
        repo.delete(employee);
    }
    
    public List<Employee> getAllEmployees() {
        // Convert Iterable to List using Guava's Lists.newArrayList()
        return Lists.newArrayList(Streamable.of(repo.findAll()));
    }
}
