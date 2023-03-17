package DSLK;

import java.util.Objects;

public class DoublyLinkedList {
    public Node head, tail;

    public DoublyLinkedList() {
    }

    public DoublyLinkedList(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }

    public void insertToHead(int data) {
        Node newNode = new Node(data);
        if (Objects.isNull(this.head)) {
            this.head = newNode;
            return;
        } else {
            newNode.nextNode = this.head;
            this.head = newNode;

        }
    }

    public void insertToTail(int data) {
        // tạo node mới
        Node newnoNode = new Node(data);
        // kiểm tra dslk có rỗng không
        if (Objects.isNull(this.head)) {
            this.head = newnoNode;
            return;
        } else {
            Node currentNode;
            // duyệt từ đầu danh sách đến node cuối có bằng null không
            for (currentNode = this.head; currentNode.nextNode != null; currentNode = currentNode.nextNode) {

            }
            // gán giá trị cho node cuối cùng
            currentNode.nextNode = newnoNode;
        }
    }

    public void addTail(int data) {
        // tao mot object
        Node newNode = new Node(data);
        // kiem tra xem linked list co rong khong
        if (this.head == null) {
            // thi nut moi se tro thanh nut dau tien
            this.head = newNode;
            this.tail = newNode;
        }
        if (this.tail != null) {
            // nut moi tro thanh nut cuoi hien tai
            this.tail.nextNode = newNode;
            this.tail = newNode;

        }
    }

    void addMany(int[] a) {

        for (int i = 0; i < a.length; i++) {

            Node newNode = new Node(a[i]);
            if (Objects.isNull(head)) {
                this.head = newNode;
                this.tail = newNode;
            }
            if (this.tail != null) {
                this.tail.nextNode = newNode;
                this.tail = newNode;
            }
        }
    }

    public void insertToMiddle(int data, int x) {
        // tạo node mới
        Node newNode = new Node(data);
        // kiểm tra danh sách có rỗng không
        if (Objects.isNull(this.head)) {
            this.head = newNode;
            return;
        } else {
            // danh sách đã tồn tại
            Node currentnNode;
            // duyệt từ đầu danh sách đến cuối danh sách
            for (currentnNode = this.head; currentnNode != null; currentnNode = currentnNode.nextNode) {
                // kiểm tra node hiện tại có giá trị bằng x không
                if (currentnNode.data == x) {
                    break;// bằng thì thoát vòng lặp để thực hiện thêm node vào giữa danh sách
                }
            }
            // thêm node mới vào danh sách liên kết
            newNode.nextNode = currentnNode.nextNode; // tạo liên kết với node phía sau
            currentnNode.nextNode = newNode;// tạo liên kết giữa node hiện tại và node mới
        }
    }

    public void deleteHead() {
        // ! kiểm tra danh sách có rỗng không
        if (Objects.isNull(head)) {
            return;
        } else {
            this.head = this.head.nextNode;
        }
    }

    public void deleteTail() {
        if (Objects.isNull(head)) {
            return;
        }
        // tạo 2 biến Node
        // vd: 1 2 3 4 5
        Node node = head.nextNode;// => node =2
        Node prevNode = head;// => node =1
        while (node.nextNode != null) { // => node.nextNode =5
            prevNode = node;//
            node = node.nextNode;
        }
        prevNode.nextNode = null;
    }

    public void deleteMiddle(int x) {
        if (Objects.isNull(head)) {
            return;
        } else {
            Node node = head.nextNode;
            Node prevNode = head;
            while (Objects.nonNull(node.nextNode)) {
                if (node.data == x) {
                    break;
                }
                prevNode = node;
                node = node.nextNode;
            }
            prevNode.nextNode = node.nextNode;
        }
    }

    public void show() {

        // for (Node node = head; node != null; node = node.nextNode) {
        // System.out.print(node.data + " ");
        // }
        Node currentNode = this.head;
        while (Objects.nonNull(currentNode)) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.nextNode;
        }
    }

    public int length() {
        int length = 0;
        Node currentNode = this.head;
        while (Objects.nonNull(currentNode)) {
            length++;
            currentNode = currentNode.nextNode;
        }
        return length;
    }
}
