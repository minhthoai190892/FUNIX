package Sort.bubbleSort;

import java.util.Scanner;

public class bubbleSort {
    private Scanner scanner = new Scanner(System.in);
    public int[] arrayBubbleSort(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
        
    }
    public int[] sortArray(int[] array) {
        int lengthArray = array.length; 
        for (int i = 0; i < lengthArray-1; i++) {
            for (int j = 0; j < lengthArray -i -1; j++) {
                if (array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }
    public void showArray(int[] array) {
        int lengthArray = array.length;
        for (int i = 0; i < lengthArray; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
