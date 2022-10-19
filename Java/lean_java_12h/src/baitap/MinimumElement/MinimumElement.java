package baitap.MinimumElement;

import java.util.Scanner;

public class MinimumElement {
    /**
     * create array
     * 
     * @param count number of elements
     * @return array
     */
    public static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);

        // tạo mảng với số lượng phần tử count
        int[] array = new int[count];
        // sử dụng vòng lặp "for" để gán các giá trị vào mảng
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            // gán giá trị người dùng nhập vào biến number
            int number = scanner.nextInt();
            // xóa "enter"
            scanner.nextLine();
            // đưa giá trị người dùng nhập vào mảng
            array[i] = number;
        }
        scanner.close();
        return array;

    }

    /**
     * 
     * 
     * @param array
     * @return min value
     */
    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            // ! [5, 4, 8, 9, 10]
            if (value < min) {
                min = value; // todo: min = array[i]
            }
        }

        return min;

    }
}
