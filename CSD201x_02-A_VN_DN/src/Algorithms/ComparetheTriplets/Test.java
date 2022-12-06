package Algorithms.ComparetheTriplets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số lượng phần tử: ");
            int n = scanner.nextInt();
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int item = scanner.nextInt();
                a.add(item);
            }
            List<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int item = scanner.nextInt();
                b.add(item);
            }
            System.out.println(a.toString());
            System.out.println(b.toString());
            System.out.println(compartTwoList(a, b));
        }
    }

    public static List<Integer> compartTwoList(List<Integer> a, List<Integer> b) {
        int counta = 0;
        int countb = 0;
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                counta++;
            } else if (a.get(i) < b.get(i)) {
                countb++;
            }
        }
        result.add(counta);
        result.add(countb);
        return result;

    }
}
