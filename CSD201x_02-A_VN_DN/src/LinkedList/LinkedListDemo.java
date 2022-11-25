package LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // tạo đối tượng "LinkedList"
        // LinkedList linkedList = new LinkedList();
        // linkedList.insertAtHead(5);
        // linkedList.insertAtHead(10);
        // linkedList.insertAtHead(2);
        // linkedList.insertAtHead(12);
        // linkedList.insertAtHead(19);
        // linkedList.insertAtHead(20);
        // // linkedList.deleteFromHead();
        // System.out.println(linkedList);
        // // System.out.println(linkedList.length());
        // System.out.println("Found: "+linkedList.find(12));

        DoublyEndedLists doublyEndedLists = new DoublyEndedLists();
        doublyEndedLists.insertAtTail(5);
        doublyEndedLists.insertAtTail(10);
        doublyEndedLists.insertAtTail(2);
        doublyEndedLists.insertAtTail(12);
        doublyEndedLists.insertAtTail(19);
        doublyEndedLists.insertAtTail(20);

        System.out.println(doublyEndedLists);

    }
}
