package LinkedList;

public class DoublyEndedLists {
    private Node head;
    private Node tail;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {// => nút mới là nút đàu tiên
            this.head = newNode;
        }
        if (this.tail != null) {
            // thì nút mới sẽ trở thành "nextNode" của điểm "tail" hiện tại
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

    @Override
    public String toString() {
        return "DoublyEndedLists [head=" + head + ", tail=" + tail + "]";
    }

   
}
