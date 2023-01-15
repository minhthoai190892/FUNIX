package LinkedLists;

public class DoublyEndedListNode {
    //khai báo biến dữ liệu
    private int data;
    //tạo 2 tham chiếu
    DoublyEndedListNode nextNode;
    DoublyEndedListNode previousNode;
    //khởi tạo node
    
    //getter_setter
    public int getData() {
        return data;
    }
    public DoublyEndedListNode(int data) {
        this.data = data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public DoublyEndedListNode getNextNode() {
        return nextNode;
    }
    public void setNextNode(DoublyEndedListNode nextNode) {
        this.nextNode = nextNode;
    }
    public DoublyEndedListNode getPreviousNode() {
        return previousNode;
    }
    public void setPreviousNode(DoublyEndedListNode previousNode) {
        this.previousNode = previousNode;
    }

    
}
