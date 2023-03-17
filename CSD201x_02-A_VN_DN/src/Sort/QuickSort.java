package Sort;

public class QuickSort {
    /**
     * Vách ngăn
     * 
     * @param arr
     * @param low   vị trí bắt đầu
     * @param hight vị trí kết thúc
     * @return
     */
    public static int partition(int[] arr, int low, int hight) {
        // gia tri cuoi cua mang
        int pivot = arr[hight];
        // gia tri dau
        int i = low - 1;
        for (int j = low; j <= hight - 1; j++) {
            // kiem tra gia tri hien tai co nho hon pivot khong
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // swap(arr, i, j);
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[hight];
        arr[hight] = temp;
        // swap(arr, i + 1, hight);
        return i + 1;

    }

    public static void quickSort(int[] arr, int low, int hight) {
        if (low < hight) {
            // chỉ số phân vùng
            int pi = partition(arr, low, hight);
            // sắp xếp phần tử trước và sau phân vùng
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, hight);
        }
    }

    public static void display(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // static void swap(int[] arr, int i, int j) {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

         quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        display(arr, n);
    }
}
