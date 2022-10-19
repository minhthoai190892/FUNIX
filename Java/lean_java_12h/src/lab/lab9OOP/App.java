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
        // Rectangle rectangle = new Rectangle(4, 5);
        // System.out.println("Area = "+rectangle.getArea());
        // System.out.println("Perimeter = "+rectangle.getPerimeter());
        System.out.println(
                "09.6. Object Oriented-Programming in Java-Bài tập Java OOP: tạo lớp Time để biểu diễn thời gian theo yêu cầu");
        // Time t = new Time(12, 1, 1);
        // t.display();
        // t.setTime(23, 59, 59);
        // t.display();
        // t.nextSecond();
        // t.display();
        // t.nextSecond();
        // t.display();
        // t.setTime(7, 0, 0);
        // t.display();
        // t.previousSecond();
        // t.display();
        System.out.println("09.7. Object Oriented-Programming in Java-Bài tập Java OOP: tạo lớp Point theo yêu cầu");
        // Point p1 = new Point(1.5, 6.7);
        // Point p2 = new Point(2.8, 3.2);
        // System.out.println(p1.distance(p2));
        // System.out.println(p1.distance(2.34, 7.8));
        System.out.println(
                "09.8. Object Oriented-Programming in Java-Bài tập Java OOP: tạo lớp Account giống như theo yêu cầu");

        Account account1 = new Account(1000, "Tuan", 2000);
        account1.display();
        account1.withdraw(2100);
        account1.deposit(600);
        System.out.println("Balance: " + account1.getbalance());
        account1.withdraw(2100);
        System.out.println("Balance: " + account1.getbalance());
    }

}