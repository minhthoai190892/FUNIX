package lab.lab9OOP;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("09.1. Bài tập java oop: tạo các setter, getter, constructor");

        // System.out.print("Enter your Id: ");
        // int id = scanner.nextInt();
        // scanner.nextLine();
        // System.out.print("Enter your Name: ");
        // String name = scanner.nextLine();

        // System.out.print("Enter your Age: ");
        // int age = scanner.nextInt();
        // scanner.nextLine();
        // System.out.print("Enter your Name: ");
        // String address = scanner.nextLine();

        // Person person = new Person(id, name, age, address);

        // System.out.println("Id: " + person.getId());
        // System.out.println("Name: " + person.getName());
        // System.out.println("Age: " + person.getAge());
        // System.out.println("Address: " + person.getAddress());

        System.out.println(
                "09.2. Object Oriented-Programming in Java-Bài tập java oop: tạo các setter, getter, constructor cho lớp Rectangle");
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Area = "+rectangle.getArea());
        System.out.println("Perimeter = "+rectangle.getPerimeter());
    }
}