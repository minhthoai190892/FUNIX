package lab1;

public class LinkedList {
    Node head;

    public void insertHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNexNode(head);
            head = newNode;
        }
    }

    public int length() {
        int leng = 0;
        Node curren = head;
        while (curren != null) {
            leng++;
            curren = curren.getNexNode();
        }
        return leng;
    }
}
