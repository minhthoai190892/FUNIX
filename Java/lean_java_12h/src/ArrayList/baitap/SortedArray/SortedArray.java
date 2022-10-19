package ArrayList.baitap.SortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    /**
     * @param capacity Số lượng phần tử của mảng
     * @return một mảng
     */
    public static int[] array(int capacity) {
        try (Scanner scanner = new Scanner(System.in)) {
            // khai báo mảng vói tham số "capacity"
            int[] array = new int[capacity];
            System.out.println("Enter " + capacity + " integer values:\r");
            // sử dụng vòng lập "for" để thêm các phần tử vào mảng
            for (int i = 0; i < array.length; i++) {
                // câu lệnh thêm phần tử vào mảng
                array[i] = scanner.nextInt();
            }
            return array;
        }

    }

    public static void printArray(int[] array) {
        // sử dụng vòng lặp "for" để in các phần tử của mảng
        for (int index = 0; index < array.length; index++) {
            System.out.println("Element " + index + " is " + array[index]);
        }
    }

    /**
     * 
     * @param array nhận vào một array
     * @return
     */
    public static int[] sortedArray(int[] array) {
        // ! cach 1
        // // khai báo một mảng mới bằng với độ dài mảng cũ
        // int[] sortedArray = new int[array.length];
        // // sử dụng vòng lặp "for" để copy các phần tử từ array cũ
        // for (int i = 0; i < array.length; i++) {
        // // copy phần tử từ array cũ
        // sortedArray[i] = array[i];
        // }
        // ! cach 2
        // sử dụng phương thức "copyOf" của "Array" để copy nội dung ở mãng cũ
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
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
