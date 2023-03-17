package Ontap;

public class LinkedList {
    Node head;
    Node tail;

    public void insertHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNextNode(head);
            head = newNode;
        }
    }
    public void insertTail(int data) {
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
            tail = newNode;
        }
        if (tail!=null) {
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    public int length() {
        int leng = 0;
        Node current = this.head;
        while (current != null) {
            leng++;
            current = current.getNextNode();
        }
        return leng;
    }

    public void show() {
        System.out.println("Show list");
        Node current = this.head;
        while (current != null) {
            System.out.print(current.getData()+" ");
            current= current.getNextNode();
        }
    }
    public void deleteHead() {
        this.head = this.head.getNextNode();
    }
}
