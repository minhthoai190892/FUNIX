package Sort;

public class MergeSort {
    /*
     * Hợp nhất 2 mảng con lại arr[]
     * mảng con 1 là mảng arr[l...m]
     * mảng con 2 là mảng arr[m+1...r]
     * l = left
     * m = mid
     * r = right
     */
    public static void merge(int[] arr, int l, int m, int r) {
        // tìm kích thước của 2 mảng con được hợp nhất
        int n1 = m - l + 1;
        int n2 = r - m;
        // tạo 2 mảng tạm
        int[] L = new int[n1];
        int[] R = new int[n2];
        // copy dữ liệu cho 2 mảng tạm
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; ++i) {
            R[i] = arr[m + 1 + i];
        }
        // merge 2 mảng con lại
        // độ dài ban đâu của mang
        int i = 0, j = 0;
        // chỉ số ban đầu của mảng con hợp nhất
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // sao chép phần tử của mảng L[] nếu còn.
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        // sao chép phần tử của mảng R[] nếu còn.
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            // tìm vị trí ở giũa
            int mid = l + (r - l) / 2;
            // sắp xếp nữa đầu và nữa sau
            sort(arr, l, mid);
            sort(arr, mid + 1, r);
            // hợp nhất 2 mảng lại
            merge(arr, l, mid, r);
        }
    }

    public static void printArray(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
 
        System.out.println("Given Array");
        printArray(arr);
 
        // MergeSort ob = new MergeSort();
        // ob.sort(arr, 0, arr.length - 1);
        sort(arr, 0, arr.length-1);
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
