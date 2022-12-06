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
        // System.out.println("Found: " + linkedList.find(12));

        DoublyEndedLists doublyEndedLists = new DoublyEndedLists();
        doublyEndedLists.insertAtHead(5);
        doublyEndedLists.insertAtHead(10);
        doublyEndedLists.insertAtHead(2);
        doublyEndedLists.insertAtHead(12);
        doublyEndedLists.insertAtHead(19);
        doublyEndedLists.insertAtHead(20);

        System.out.println(doublyEndedLists);
        System.out.println("flutteradvent-pageview".toLowerCase());
    }
}
