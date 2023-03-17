package Ontap2;

public class Stack {
    Node head;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNextNode(head);
            head = newNode;
        }
    }

    public void showStack() {
        System.out.println("Show Stack");
        Node current = head;
        while (current != null) {
            System.out.print(current.getData());
            current = current.getNextNode();
        }
    }
}
