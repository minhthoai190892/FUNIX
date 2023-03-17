package DSLK2;

public class Queue {
    public int counter;
    public DoublyLinkedList data;

    public Queue() {
        this.counter = 0;
        this.data = new DoublyLinkedList();
    }

    /**
     * Hàm kiểm tra xem Queue có rỗng không
     * 
     * @return true/false
     */
    public boolean isEmpty() {
        if (this.counter == 0) {
            return true;
        }
        return false;
    }

    /**
     * kirểm tra độ dài Queue
     * 
     * @return int
     */
    public int size() {
        return this.counter;
    }

    public void endQueue(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            this.data.setHead(node);
            this.counter++;
        } else {
            this.counter++;
            this.data.insertTail(data);
        }
    }

    public void showQ() {
        this.data.show();
    }

    public Node peek() {
        if (isEmpty()) {
            return null;
        } else {
            return this.data.getHead();
        }
    }

    public Node pop() {
        if (isEmpty()) {
            return null;
        } else {
            this.counter--;
            Node node = this.data.getHead();
            this.data.deleteHead();
            return node;
        }
    }
}
