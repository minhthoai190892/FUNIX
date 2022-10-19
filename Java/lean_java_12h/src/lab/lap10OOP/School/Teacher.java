package lab.lap10OOP.School;

import java.security.Principal;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println("Salary " + salary);
    }

}
