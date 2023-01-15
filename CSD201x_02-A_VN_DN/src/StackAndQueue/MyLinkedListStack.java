package StackAndQueue;

import java.util.ArrayList;
import java.util.Objects;

public class MyLinkedListStack implements IStackAndQueue {
    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    Node topNode;

    public MyLinkedListStack() {
        this.topNode = null;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {

            // thêm một phần tử vào đầu(head) của linked list
            // tạo node mới
            Node newNode = new Node(value);
            // trỏ đuôi của node mới vào head hiện tại (topNode)
            newNode.next = topNode;
            // gán lại head mới bằng node mới
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        // lấy giá trị đầu của linked list
        int value = topNode.value;
        // sau khi lấy xong ta chuyển head vào vị trí tiếp theo làm head
        topNode = topNode.next;
        return value;
    }

    @Override
    public boolean isFull() {

        return false;
    }

    @Override
    public boolean isEmpty() {
        // rỗng khi topNode trỏ vào null
        return topNode == null;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = topNode;
        // in linked List
        // while (Objects.nonNull(temp)) {
        // System.out.print(temp.value+" ");
        // temp = temp.next;
        // }

        ArrayList<Integer> arrayList = new ArrayList<>();
        while (Objects.nonNull(temp)) {
            arrayList.add(temp.value);
            temp = temp.next;
        }
        //in xuôi danh sách
        // for (int i = 0; i < arrayList.size(); i++) {
        //     System.out.print(arrayList.get(i) + " ");
        // }
        //in ngược danh sách
        for (int i = arrayList.size()-1; i >=0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }

}
