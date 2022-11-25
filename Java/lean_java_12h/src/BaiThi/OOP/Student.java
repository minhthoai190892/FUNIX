package BaiThi.OOP;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public void display() {
        System.out.println("Name " + name);
        System.out.println("Age "+age);
    }
    public void getInformation() {
        Scanner scanner = new Scanner(System.in);
         name = scanner.nextLine();
         age = scanner.nextInt();
    }
}
