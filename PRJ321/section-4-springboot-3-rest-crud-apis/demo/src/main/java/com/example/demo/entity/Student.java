package com.example.demo.entity;

public class Student {
    private String fristName;
    private String lastName;

    public Student() {
    }

    public Student(String fristName, String lastName) {
        this.fristName = fristName;
        this.lastName = lastName;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
