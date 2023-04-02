package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
//    //get list Employee
//    List<Employee> findAll();
//    Employee findById(int theId);
//    Employee save(Employee  theEmployee);
//    void deleteById(int theId);
}
