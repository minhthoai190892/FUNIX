package HocLai;

public class SingleLinkedList {
    // khai báo node đầu tiên
    private Node head;

    public void insertToHead(int data) {
        // khai báo biến đối tượng
        Node newNode = new Node(data);
        // liên kết nextNode đến head hiện tại
        newNode.setNextNode(this.head);
        // sau đó để head của link list trỏ đến đối tượng newNode
        this.head = newNode;
    }

    public int length() {
        int length = 0;
        Node current = this.head;
        while (current != null) {
            length++;
            //chuyển tới Node kế tiếp
            current = current.getNextNode();
        }
        return length;
    }

    @Override
    public String toString() {
        String result = "";
        for (Node node = this.head; node != null; node = node.getNextNode()) {
            result += node.getData()+" ";
        }
        System.out.println();
        return result;
    }
    // public void showlinkedList() {
    // for (Node node = this.head; node !=null; node = node.getNextNode()) {
    // System.out.print(node.getData()+" ");
    // }
    // System.out.println();
    // }

    public void deleteNode() {
        this.head = this.head.getNextNode();
    }

    public Node search(int value) {
        Node current = this.head;
        while (current != null) {
            if (current.getData() == value) {
                return current;
            }
            //di chuyển đến node tiếp theo
            current = current.getNextNode();
        }
        return null;

    }
    
   
}
