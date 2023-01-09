package lab.Lab1va2;

import java.util.Scanner;

public class Lab2 {

    public Lab2() {
    }

    public void display(int[] a) {
        int lengthArray = a.length;
        for (int i = 0; i < lengthArray; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        // sort
        int length = b.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (b[j] > b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
            display(b);
        }
    }

    // public void selectionSort(int[] a) {
    // int n = a.length;
    // int[] b = new int[n];
    // for (int i = 0; i < n; i++) {
    // b[i] = a[i];
    // }

    // int lengthArray = b.length;
    // for (int i = 0; i < lengthArray - 1; i++) {
    // // tạo biến quản lý phần tử
    // int minIndex = i;
    // // duyệt mảng bắt đầu từ i+1;
    // for (int j = i + 1; j < lengthArray; j++) {
    // // kiểm tra 2 vị trí
    // if (b[j] < b[minIndex ]) {
    // // gán giá trị
    // minIndex = j;
    // }
    // }
    // // hoán vị
    // int temp = b[minIndex ];
    // b[minIndex ] = b[i];
    // b[i] = temp;
    // display(b);
    // }
    // }
    public void selectionSort(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }

        int lengthArray = b.length;
        for (int i = 0; i < lengthArray - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < lengthArray; j++) {
                if (b[j] < b[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = b[minIndex];
            b[minIndex] = b[i];
            b[i] = temp;
            display(b);
        }
    }

    // public void insertSort(int[] a) {
    // int n = a.length;
    // int[] b = new int[n];
    // for (int i = 0; i < n; i++) {
    // b[i] = a[i];
    // }
    // int lengthArray = b.length;
    // for (int i = 0; i < lengthArray; i++) {
    // int current = b[i];
    // int j = i - 1;
    // while (j >= 0 && b[j] > current) {
    // // đổi vị trí
    // b[j + 1] = b[j];
    // j--;
    // }
    // // đặt lại giá trị vào mảng
    // b[j + 1] = current;
    // display(b);
    // }
    // }
    public void insertSort(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        int lengthArray = b.length;
        for (int i = 0; i < lengthArray; i++) {
            int current = b[i];
            int j = i - 1;
            while (j >= 0 && b[j] > current) {
                b[j + 1] = b[j];
                j--;
            }
            b[j + 1] = current;
             display(b);
        }
    }

    public int search(int[] a, int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return value;
            }
        }
        return -1;
    }

    public int binarySearch(int[] a, int left, int right, int value) {

        if (left <= right) {
            int mid = left + ((right - left) / 2);
            if (a[mid] == value) {
                return mid;
            }
            if (a[mid] < value) {
                return binarySearch(a, mid + 1, right, value);
            } else {
                return binarySearch(a, left, mid - 1, value);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        // int[] array = { 2, 3, 4, 1, 76, 2, 3, 4 };
        // Lab2 lab2 = new Lab2();
        // System.out.println("Mang ban dau");
        // lab2.display(array);
        // System.out.println("Bubble Sort");

        // lab2.bubbleSort(array);
        // System.out.println("Selection Sort");
        // lab2.selectionSort(array);
        // System.out.println("Insertion Sort");
        // lab2.insertSort(array);
        // System.out.println("Linear Search");
        // int search = lab2.search(array, 762);
        // if (search != -1) {
        // System.out.println("found " + search);
        // } else {
        // System.out.println("not found");
        // }
        // System.out.println("Binary Search");

        // int lengthArray = array.length;
        // System.out.println(lab2.binarySearch(array, 0, lengthArray, 4));
        // System.out.println("========================");
        Scanner scanner = new Scanner(System.in);
        int n, choice;
        int[] array = { 2, 3, 4, 1, 76, 2, 3, 4 };
        int lengthArray = array.length;
        Lab2 lab2 = new Lab2();
        while (true) {
            System.out.println("\n Choose your option:");
            System.out.println("  1. Display data");
            System.out.println("  2. Selection sort");
            System.out.println("  3. Insertion sort");
            System.out.println("  4. Linear Search");
            System.out.println("  5. Binary Search");
            System.out.println("  0. Exit\n");
            System.out.print("  Your selection (0 -> 5): ");
            choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println(" Good bye, have a nice day!");
                break;
            }
            switch (choice) {
                case 1:
                    lab2.display(array);
                    break;
                case 2:
                    lab2.selectionSort(array);
                    break;
                case 3:
                   lab2.insertSort(array);
                    break;
                case 4:
                    System.out.println(lab2.search(array, 76) + " ");
                    break;
                    case 5:
                    System.out.println(lab2.binarySearch(array, 0,lengthArray, 76) + " ");
                    break;
                default:
                    System.out.println("**Invalid choice. Try again.**");
            }



        }

    }
}
