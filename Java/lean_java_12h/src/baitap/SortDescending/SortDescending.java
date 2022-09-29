package baitap.SortDescending;

import java.util.Scanner;

public class SortDescending {

    public static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents" + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortArray = new int[array.length];
        //duyet qua vong lap
        for (int i = 0; i < sortArray.length; i++) {
            sortArray[i] = array[i];
        }
        return array;
        
    }
}
