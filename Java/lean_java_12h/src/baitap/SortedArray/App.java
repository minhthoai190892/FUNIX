package baitap.SortedArray;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter capacity: ");
        int capacity = scanner.nextInt();
        int[] array = SortedArray.getIntegers(capacity);
        int[] sorted=SortedArray.sortArray(array);
        SortedArray.printArray(sorted);
        scanner.close();
    }
}
