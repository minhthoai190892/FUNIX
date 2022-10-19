package ArrayList.baihoc;

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = array(5);
        // hien values trong array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " is " + myArray[i]);
        }
        System.out.println("Average is " + getAverage(myArray));
    }

    public static int[] array(int number) {
        System.out.println("Enter " + number + " integer values.");
        // khai bao mang
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;

    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
