package DSLK;

import java.util.Objects;

public class SingleLinkedList {
    public Node head;

    public void insertTohead(int data) {
        // tạo đối tượng Node
        Node newNode = new Node(data);
        // gán node mới vào head
        // kiểm tra dslk có rỗng không
        if (Objects.isNull(head)) {
            // dslk rỗng thì head sẽ là node mới
            this.head = newNode;
            return;
        } else {
            // dslk đã có thì cho node mới trỏ vào head
            newNode.nextNode = this.head;
            // newNode.setNextNode(this.head);
            // sau đó ta gán giá trị head bằng node mới
            this.head = newNode;
        }

    }

    public int length() {
        int length = 0;
        // tạo biến Node với giá trị head
        Node curreNode = this.head;
        while (Objects.nonNull(curreNode)) {
            // chuyễn tới node tiếp theo
            curreNode = curreNode.nextNode;
            // curreNode = curreNode.getNextNode();
            length++;

        }
        return length;

    }

    public void show() {
        // for (Node node = head; node != null; node = node.getNextNode()) {
        // System.out.print(node.getData() + " ");
        // }
        for (Node node = head; node != null; node = node.nextNode) {
            System.out.print(node.data + " ");
        }
        System.out.println();
    }

    public void delete() {
        // xóa 1 Node ta phải cập nhật lại liên kết (gán giá trị )
        this.head = this.head.nextNode;
        // this.head = this.head.getNextNode();
    }

}
