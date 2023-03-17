package DSLK2;

import java.util.Objects;

public class DoublyLinkedList {
    private Node head;

    public void insertHead(int data) {
        // tạo node mới
        Node newNode = new Node(data);
        // kiểm tra danh sách rỗng
        if (Objects.isNull(head)) {
            // danh sách rỗng thì gán giá trị node mới là head
            this.head = newNode;
            return;
        } else {
            // danh sách không rỗng
            newNode.setNextNode(this.head); // tạo liên kết giữa node mới với head
            // sau đó gán node mới làm head
            this.head = newNode;                    
        }
    }



    
    public void insertTail(int data) {
        // tạo node mới
        Node newNode = new Node(data);
        if (Objects.isNull(this.head)) {
            this.head = newNode;
            return;
        } else {
            // tạo đối tượng node hiện tại
            Node currentnNode;
            // duyệt mảng từ đầu; đến cuối mảng;chuyển sang node kế tiếp (i++)
            for (currentnNode = this.head; currentnNode.getNextNode() != null; currentnNode = currentnNode
                    .getNextNode()) {

            }
            // gán giá trị cho
            currentnNode.setNextNode(newNode);
        }
    }

    public void insertMiddle(int data, int x) {
        // tạo node mới
        Node newNode = new Node(data);
        // ! kiểm tra danh sách có rỗng không
        if (Objects.isNull(this.head)) {
            // danh sách rỗng ta gán giá trị node mới làm head
            this.head = newNode;
            return;
        } else {
            // ! danh sách không rỗng
            // tạo đối tượng node hiện tại
            Node currentNode;
            // duyệt danh sách từ đầu, đến cuối mảng
            for (currentNode = this.head; currentNode != null; currentNode = currentNode.getNextNode()) {
                // ! kiểm tra dữ liệu của node hiện tại có bằng giá trị x
                if (currentNode.getData() == x) {
                    // ! bằng thì thoát chương trình
                    break;
                }
            }
            // !chèn vào giữa danh sách
            // tạo liên kết giữa node mới và node kế tiếp(bên phải)
            newNode.setNextNode(currentNode.getNextNode());
            // tạo liên kết giữa node hiện tại với node mới(bên trái)
            currentNode.setNextNode(newNode);
        }
    }

    public void deleteHead() {
        if (Objects.isNull(head)) {
            return;
        }
        // ! cập nhật lại head(phía sau)
        // head bằng với giá trị node phía sau
        this.head = this.head.getNextNode();
    }

    public void deleteTail() {
        if (Objects.isNull(head)) {
            return;
        } else {
            // tạo 2 biến Node
            Node node = this.head.getNextNode(); // => node có giá trị của node kế tiếp
            Node prevNode = this.head;// => sẽ bằng head
            // ! sử dụng vòng lặp để kiểm tra node cuối có bằng null không
            while (Objects.nonNull(node.getNextNode())) {
                // gán giá trị prevNode
                prevNode = node;
                // cập nhật giá trị để xét điều kiện while
                node = node.getNextNode();
            }
            // sau khi chạy hết vòng lặp ta ngắt kết nối node cuối cùng => xóa
            prevNode.setNextNode(null);
            ;
        }
    }

    public void deleteMiddle(int x) {
        if (Objects.isNull(head)) {
            return;
        } else {
            Node node = this.head.getNextNode();
            Node prevNode = this.head;
            while (Objects.nonNull(node.getNextNode())) {
                if (node.getData() == x) {
                    break;
                }
                prevNode = node;
                node = node.getNextNode();
            }
            prevNode.setNextNode(node.getNextNode());

        }
    }

    public int length() {
        int length = 0;
        Node currentNode = this.head;
        while (Objects.nonNull(currentNode)) {
            length++;
            currentNode = currentNode.getNextNode();
        }
        return length;
    }

    public void show() {
        for (Node currentNode = this.head; currentNode != null; currentNode = currentNode.getNextNode()) {
            System.out.print(currentNode.getData() + " ");
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
