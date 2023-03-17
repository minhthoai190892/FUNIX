package lab.lab5;

import java.util.Objects;

public class MyStack {
    Node head;
    // Khởi tạo Stack

    public MyStack() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Hàm thêm giá trị vào Stack
     * 
     * @param x
     */
    public void push(int x) {

        Node newNode = new Node(x);
        if (isEmpty()) {
            this.head = newNode;
            return;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    /**
     * Tính độ dài Stack
     * 
     * @return
     */
    public int length() {
        int length = 0;
        Node currentNode = this.head;
        while (Objects.nonNull(currentNode)) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    /**
     * Hàm hiển thị danh sách Stack
     */
    public void showStack() {
        Node currentNode = this.head;
        while (Objects.nonNull(currentNode)) {
            System.out.print(currentNode.getInfo() + " ");
            currentNode = currentNode.getNext();
        }
    }

    /**
     * Hàm lấy ra một Node trong Stack
     * 
     * @return
     */
    public int pop() {
        int value = this.head.getInfo();
        this.head = head.getNext();
        return value;
    }

    public void convertToBinary(int x) {
        int binary[] = new int[40];
        int index = 0;
        while (x > 0) {
            binary[index++] = x % 2;
            x = x / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public Node find(int value) {
        Node currentNode = this.head;
        while (Objects.nonNull(currentNode)) {
            if (currentNode.getInfo() == value) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public static int convertToBinary(MyStack stack, int number) {

        // điều kiện kết thúc hàm
        if (number == 0) {
            return 1;
        }
        // thêm số dư vào Stack
        stack.push(number % 2); // 31/2 =15 dư 1
        // lấy thương (15) chia tiếp
        return convertToBinary(stack, number / 2);
    }

}
