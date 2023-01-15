package LinkedLists;



public class DoublyEndedListNodeList {
    private DoublyEndedListNode head;

    public void insertHead(int data) {
        // tạo đối tượng mới
        DoublyEndedListNode newNode = new DoublyEndedListNode(data);
        // đặt NextNode = currentHead
        newNode.setNextNode(this.head);
        if (this.head != null) {
            this.head.setPreviousNode(newNode);
        }
        this.head = newNode;
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int length = 0;
        DoublyEndedListNode current = this.head;
        while (current != null) {
            length++;
            current = current.getNextNode();
        }
        return length;
    }
    // @Override
    // public String toString() {
    //     StringBuilder sb = new StringBuilder();
       
    //     DoublyEndedListNode n  = this.head;
    //     while (n !=null) {
    //         sb.append("Node data");
    //         sb.append(n);
    //         sb.append("\n");
    //         n=n.getNextNode();
    //     }
    //     return sb.toString();
    // }
    public void display() {

        if (head==null) {
            return;
        }
        DoublyEndedListNode temp = head;
        while (temp!=null) {
            System.out.print(temp.getData()+"->");
            temp = temp.nextNode;

        }
        System.out.println("null");
    }
}
