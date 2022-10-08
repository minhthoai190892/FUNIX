package lab;

import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) throws Exception {
        // System.out.println("========== 4.1. Mệnh đề if else trong Java
        // ===================");
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter numbrer n: ");
        // int n = Integer.parseInt(scanner.nextLine());
        // if (n % 2 == 0) {
        // System.out.println("n is an even number");
        // } else {
        // System.out.println("n is an odd number");

        // }

        // System.out.println(
        // "========== 4.2. Bài tập Java cơ bản: kiểm xem 3 số có tạo thành dãy tăng
        // hoặc giảm hay không ===================");
        // int a, b, c;
        // System.out.println("Enter numbrer a: ");
        // a = Integer.parseInt(scanner.nextLine());
        // System.out.println("Enter numbrer b: ");
        // b = Integer.parseInt(scanner.nextLine());

        // System.out.println("Enter numbrer c: ");
        // c = Integer.parseInt(scanner.nextLine());
        // // check increasing
        // if (a <= b && b <= c) {
        // System.out.println("increasing");

        // } else if (a >= b && b >= c) {
        // System.out.println("decreasing");

        // } else {
        // System.out.println("neither increasing nor decreasing order");

        // }

        /*
         * Task
         * Given two integers x and y where x and y are not equal to 0. Determine in
         * which quadrant the point (x, y) lies.
         */
        // int x, y;
        // System.out.println("Enter number x: ");
        // x = Integer.parseInt(scanner.nextLine());
        // System.out.println("Enter number y: ");

        // y = Integer.parseInt(scanner.nextLine());
        // if (x == 0 && y == 0) {
        // System.out.println("input error");
        // } else if (x > 0 && y > 0) {
        // System.out.println("This point lies in the First quadrant");
        // } else if (x < 0 && y > 0) {
        // System.out.println("This point lies in the Second quadrant");

        // } else if (x < 0 && y < 0) {
        // System.out.println("This point lies in the Third quadrant");

        // } else if (x > 0 && y < 0) {
        // System.out.println("This point lies in the Fourth quadrant");

        // }

        /*
         * Task
         * Write a program that accepts the test score of a student (knowing that the
         * valid score is greater than or equal to 0 and less than or equal to 10) from
         * the user and checks whether the entered score is valid or not.
         */
        // int score;
        // System.out.println("Enter score: ");
        // int score = Integer.parseInt(scanner.nextLine());
        // System.out.println(score);
        // if (score >= 0 && score <=10) {
        // System.out.println("The score is valid");
        // } else {
        // System.out.println("The score is not valid");
        // }

        /*
         * Task
         * Write a program that accepts three integers from the user and prints the
         * biggest number among them on the screen.
         */
        // int a, b, c;
        // System.out.println("Enter number a: ");
        // a = Integer.parseInt(scanner.nextLine());
        // System.out.println("Enter number a: ");
        // b = Integer.parseInt(scanner.nextLine());
        // System.out.println("Enter number a: ");
        // c = Integer.parseInt(scanner.nextLine());
        // if (a > b && a > c) {
        // System.out.println(a);
        // } else if (b > a && b > c) {
        // System.out.println(b);

        // } else if (c > a && c > b) {
        // System.out.println(c);

        // } else {
        // System.out.println("a=b=c");

        // }
        /*
         * Task
         * Write a program that accepts an integer a from the user then checks whether a
         * is in the range [10, 100] or not.
         * 
         * If a is in the range [10, 100], print the following line on the screen:
         */
        // int a;
        // System.out.println("Enter number a: ");
        // a = Integer.parseInt(scanner.nextLine());
        // if (a>=10 && a<=100) {
        // System.out.println("a is in the range [10, 100]");
        // } else {
        // System.out.println("a is not in the range [10, 100]");

        // }
        /*
         * Task
         * Write a program that accepts two integers a and b from the user then checks
         * whether both a and b are not equal to zero or not.
         */
        int a, b;
        System.out.println("Enter number a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number b: ");
        b = Integer.parseInt(scanner.nextLine());
        if (a != 0 && b != 0) {
            System.out.println("a is not equal to 0 and b is not equal to 0");
        } else {
            System.out.println("a is equal to 0 or b is equal to 0");
        }
        scanner.close();

    }
}
