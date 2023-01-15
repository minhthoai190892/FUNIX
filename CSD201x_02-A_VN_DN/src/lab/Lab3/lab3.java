package lab.Lab3;

import java.util.ArrayList;
import java.util.List;

public class lab3 {

    public static void main(String[] args) {
        Node newNode = new Node(10);
        MyList myList = new MyList();
        myList.addTail(7);
        myList.addTail(2);
        myList.addTail(9);
        myList.addTail(8);
        myList.addTail(6);
        myList.addTail(3);
      
        myList.visit(newNode);
        myList.traverse();
        int a[] = { 7, 2, 9, 8, 6, 3 };
        myList.addMany(a);
        // List<Integer> aa = new ArrayList<>();
        // aa.add(1);
        // aa.add(2);
        // aa.add(3);
        // aa.add(4);
        // aa.add(5);
        // System.out.println();
        // MyList.miniMaxSum(aa);

    }
}
