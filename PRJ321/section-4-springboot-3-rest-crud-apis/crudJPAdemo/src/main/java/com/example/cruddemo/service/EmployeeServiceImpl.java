package com.example.cruddemo.service;

import com.example.cruddemo.dao.EmployeeRepository;
import com.example.cruddemo.entity.Employee;
import com.example.cruddemo.error.EmployeeNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    //create field dao
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //constructor injection


    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {

        Optional<Employee> result = employeeRepository.findById(theId);
        Employee employee = null;
        if (result.isPresent()){
            employee = result.get();
        }else {
            throw  new EmployeeNotFoundException("did not find employee id - "+theId);
        }
        return employee;
    }

    @Override

    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Override

    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);

    }
}
