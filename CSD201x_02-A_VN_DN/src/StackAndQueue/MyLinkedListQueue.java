package StackAndQueue;

import java.util.Objects;

public class MyLinkedListQueue implements IStackAndQueue {
    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    // tạo biến head và tail
    Node headNode, tailNode;

    public MyLinkedListQueue() {
        this.headNode = null;
        this.tailNode = null;
    }

    @Override
    public boolean push(int value) {
        if (isFull()) {
            return false;
        }
        Node newNode = new Node(value);
        if (isEmpty()) {
            // danh sách rỗng cả head và tail điều trỏ vào node mới
            headNode = tailNode = newNode;
        } else {
            // gán đuôi của tail node vào node mới
            tailNode.next = newNode;
            // sau đó gán node mới bằng tail(điểm cuối)
            tailNode = newNode;
        }
        return true;
    }

    @Override
    public int pop() {

        if (isEmpty()) {
            return -1;
        }
        // gán value là giá trị của head trong danh sách
        int value = headNode.value;
        // kiểm tra danh sách chỉ có 1 node (head và tail cùng trỏ vào 1 node)
        if (headNode == tailNode) {
            headNode = tailNode = null;// reset
        } else {
            // cập nhật lại head của danh sách
            headNode = headNode.next;
        }
        return value;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        // khi cả 2 trỏ vào null
        return (headNode == null && tailNode == null);
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
       Node currentNode = headNode;
        while (Objects.nonNull(currentNode)) {
            System.out.print(currentNode.value+" ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

}
