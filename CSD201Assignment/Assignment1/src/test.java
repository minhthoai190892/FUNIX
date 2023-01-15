import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        float[] array = { 9, 3, 5, 6, 1, 2, 4 };

        int lengthArray = array.length;
        int[] a = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            a[i] = ((int)array[i]);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        // for (int i = 0; i < lengthArray - 1; i++) {
        // for (int j = 0; j < lengthArray - i - 1; j++) {
        // if (array[j] > array[j + 1]) {
        // int temp = array[j];
        // array[j] = array[j + 1];
        // array[j + 1] = temp;
        // }
        // }
        // System.out.println();
        // for (int j = 0; j < lengthArray; j++) {
        // System.out.print(array[j] + " ");
        // }
        // }

    }
}
