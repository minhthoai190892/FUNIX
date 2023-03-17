package Sort;

import java.util.Arrays;

public class RadixSort {
    /**
     * lấy giá trị max của array
     * 
     * @param arr array
     * @param n   lenght array
     * @return max
     */
    public static int getMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static void countSort(int[] arr, int n, int exp) {
        int[] output = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        // lưu số lần xuất hiện trong mảng count
        for (int j = 0; j < n; j++) {
            count[arr[j] / exp % 10]++;
        }
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        // xây dựng output array
        for (i = n - 1; i >= 0; i--) {
            output[count[arr[i] / exp % 10] - 1] = arr[i];
            count[arr[i] / exp % 10]--;
        }
        // copy mảng output vào mảng arr[]
        for (int j = 0; j < n; j++) {
            arr[j] = output[j];
        }
    }
    public static void radixSort(int arr[],int n) {
        //tìm số lớn nhất
        int max= getMax(arr, n);
        for (int exp = 1; max/exp>0; exp*=10) {
            countSort(arr, n, exp);
        }
    }
    static void print(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args)
    {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n = arr.length;
  
        // Function Call
        radixSort(arr, n);
        print(arr, n);
    }
}
