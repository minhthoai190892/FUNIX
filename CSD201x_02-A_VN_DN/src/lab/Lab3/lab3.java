package lab.Lab3;

public class lab3 {

    public static void main(String[] args) {
        // Node newNode = new Node(10);
        MyList myList = new MyList();
        System.out.println();
        int a[] = { 1,10,11, 9, 2, 8, 6, 3 };
        myList.addMany(a);
        myList.traverse();
        // myList.visit(newNode);
        System.out.println();
        System.out.println("search");
       System.out.println( myList.search(8));
    }
}
