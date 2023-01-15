package LinkedLists.LinkedList;

import LinkedLists.Node;

public class LinkedList {
    private Node head;
    public void insertAtHead(int data) {
        //khai báo biến đối tượng
        Node newNode = new Node(data);
        // liên kết nextNode đến head hiện tại
        newNode.setNextNode(this.head);
        //sau đó để head của link list trỏ đến đối tượng newNode
        this.head = newNode;
        
    }
    
 

    @Override
    public String toString() {
        String result = "{";
        //khai báo đối tượng hiện tại
        Node current  = this.head;
        while (current !=null) {
            result +=current.toString()+",";
            current =current.getNextNode();
        }
        result+="}";
        return result;
    }
    public int length() {
        int length = 0;
        Node current = this.head;
        while (current!=null) {
            length++;
            //chuyển sang node kế tiếp
            current = current.getNextNode();
        }
        return length;
    }
    public void deleteFromHead() {
        //tham chiếu head trỏ tới nextNode hiện tại
        this.head = this.head.getNextNode();
    }
    public Node find(int data) {
        //khởi tạo Node current 
        Node current = this.head;
        //sử dụng vòng lặp để duyệt qua tất cả các node của  linked List   
        while (current!=null) {
            //khi dữ liệu bằng với nút current
            if (current.getData() < data) {
                return current;
            }
            current = current.getNextNode();
        }     
        return null;
    }
   
}
