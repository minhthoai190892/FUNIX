package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class TestStackAndQueue {
    public static void main(String[] args) {
        // khởi tạo đối tượng stack
        // Stack<Integer> myStack = new Stack<>();
        // myStack.push(1);
        // myStack.push(2);
        // myStack.push(3);
        // myStack.push(4);

        // // in dữ liệu của Stack
        // for (Integer integer : myStack) {
        // System.out.println(integer);
        // }
        // System.out.println("Pop: " + myStack.pop());
        // for (Integer integer : myStack) {
        // System.out.println(integer);
        // }
        // System.out.println("Pop: " + myStack.pop());
        // System.out.println("Pop: " + myStack.pop());
        // System.out.println("Pop: " + myStack.pop());
        // for (Integer integer : myStack) {
        // System.out.println(integer);
        // }

        // System.out.println("Is Empty: " + myStack.isEmpty());
        // System.out.println("Queue");
        Queue<String> animal1 = new LinkedList<>();
        animal1.offer("1");
        animal1.offer("2");
        animal1.offer("3");
        animal1.offer("4");
        animal1.offer("5");
        System.out.println(animal1);
        animal1.remove();
        System.out.println(animal1);

    }
}
