package LinkedLists;



public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtHead(5);
        linkedList.insertAtHead(10);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(12);
        linkedList.insertAtHead(19);
        linkedList.insertAtHead(20);
        linkedList.insertAtHead(21);
        System.out.println("Length: "+linkedList.length());
        System.out.println(linkedList);
        // linkedList.deleteFromHead();
        System.out.println("Length: "+linkedList.length());
        System.out.println(linkedList);
        System.out.println("Found: "+linkedList.find(220));
    }
}
