package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDAO  {
    //get list Employee
    List<Employee> findAll();
    Employee findById(int theId);
    Employee save(Employee  theEmployee);
    void deleteById(int theId);
}
