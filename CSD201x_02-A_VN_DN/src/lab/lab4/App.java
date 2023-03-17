package lab.lab4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MyList myList = new MyList();
        Person person = new Person("Thoai", 20);
        Person person1 = new Person("Thoai1", 21);

        myList.insertHead(person);
        myList.insertHead(person1);
        // myList.insertTail(person);
        // myList.insertTail(person1);
        myList.traverse();

        // String[] a = { "HOA", "HA", "LAN", "NOI", "MUA", "NAY" };
        // int[] b = { 25, 17, 26, 19, 23, 21 };
        // MyList t = new MyList();
        // t.addMany(a, b);
        // t.traverse();
        // System.out.println("Sort");
        // t.sortByName();
        // t.traverse();

    
      
    }
}
