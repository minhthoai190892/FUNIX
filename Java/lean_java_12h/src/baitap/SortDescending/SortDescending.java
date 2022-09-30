package baitap.SortDescending;

import java.util.Arrays;
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
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        // tạo 1 array có cùng kích thước với array củ
        // int[] sortArray = new int[array.length];
        // // duyet qua vong lap
        // for (int i = 0; i < sortArray.length; i++) {
        // // sao chép nội dung nằm trong array củ vào array mới
        // sortArray[i] = array[i];
        // } // !=> ta được một mảng "sortArray"
        int[] sortArray = Arrays.copyOf(array, array.length);
        // tiếp theo ta dùng vòng lập while
        // ta tạo biến "flag" kểu "boolean"
        boolean flag = true;
        // tạo biến tạm
        int temp;
        
        while (flag) {
            flag = false;
            for (int i = 0; i < sortArray.length - 1; i++) {
                if (sortArray[i] < sortArray[i + 1]) {
                    temp = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortArray;

    }
}
