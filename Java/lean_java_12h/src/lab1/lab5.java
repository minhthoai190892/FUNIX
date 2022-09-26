package lab1;

import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("====== 5.1. Bài tập Java cơ bản: viết phương thức trả về
        // số lớn nhất trong 3 số =======");
        // System.out.println("Enter number a:");
        // int a = Integer.parseInt(scanner.nextLine());
        // System.out.println("Enter number b:");
        // int b = Integer.parseInt(scanner.nextLine());
        // System.out.println("Enter number c:");
        // int c = Integer.parseInt(scanner.nextLine());
        // System.out.println("so lon nhat: " + max3(a, b, c));

        // System.out.println("====== 5.2. Bài tập Java cơ bản: viết phương thức trả về
        // chu vi của hình tròn =======");
        // System.out.println("Enter number r: ");
        // double r = Double.parseDouble(scanner.nextLine());
        // System.out.println("circumference: " + circumference(r));

        // System.out.println("====== 5.3. Bài tập Java cơ bản: viết phương thức đệ quy
        // trả về n! =======");
        // System.out.println("Enter number n:");
        // int n = Integer.parseInt(scanner.nextLine());
        // System.out.println(factorial(n));

        /*
         * System.out.println(
         * "====== 5.4. Bài tập Java cơ bản: viết phương thức đệ quy trả về tổng các số lẻ từ 1 tới n. ======="
         * );
         * System.out.println("Enter number n:");
         * int n = Integer.parseInt(scanner.nextLine());
         * System.out.println("sum: " + sum(n));
         * 
         */

        System.out.println(
                "========= 5.5. Bài tập Java cơ bản: viết phương thức đệ quy tính tổng các phần tử của mảng. ======");
        System.out.println("nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];// tạo mảng
        for (int i = 0; i < n; i++) { // duyệt mảng với i< "số lượng phần tử mảng"
            arr[i] = scanner.nextInt();//thêm vào mảng
        }
        System.out.print(sumOfArray(arr, n));

        scanner.close();

    }

    // System.out.println("====== 5.1. Bài tập Java cơ bản: viết phương thức trả về
    // số lớn nhất trong 3 số =======");

    // public static int max3(int a, int b, int c) {
    // if (a >= b && a >= c) {
    // return a;
    // } else if (b >= c) {
    // return b;
    // }
    // return c;
    // }

    // System.out.println("====== 5.2. Bài tập Java cơ bản: viết phương thức trả về
    // chu vi của hình tròn =======");
    public static double circumference(double r) {

        return 2 * r * 3.14;

    }

    // System.out.println("====== 5.3. Bài tập Java cơ bản: viết phương thức đệ quy
    // trả về n! =======");
    public static int factorial(int n) {
        if (n == 1) { // kiểm tra n = 1 thì trả về giá trị 1
            return 1;
        }
        // trả về giá trị của n
        return n * factorial(n - 1);

    }

    // System.out.println("====== 5.4. Bài tập Java cơ bản: viết phương thức đệ quy
    // trả về tổng các số lẻ từ 1 tới n. =======");
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {// =>số chẳn
            return sum(n - 1);// => giảm đi 1 đơn vị
        } else {
            return n + sum(n - 1);
        }
    }

    // System.out.println("========= 5.5. Bài tập Java cơ bản: viết phương thức đệ
    // quy tính tổng các phần tử của mảng. ======");
    public static int sumOfArray(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        return arr[n - 1] + sumOfArray(arr, n - 1);
    }

}
