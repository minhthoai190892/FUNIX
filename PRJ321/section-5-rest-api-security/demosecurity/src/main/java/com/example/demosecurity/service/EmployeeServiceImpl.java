package com.example.demosecurity.service;

import com.example.demosecurity.entity.Employee;
import com.example.demosecurity.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;
@Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
    Optional<Employee> result = employeeRepository.findById(id);
    Employee employee = null;
    if (result.isPresent()){
        employee = result.get();
    }else {
        throw new RuntimeException("Employee id not found - "+id);
    }
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(int id) {
    employeeRepository.deleteById(id);

    }
}
