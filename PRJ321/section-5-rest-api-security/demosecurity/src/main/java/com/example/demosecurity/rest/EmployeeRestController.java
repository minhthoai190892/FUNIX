package com.example.demosecurity.rest;

import com.example.demosecurity.entity.Employee;
import com.example.demosecurity.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;
    @Autowired

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId){
        Employee employee = employeeService.findById(employeeId);
        return  employee;
    }
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
    employee.setId(0);
    Employee dbEmployee = employeeService.save(employee);
    return  dbEmployee;
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee dbEmployee1 = employeeService.save(employee);
        return dbEmployee1;
    }
    @DeleteMapping("/employees/{employeeId}")
    public String delete(@PathVariable int employeeId){
        employeeService.delete(employeeId);
        return "Deleted employee id - "+employeeId;
    }
}
