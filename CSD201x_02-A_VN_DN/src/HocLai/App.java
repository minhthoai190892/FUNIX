package HocLai;

public class App {
    public static void main(String[] args) {
        SingleLinkedList s= new SingleLinkedList();
        s.insertToHead(10);
        s.insertToHead(30);
        s.insertToHead(20);
        // s.deleteNode();
        System.out.println(s);
        // System.out.println("asdf " +s.search(20));
        System.out.println("===================");
        DoublyEndedList dList = new DoublyEndedList();

        // dList.insertHead(20);
        dList.insertHead(1000);
        dList.insertTail(8);
        dList.insertTail(400);
        dList.insertTail(40);
        dList.insertTail(50);
        dList.insertMiddle(10);
        dList.insertMiddle(210);
        // dList.insertMiddle(110);
        // dList.insertMiddle(310);
        System.out.println(dList.length());
        // dList.deleteHead();
        dList.display();
    }
}
