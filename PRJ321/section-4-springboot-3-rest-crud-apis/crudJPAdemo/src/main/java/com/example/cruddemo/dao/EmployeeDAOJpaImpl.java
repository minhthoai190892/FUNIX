//package com.example.cruddemo.dao;
//
//import com.example.cruddemo.entity.Employee;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class EmployeeDAOJpaImpl implements EmployeeDAO {
//    //define field for EntityManager
//    private EntityManager entityManager;
//
//    //set up constructor injection
//
//    public EmployeeDAOJpaImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    public List<Employee> findAll() {
//        //create a query
//        TypedQuery<Employee> typedQuery = entityManager.createQuery("from Employee", Employee.class);
//        //execute query and get result list
//        List<Employee> employeeList = typedQuery.getResultList();
//        //return the result
//        return employeeList;
//    }
//
//    @Override
//    public Employee findById(int theId) {
//        //get employee
//        Employee theEmployee = entityManager.find(Employee.class, theId);
//        //return employee
//        return theEmployee;
//    }
//
//    @Override
//    public Employee save(Employee theEmployee) {
//        //save employee
//        Employee dbEmployee = entityManager.merge(theEmployee);
//        //return the dbEmployee
//        return dbEmployee;
//    }
//
//    @Override
//    public void deleteById(int theId) {
//        //get employee
//        Employee theEmployee = entityManager.find(Employee.class, theId);
//        //remove employee
//        entityManager.remove(theEmployee);
//    }
//}
