package LinkedList;

public class DoublyEndedLists {
    private Node head;
    private Node tail;

    public void insertAtHead(int data) {
        // tạo đối tượng "newNode"
        Node newNode = new Node(data);
        // để đối tượng "newNode" trỏ đên head hiện tại
        newNode.setNextNode(this.head);
        // sau đó để "head" của "Linked List" trỏ tới đối tượng "newNode"
        this.head = newNode;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {// => nút mới là nút đàu tiên
            this.head = newNode;
            this.tail = newNode;
        }
        if (this.tail != null) {
            // thì nút mới sẽ trở thành "nextNode" của điểm "tail" hiện tại
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

    @Override
    public String toString() {
        String result = "{";
        // khai báo đối tượng Node trỏ đến head
        Node current = this.head;
        // sử dụng vòng lặp while để đi qua các phần tử của danh sách
        while (current != null) {
            result += current.toString() + ",";
            // đi tới nút tiếp theo
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
