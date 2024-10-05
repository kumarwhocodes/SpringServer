package com.kumar.springserver.model.employee;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDao {

    @Autowired
    private EmployeeRepository repo;

    public Employee save(Employee employee){
        return repo.save(employee);
    }

    public void delete(Employee employee){
        repo.delete(employee);
    }

    public List<Employee> getAllEmployees() {
        // Convert Iterable to List using Guava's Lists.newArrayList()
        return Lists.newArrayList(Streamable.of(repo.findAll()));
    }
}
