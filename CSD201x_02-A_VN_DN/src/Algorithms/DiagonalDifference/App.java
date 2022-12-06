package Algorithms.DiagonalDifference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> listArray = new ArrayList<>();
        // List<Integer> a = new ArrayList<>();
        // a.add(11);
        // a.add(2);
        // a.add(4);
        // List<Integer> b = new ArrayList<>();
        // b.add(4);
        // b.add(5);
        // b.add(6);
        // List<Integer> c = new ArrayList<>();
        // c.add(10);
        // c.add(8);
        // c.add(-12);
        // listArray.add(a);
        // listArray.add(b);
        // listArray.add(c);
        System.out.print("Enter number n: ");
        int n = scanner.nextInt();
        int item=0;
        for (int i = 0; i < n; i++) {
            List<Integer> aList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                item = scanner.nextInt();
                aList.add(item);
            }
            listArray.add(aList);
        }
        System.out.println(listArray.toString());
        System.out.println(diagonalDifference(listArray));

    }

    public static int diagonalDifference(List<List<Integer>> listArray) {
        // lấy độ dài mảng đầu tiên]
        int size = listArray.get(0).size();
        int sum1 = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    sum1 += listArray.get(i).get(j);
                }
            }
        }
        int sum2 = 0;
        int i = 0;
        int j = size - 1;
        while (i < size && j > -1) {
            sum2 += listArray.get(i).get(j);
            i++;
            j--;
        }
        int ans = Math.abs(sum1 - sum2);
        return ans;

    }
}
