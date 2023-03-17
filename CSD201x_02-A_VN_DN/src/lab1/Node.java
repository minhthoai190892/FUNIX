package lab1;

public class Node {
    private int data;
    private Node nexNode;
    public Node(int data) {
        this.data = data;
        this.nexNode = null;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getNexNode() {
        return nexNode;
    }
    public void setNexNode(Node nexNode) {
        this.nexNode = nexNode;
    }
    
}
