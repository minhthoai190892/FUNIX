package baitap.SortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[capacity];
        // duyệt qua mảng
        for (int i = 0; i < capacity; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        // Todo - copy lại mảng cũ
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        
        return sortedArray;

    }
}
