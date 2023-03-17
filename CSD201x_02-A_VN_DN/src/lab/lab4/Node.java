package lab.lab4;

public class Node {
    Person info;
    Node next;

    Node(Person x, Node p) {
        info = x;
        next = p;
    }

    Node(Person x) {
        this(x, null);
    }

    @Override
    public String toString() {
        return "Node [info=" + info + ", next=" + next + "]";
    }

}
