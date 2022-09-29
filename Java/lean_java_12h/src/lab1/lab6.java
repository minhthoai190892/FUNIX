package lab1;

import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= 6.1. Bài tập về vòng lặp trong Java: tính tổng các số từ n về -5 =========");
        /**
         * Task
         * Write a program that accepts an integer n from the user then displays all
         * numbers from n to -n in descending order.
         */
        // System.out.println("Enter number ");
        // int n = Integer.parseInt(scanner.nextLine());
        // for (int i = n; i >= -n; i--) {
        // System.out.println(i + " ");
        // }
        System.out.println("======= 6.2. Bài tập về vòng lặp trong Java: tính tổng các số từ a tới b =========");
        /**
         * Task
         * Write a program that accepts two integers a and b from the user and displays
         * the sum of all the numbers from a to b on the screen:
         */
        // System.out.println("Enter number a ");
        // int a = Integer.parseInt(scanner.nextLine());
        // System.out.println("Enter number b ");
        // int b = Integer.parseInt(scanner.nextLine());
        // int sum = 0;
        // for (int i = a; i <= b; i++) {
        // sum += i;
        // }
        // System.out.println(sum);
        System.out.println(
                "======= 6.3. Bài tập về vòng lặp trong Java: hiển thị ra màn hình các số chia hết cho 3 từ a tới b =========");
        /**
         * Task
         * Write a program that accepts two integers a and b from the user and prints
         * all the numbers from a to b, which are divisible by 3:
         */
        // System.out.println("Enter number a ");
        // int a = Integer.parseInt(scanner.nextLine());
        // System.out.println("Enter number b ");
        // int b = Integer.parseInt(scanner.nextLine());

        // for (int i = a; i <= b; i++) {
        // if (i % 3 == 0) {
        // System.out.print(i + " ");

        // }
        // }
        System.out.println("======= 6.4. Bài tập về vòng lặp trong Java: tính n giai thừa =========");
        /**
         * Task
         * Write a program that accepts an integer n from the user and displays the
         * result of n! on the screen.
         */
        // System.out.print("Enter number n ");
        // int n = Integer.parseInt(scanner.nextLine());
        // int answer = 1;
        // for (int i = 1; i <= n; i++) {
        // answer *= i;
        // }
        // System.out.println(answer);

        System.out.println("======= 6.5. Vòng lặp while trong Java =========");
        /**
         * Task
         * Write a program that accepts an integer n from the user and prints all even
         * numbers from n to 100 on the screen.
         */
        // System.out.print("Enter number n ");
        // int n = Integer.parseInt(scanner.nextLine());
        // while (n <= 100) {
        // if (n % 2 == 0) {
        // System.out.print(n + " ");
        // }
        // n++;
        // }
        System.out
                .println("======= 6.6. Bài tập Java cơ bản: đếm số ước của một số được nhập vào từ bàn phím =========");
        /**
         * Task
         * Write a program that accepts an integer n from the user then prints all
         * divisors of n on the screen.
         */
        // System.out.print("Enter number n ");
        // int n = Integer.parseInt(scanner.nextLine());
        // int i = 1;
        // int answer = 0;
        // while (i <= n) {
        // // kiem tra n co % cho i khong
        // if (n % i == 0) {
        // answer++;
        // System.out.print(i + " ");
        // }

        // i++;

        // }
        // System.out.println();
        // System.out.println(answer);
        System.out.println(
                "======= 6.7. Bài tập Java cơ bản: tính tổng các số chia hết cho 3 và 5 trong đoạn [a,b] =========");
        // System.out.print("Enter number a ");
        // int a = Integer.parseInt(scanner.nextLine());
        // System.out.print("Enter number b ");
        // int b = Integer.parseInt(scanner.nextLine());
        // while (a <= b) {
        // if (a % 3 == 0 && a % 5 == 0) {
        // System.out.print(a + " ");
        // }
        // a++;
        // }
        System.out.println("======= 6.8. Bài tập Java cơ bản: In ra các số từ a đến b theo định dạng =========");
        // for (int i = 1; i <= 10; i++) {
        // for (int j = 1; j <= 10; j++) {
        // System.out.print(i * j + " ");
        // }
        // System.out.println();
        // }
        // int count = 0;
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // System.out.print(count + " ");
        // count += 1;
        // }
        // System.out.println();
        // }
        System.out.println("======= 6.9. Vòng lặp do-while trong Java =========");
        // int n = 1;
        // do {
        // System.out.print(n + " ");
        // n++;
        // } while (n <= 5);
        // System.out.println("======= 6.10. Bài tập về vòng lặp do-while trong Java
        // =========");
        // int i = 1;
        // do {
        // if (i % 10 == 0) {
        // System.out.print(i + " ");

        // }i++;
        // } while (i <= 1000);
        System.out.println(
                "======= 6.11. Bài tập xử lý chuỗi trong Java: tìm vị trí xuất hiện của một ký tự trong một xâu =========");
        // System.out.print("Enter String ");
        // String s = scanner.nextLine();
        // System.out.print("Enter char ");
        // char c = scanner.nextLine().charAt(0);
        // int answer = 0;
        // for (int i = 0; i < s.length(); i++) {
        // if (s.charAt(i) == c) {
        // answer = i;
        // break;
        // } else {
        // answer = -1;
        // }
        // }
        // System.out.println(answer);
        System.out.println(
                "======= 6.12. Bài tập về xử lý xâu trong Java: chuyển các ký tự in thường sang in hoa =========");
        System.out.print("Enter String 1: ");
        String s1 = scanner.nextLine();
        s1 = s1.toLowerCase();
        System.out.print("Enter String 2: ");
        String s2 = scanner.nextLine();
        s2 = s2.toLowerCase();
        System.out.println(s1.indexOf(s2));
        scanner.close();
    }

}
