package HocLai;

import java.util.Objects;

public class DoublyEndedList {
    private Node head;
    private Node tail;

    /**
     * Thêm vào cuối danh sách
     * 
     * @param data
     */
    public void insertTail(int data) {
        // tạo node mới
        Node newNode = new Node(data);
        // kiểm tra danh sách có tồn tại không
        if (this.head == null) {
            // gán head và tail là node mới
            this.head = newNode;
            this.tail = newNode;

        }
        // kiểm tra tail đã có dữ liệu chưa
        if (this.tail != null) {
            // set dữ liệu bằng node mới
            this.tail.setNextNode(newNode);
            // gán tail(cuối) = node mới
            this.tail = newNode;
        }

    }

    public void insertHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
        if (this.head != null) {
        
            this.tail = newNode;
            this.tail.setNextNode(newNode);
            // gán tail(cuối) = node mới
            this.tail = newNode;
        }
    }

    public void insertMiddle(int data) {

        /*
         * thuật toán floyd
         * 10->20->30->40->50->null
         * s^
         * f^
         * cả 2 sẽ trỏ đến nút đầu tiên của danh sách
         */
        Node newNode = new Node(data);
        if (Objects.isNull(head)) {
            head = newNode;
        } else {
            // tạo biến đối tượng
            Node slow, fast;
            // cả 2 biến điều trỏ đến node đầu tiên
            slow = fast = head;
            while (Objects.nonNull(fast.getNextNode()) && Objects.nonNull(fast.getNextNode().getNextNode())) {
                /**
                 * 10->20->30->40->50->null
                 * s ---^
                 * f -------^
                 * 
                 */
                slow = slow.getNextNode();// đi 1 bước
                fast = fast.getNextNode().getNextNode();// đi 2 bước
            }
            // tạo liên kết node mới với node phía sau(phải)
            newNode.setNextNode(slow.getNextNode());// -> node mới trỏ tới node tiếp theo
            // tạo liên kết giữa node trước(trái) và node m
            slow.setNextNode(newNode);
        }

    }

    // @Override
    // public String toString() {
    // String result = "";
    // for (Node node = this.head; node != null; node = node.getNextNode()) {
    // result += node.getData() + " ";
    // }
    // System.out.println();
    // return result;
    // }
    public void display() {
        // Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Adding nodes to the start of the list: ");
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.getData() + " ");
            current = current.getNextNode();
        }
        System.out.println();
    }

    public int length() {
        int length = 0;
        Node current = this.head;
        while (Objects.nonNull(current)) {
            length++;
            current = current.getNextNode();
        }
        return length;

    }
}
