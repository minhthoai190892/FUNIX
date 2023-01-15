package lab.Lab3;

import java.util.List;
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

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long sum = 0;
        // arr.sort(null);
        for (Integer in : arr) {
            sum += in;
         
        }
        System.out.println((sum - arr.get(arr.size() - 1)) + " " + (sum - arr.get(0)));
    }

}
