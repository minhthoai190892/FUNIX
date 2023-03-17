package Ontap;

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
    public void pop() {
        this.head = head.getNextNode();
    }
    public void show() {
        System.out.println("show Stack");
        Node current = this.head;
        while (current!=null) {
            System.out.print(current.getData()+" ");
            current = current.getNextNode();
        }
    }
}
