package Ontap2;

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
        if (head == null) {
            head = tail = newNode;
        }
        if (tail != null) {
            this.tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    public int length() {
        int lenght = 0;
        Node current = head;
        while (current != null) {
            lenght++;
            current = current.getNextNode();
        }
        return lenght;
    }
}
