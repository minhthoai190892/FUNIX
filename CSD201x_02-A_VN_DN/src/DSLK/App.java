package DSLK;

public class App {

    public static void main(String[] args) {
        // SingleLinkedList sLinkedList = new SingleLinkedList();
        // sLinkedList.insertTohead(1);
        // sLinkedList.insertTohead(15);
        // sLinkedList.insertTohead(10);
        // sLinkedList.insertTohead(16);
        // sLinkedList.insertTohead(17);
        // sLinkedList.insertTohead(17);
        // sLinkedList.insertTohead(17);
        // sLinkedList.insertTohead(18);
        // sLinkedList.delete();
        // System.out.println(sLinkedList.length());
        // sLinkedList.show();

        DoublyLinkedList dLinkedList = new DoublyLinkedList();
        // dLinkedList.addTail(10);
        // dLinkedList.addTail(20);
        // dLinkedList.addTail(30);
        // dLinkedList.addTail(30);
        // dLinkedList.addTail(30);
        dLinkedList.insertToHead(1);
        dLinkedList.insertToHead(2);
        dLinkedList.insertToHead(3);
        // dLinkedList.insertToTail(60);
        // dLinkedList.insertToTail(5010);
        // dLinkedList.insertToTail(10);
        // dLinkedList.insertToMiddle(6, 30);
        // dLinkedList.insertToMiddle(7, 30);
        // dLinkedList.deleteHead();
        // dLinkedList.deleteTail();
        // dLinkedList.deleteMiddle(30);
        // int a[] = { 1, 10, 11, 9, 2, 8, 6, 3 };
        // dLinkedList.addMany(a);
        // System.out.println(dLinkedList.length());
        dLinkedList.show();
    }

}
