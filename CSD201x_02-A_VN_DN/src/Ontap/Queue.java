package Ontap;

public class Queue {
    Node head, tail;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        if (tail != null) {
            this.tail.setNextNode(newNode);
            tail = newNode;
        }
    }
    public void pop() {
        this.head = this.head.getNextNode();
    }
    public void show() {
        System.out.println("Show Queue");
        Node current = this.head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNextNode();
        }
    }
}
