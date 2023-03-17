package StackAndQueue;

public class App {
    public static void main(String[] args) {
        // MyArrayStack myStack = new MyArrayStack(3);
        // myStack.push(1);
        // myStack.push(2);
        // myStack.push(3);
        // myStack.push(4);//-->không được thêm vào do lớn hơn độ dài mãng
        // myStack.show();
        // myStack.pop();
        // myStack.show();
        // myStack.pop();
        // myStack.show();
        // myStack.pop();
        // myStack.show();

        // MyArrayQueue myQueue = new MyArrayQueue(3);
        // myQueue.push(1);
        // myQueue.push(2);
        // myQueue.push(3);
        // myQueue.push(4);
        // // System.out.println(myQueue.count());
        // myQueue.show();
        // myQueue.pop();
        // System.out.println(myQueue.count());

        // myQueue.show();
        // System.out.println("Stack");
        // MyLinkedListStack2 ll = new MyLinkedListStack2();
        // ll.push(1);
        // ll.push(2);
        // ll.push(3);
        // ll.push(4);
        // ll.show();
        // ll.pop();
        // System.out.println();
        // ll.show();
        // System.out.println();
        // MyArrayQueue queue = new MyArrayQueue(3);
        // queue.push(1);
        // queue.push(2);
        // queue.push(3);
        // queue.push(4);
        // queue.show();
        // System.out.println("pop: "+ queue.pop());
        // queue.show();
        // queue.pop();
        // queue.show();
        // queue.pop();
        // queue.show();
        System.out.println("Queue");
        MyLinkedListQueue mQueue = new MyLinkedListQueue();
        mQueue.push(1);
        mQueue.push(2);
        mQueue.push(3);
        mQueue.push(4);
        mQueue.show();
        mQueue.pop();
        mQueue.show();

    }

}
