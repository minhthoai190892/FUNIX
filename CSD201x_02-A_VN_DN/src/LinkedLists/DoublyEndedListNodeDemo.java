package LinkedLists;

public class DoublyEndedListNodeDemo {
    public static void main(String[] args) {
        DoublyEndedListNodeList interger = new DoublyEndedListNodeList();
        interger.insertHead(10);
        interger.insertHead(20);
        interger.insertHead(30);
        interger.insertHead(5);
        interger.insertHead(150);
       System.out.println( interger.length());
        interger.display();
    }
}
