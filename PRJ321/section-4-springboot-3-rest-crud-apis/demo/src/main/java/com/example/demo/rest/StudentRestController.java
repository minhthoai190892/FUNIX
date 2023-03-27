package com.example.demo.rest;

import com.example.demo.entity.Student;
import com.example.demo.error.StudentErrorReponse;
import com.example.demo.error.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> students;
    //define @PostConstructor to load the student data ... only once!
    @PostConstruct
    public void loadData(){
        students = new ArrayList<>();
        students.add(new Student("Student 1","Student 1"));
        students.add(new Student("Student 2","Student 2"));
        students.add(new Student("Student 3","Student 3"));
        students.add(new Student("Student 4","Student 4"));
    }
    //define endpoint for "/students"
    @GetMapping("/students")
    public List<Student> studentList(){

        return  students;
    }
    //define endpoint or "/students/{studentId}" - return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        //check the studentId again list size
        if (studentId>=students.size()||studentId<0){
            throw  new StudentNotFoundException("Student Id not found - "+studentId);
        }
        return  students.get(studentId);
    }


}
