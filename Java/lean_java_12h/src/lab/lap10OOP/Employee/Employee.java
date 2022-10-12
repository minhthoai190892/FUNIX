package lab.lap10OOP.Employee;

import java.security.Principal;

public class Employee {
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name is " + name);
        System.out.println("Salary is " + salary);
    }
}
