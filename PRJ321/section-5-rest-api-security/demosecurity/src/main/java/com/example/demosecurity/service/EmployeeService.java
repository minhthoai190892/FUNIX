package com.example.demosecurity.service;

import com.example.demosecurity.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
     Employee findById(int id);
     Employee save(Employee employee);
    void delete(int id);
}
