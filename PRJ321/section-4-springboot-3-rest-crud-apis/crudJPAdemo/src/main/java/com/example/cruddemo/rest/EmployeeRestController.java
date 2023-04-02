package com.example.cruddemo.rest;

import com.example.cruddemo.entity.Employee;
import com.example.cruddemo.error.EmployeeNotFoundException;
import com.example.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    //declare field service
    private EmployeeService employeeService;
    //injection employee dao (constructor injection)

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //expose "/employeeList" and return a list of employees
    @GetMapping("/employeeList")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
    //add mapping for GET /employeeList/{employeeId}
    @GetMapping("/employeeList/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        //call service
        Employee theEmployee = employeeService.findById(employeeId);
//        if (theEmployee==null){
//            throw  new EmployeeNotFoundException("Employee id not found - "+employeeId);
//
//        }
        return theEmployee;
    }
    //add mapping for POST /employeeList - add new employee or update employee
    @PostMapping("/employeeList")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        //also just in case they pass an id in JSON ... set id to 0
        //this is to force a save of new item ... instead of update
        theEmployee.setId(0);
        Employee dbEmployee = employeeService.save(theEmployee);
        return  dbEmployee;
    }
    //add mapping for PUT /employeeList - update existing employee
    @PutMapping("/employeeList")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }
    //add mapping for DELETE /employeeList/{employeeId} -delete employee
    @DeleteMapping("/employeeList/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee employee= employeeService.findById(employeeId);
        //throw exception if null
//        if (employee==null){
//            throw  new EmployeeNotFoundException("Employee id not found - "+employeeId);
//
//        }
        employeeService.deleteById(employeeId);
        return "Delete employee id - "+employeeId;
    }

}
