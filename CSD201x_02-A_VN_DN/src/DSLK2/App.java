package DSLK2;

public class App {
    public static void main(String[] args) {
        // DoublyLinkedList dLinkedList = new DoublyLinkedList();
        // dLinkedList.insertHead(10);
        // dLinkedList.insertHead(10);
        // dLinkedList.insertHead(102);
        // dLinkedList.insertTail(10);
        // dLinkedList.insertTail(10);
        // dLinkedList.insertTail(10);
        // dLinkedList.insertTail(101);
        // dLinkedList.insertTail(102);
        // dLinkedList.insertMiddle(200, 101);
        // dLinkedList.insertMiddle(201, 10);
        // System.out.println(dLinkedList.length());

        // // dLinkedList.show();

        // dLinkedList.insertHead(10);
        // dLinkedList.insertHead(20);
        // dLinkedList.insertTail(102);
        // dLinkedList.insertMiddle(200, 20);
        // dLinkedList.deleteHead();
        // dLinkedList.deleteTail();
        // dLinkedList.deleteMiddle(102);

        // System.out.println("Stack");
        // Stack stack = new Stack();
        // stack.push(11);
        // stack.push(120);
        // stack.push(12);
        // stack.push(13);
        // stack.push(14);
        // stack.push(15);
        // System.out.println(stack.size());
        // System.out.println("Get Pop: " + stack.pop().getData());
        // System.out.println(stack.size());
        // stack.showStack();

        System.out.println("Queue");
        Queue queue = new Queue();
   
        queue.endQueue(1);
        queue.endQueue(2);
        queue.endQueue(3);
        queue.endQueue(4);
    
        System.out.println(queue.peek().getData());
        System.out.println(queue.pop().getData());

        queue.showQ();
    }
}
