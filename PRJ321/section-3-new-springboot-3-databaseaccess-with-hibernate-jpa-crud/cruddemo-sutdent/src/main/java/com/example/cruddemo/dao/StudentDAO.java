package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Student;

import java.util.List;

/**
 * b1. define dao interface
 */
public interface StudentDAO {
    /**
     * @param student
     */
    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByFirstName(String name);


    List<Student> findByEmail(String email);

    void update(Student student);
    int updateAllStudent();
    void delete(Integer id);
    int deleteAll();

}
