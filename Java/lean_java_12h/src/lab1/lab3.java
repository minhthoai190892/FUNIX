package lab1;

import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("=============== 3.1. Nhập xuất dữ liệu cơ bản trong Java
        // ============");
        // System.out.println("Enter your name: ");
        // String name = scanner.nextLine();
        // System.out.println("Hello " + name);

        // System.out.println(
        // "=============== 3.2. Bài tập Java cơ bản: tính tổng 2 số được nhập vào từ
        // bàn phím ============");
        // System.out.println("Enter number a: ");
        // int a = Integer.parseInt(scanner.nextLine());
        // System.out.println("Enter number b: ");
        // int b = Integer.parseInt(scanner.nextLine());
        // System.out.println("Result: " + (a + b));

        // System.out.println(
        // "=============== 3.3. Bài tập Java cơ bản: hiển thị tuổi của một người sau 15
        // năm ============");
        // System.out.println("Enter your name: ");

        // String name = scanner.nextLine();
        // System.out.println("Enter age: ");
        // int age = Integer.parseInt(scanner.nextLine());
        // System.out.println("In 15 years, age of " + name + " will be " + (age + 15));

        System.out.println(
                "=============== 3.4. Bài tập Java cơ bản: hiển thị ký tự tiếp theo trong bảng chữ cái ============");

        System.out.println("Enter char: ");
        char input = (char) (scanner.next().charAt(0) + 1);
        System.out.println(input);

        scanner.close();

    }
}
