package baitap.MinimumElement;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        // tạo mảng và gọi hàm
        int[] returnedArray = MinimumElement.readIntegers(count);
        int minValue = MinimumElement.findMin(returnedArray);
        System.out.println("Minimum value of array is: " + minValue);
        System.out.println(Arrays.toString(returnedArray));
        scanner.close();

    }
    
}
