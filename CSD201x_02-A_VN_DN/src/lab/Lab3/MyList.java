package lab.Lab3;


import java.util.Objects;

public class MyList {

    Node head, tail;

    MyList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void clear() {
        head = tail = null;
    }

    public void addTail(int x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        }
        if (this.tail != null) {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void visit(Node p) {
        System.out.print(p.getInfo() + "  ");
    }

    void traverse() {
        Node curren = this.head;
        while (Objects.nonNull(curren)) {
            System.out.print(curren.getInfo() + " ");
            curren = curren.getNext();
        }

    }

    void addMany(int[] a) {
        for (int i = 0; i < a.length; i++) {

            Node newNode = new Node(a[i]);
            if (isEmpty()) {
                this.head = newNode;
                this.tail = newNode;
            }
            if (this.tail != null) {
                this.tail.setNext(newNode);
                this.tail = newNode;
            }
        }
    }

    public int search(int value) {
        int count = 0;
        Node currentNode = this.head;
        while (Objects.nonNull(currentNode)) {
            if (currentNode.getInfo() > value) {
                // System.out.println(count + " " + currentNode);
                return count;
            }
            count++;
            currentNode = currentNode.getNext();
        }
        return -1;
    }

}
