package baitap.ReverseArray;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = { 1, 5, 3, 7, 11, 9, 15 };
        System.out.println("Array = " + Arrays.toString(array));
        //
        ReverseArray.reverse(array);
        System.out.println("Reverse array = " + Arrays.toString(array));
        System.out.println("====");
       
    }
}
