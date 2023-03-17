package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
//import org.springframework.transaction.annotation.Transactional;

/**
 * b2. define Dao implementation
 *
 * @implNote @Repository giúp hỗ trợ quét thành phần và cũng xử lý hỗ trợ Spring cho bản dịch ngoại lệ
 */
@Repository
public class StudentDAOImpl implements StudentDAO {
    //define field for entity manager
    private EntityManager entityManager;

    //inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement save method
    @Override
    @Transactional
    public void save(Student student) {
    entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        //create query
        TypedQuery<Student> theQuery = entityManager.createQuery("from Student order by lastName", Student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByFirstName(String name) {
        //create query
        TypedQuery theQuery = entityManager.createQuery("from Student where firstName=:theFirstName",Student.class);
    //set up parameters
        theQuery.setParameter("theFirstName",name);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByEmail(String email) {
        TypedQuery typedQuery = entityManager.createQuery("from Student where email like :email", Student.class);
        typedQuery.setParameter("email","%"+email+"%");
        return typedQuery.getResultList();
    }
}
