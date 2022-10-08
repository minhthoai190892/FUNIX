package lab.labOOP;

import java.util.Scanner;

public class Student {
    String name;
    int age;

    public void getInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.close();
    }

    public void display() {
        System.out.println("Your name is " + name + " and age is " + age);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
