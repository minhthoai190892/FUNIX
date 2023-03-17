package Heap;

import java.util.Currency;
import java.util.Scanner;
import java.util.zip.ZipEntry;

public class MyHeap {
    private int MAX_SIZE = 100000;
    private int[] arr = new int[MAX_SIZE + 1];
    private int size;

    public MyHeap() {
        this.size = 0;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Error: Heap is empty!");
            return -1;
        }
        return arr[1];
    }

    private void swap(int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // minheap cha luôn nhỏ hơn con
    public void add(int v) {
        // tăng số lượng lên 1;
        size++;
        // them vao
        arr[size] = v;
        // heapify up (từ dưới lên)
        int currentIndex = size;
        int parentindex = currentIndex / 2;
        while (parentindex != 0 && arr[parentindex] > arr[currentIndex]) {
            // đổi chỗ
            swap(parentindex, currentIndex);
            currentIndex = parentindex;
            parentindex = currentIndex / 2;

        }
    }

    public int poll() {
        if (isEmpty()) {
            System.out.println("Error: Heap is empty!");
            return -1;
        }
        // lay gia tri min
        int minRoot = arr[1];
        arr[1] = arr[size];
        // heapify-down
        // chuyen phan tu cuoi len dau
        size--;

        heapifyDown(1);
        return minRoot;
    }

    private void heapifyDown(int currentIndex) {

        while ((2 * currentIndex) <= size) {
            int leftChildIndex = 2 * currentIndex;
            int rightChildIndex = leftChildIndex + 1;

            int smallerChiidIndex = leftChildIndex;
            if (rightChildIndex <= size && arr[rightChildIndex] < arr[leftChildIndex]) {
                smallerChiidIndex = rightChildIndex;

            }
            if (arr[currentIndex] > arr[smallerChiidIndex]) {
                swap(currentIndex, smallerChiidIndex);
                currentIndex = smallerChiidIndex;

            } else {
                break;
            }
        }
    }

    public void remove(int v) {
        int currentIndex = -1;
        for (int i = 1; i <= size; i++) {
            if (arr[i] == v) {
                currentIndex = i;
                break;
            }

        }
        if (currentIndex == -1) {
            System.out.println("Error: Element is not exist");
            return;
        }
        // gan vi tri cuoi cung vao vi tri bi xoa
        arr[currentIndex] = arr[size];
        size--;
        heapifyDown(currentIndex);

    }

    public static void main(String[] args) {
        MyHeap myHeap = new MyHeap();
        // myHeap.add(10);
        // myHeap.add(5);
        // myHeap.add(1);
        // myHeap.add(6);
        // System.out.println("Peek " + myHeap.peek());
        // myHeap.remove(1);
        // System.out.println("Peek " + myHeap.peek());
        // while (myHeap.isEmpty() == false) {
        // System.out.println(myHeap.poll());
        // }
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        while (q > 0) {
            int t = scanner.nextInt();
            if (t == 1) {
                myHeap.add(scanner.nextInt());
            } else if (t == 2) {
                myHeap.remove(scanner.nextInt());
            } else {
                System.out.println(myHeap.peek());
            }
            q--;
        }
    }

}
