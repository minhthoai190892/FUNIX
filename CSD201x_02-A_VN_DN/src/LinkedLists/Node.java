package LinkedLists;

public class Node {
    // giá trị kiểu int
    private int data;
    // nextNode trỏ tới node tiếp theo
    private Node nextNode;

    
    // hàm khởi tạo
    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "data=" + this.data ;
    }

}
