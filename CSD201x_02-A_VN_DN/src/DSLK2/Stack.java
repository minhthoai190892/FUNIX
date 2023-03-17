package DSLK2;

public class Stack {
    private int counter;// (topNode)
    private DoublyLinkedList data;

    // hàm khởi tạo
    public Stack() {
        this.counter = 0;
        this.data = new DoublyLinkedList();
    }

    /**
     * Hàm kiểm tra xem Stack có rỗng không
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
     * kirểm tra độ dài Stack
     * 
     * @return int
     */
    public int size() {
        return this.counter;
    }

    /**
     * Thêm phần tử vào đầu Stack
     * 
     * @param data
     */
    public void push(int data) {
        // tạo đối tượng
        Node node = new Node(data);
        // kiểm tra Stack có rỗng không
        if (isEmpty()) {
            //
            this.data.setHead(node);
            this.counter++;
        } else {
            // Stack không rỗng thì thêm dữ liệu vào đầu Stack
            this.data.insertHead(data);
            // tăng biến đếm lên
            this.counter++;
        }
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

    public void showStack() {
        this.data.show();
    }
}
