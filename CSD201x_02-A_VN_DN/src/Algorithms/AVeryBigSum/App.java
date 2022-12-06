package Algorithms.AVeryBigSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("============ Array ============");
        long[] longarray = { 10001, 10002, 10003, 10004, 10005 };
        long sum = 0;
        for (int i = 0; i < longarray.length; i++) {
            sum += longarray[i];
        }
        System.out.println(sum);
        System.out.println("============ List ============");
        List<Long> listLong = new ArrayList<>();
        int n = scanner.nextInt();

        // thêm vào list
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            long item = scanner.nextLong();
            listLong.add(item);
        }
        System.out.println(aVeryBigSum(listLong));
    }

    public static Long aVeryBigSum(List<Long> listLong) {
        long sum = 0;
        for (int i = 0; i < listLong.size(); i++) {
            sum += listLong.get(i);
        }
        return sum;
    }
}
