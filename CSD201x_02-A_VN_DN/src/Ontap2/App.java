package Ontap2;

import Algorithms.CountSameElement.a;

public class App {
    public static void main(String[] args) {
        int[] array = { 5, 2, 1, 4, 7, 9, 6, 3 };
        show(array);
        // bubbleSor(array);
        // show(array);
        // selectionSort(array);
        // show(array);
        insertSort(array);
        show(array);
        int x = binarySeach(array, 0, array.length - 1, 70);
        if (x == -1) {
            System.out.println("not found");
        } else {

            System.out.println(x);
        }

        System.out.println("Linked List");
        LinkedList linkedList = new LinkedList();
        // linkedList.insertHead(10);
        // linkedList.insertHead(10);
        // linkedList.insertHead(10);
        // linkedList.insertHead(10);

        // linkedList.insertTail(222);
        // linkedList.insertTail(222);
        // linkedList.insertTail(222);
        // linkedList.insertTail(222);
        // linkedList.insertTail(222);
        // linkedList.insertTail(222);
        // System.out.println(linkedList.length());
        // System.out.println("Convert to binary");
        Stack stack = new Stack();
        convertTobinary(stack, 5);
        stack.showStack();
    }

    private static int convertTobinary(Stack stack, int i) {
        if (i == 0) {
            return 1;
        }
        stack.push(i % 2);
        return convertTobinary(stack, i/2);
    }

    public static int binarySeach(int[] array, int left, int right, int x) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == x) {
                return mid;
            }
            if (array[mid] < x) {
                return binarySeach(array, mid + 1, right, x);
            } else {
                return binarySeach(array, left, mid - 1, x);
            }
        }
        return -1;

    }

    private static void insertSort(int[] array) {
        int n = array.length;
        System.out.println("Insert sort");
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    private static void selectionSort(int[] array) {
        System.out.println("Selection SOrt");
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    private static void show(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void bubbleSor(int[] array) {
        System.out.println("bubble Sort");
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
