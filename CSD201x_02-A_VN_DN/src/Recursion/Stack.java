package Recursion;

import java.util.Objects;

public class Stack {
    public Node head;

    public Stack() {
        this.head = null;
    }

    public void insertHead(int data) {
        Node newNode = new Node(data);
        if (Objects.isNull(this.head)) {
            this.head = newNode;
            return;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    public int length() {
        int length = 0;
        Node currentNode = this.head;
        while (Objects.nonNull(currentNode)) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    public void show() {
        Node currentNode = this.head;
        while (Objects.nonNull(currentNode)) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
    }

}
