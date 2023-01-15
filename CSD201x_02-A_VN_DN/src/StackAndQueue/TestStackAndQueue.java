package StackAndQueue;

import java.util.Stack;

public class TestStackAndQueue {
    public static void main(String[] args) {
        // khởi tạo đối tượng stack
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        // in dữ liệu của Stack
        for (Integer integer : myStack) {
            System.out.println(integer);
        }
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Pop: " + myStack.pop());
        for (Integer integer : myStack) {
            System.out.println(integer);
        }
        System.out.println("Is Empty: " + myStack.isEmpty());
    }
}
