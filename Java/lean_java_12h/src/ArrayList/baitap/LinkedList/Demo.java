package ArrayList.baitap.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");
        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);
        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> placesToVisit) {
        // Iterator<String> i = placesToVisit.iterator();
        java.util.Iterator<String> i = placesToVisit.iterator();
        while (i.hasNext()) {

            System.out.println("Now visting " + i.next());
        }
        System.out.println("=========");
    }

    // private static boolean addInOrder(LinkedList<String> linkedList, String
    // newCity) {
    // ListIterator<String> stringListIterator = linkedList.listIterator();
    // while (stringListIterator.hasNext()) {
    // int comparison = stringListIterator.next().compareTo(newCity);
    // if (comparison == 0) {
    // // equal, do not add
    // System.out.println(newCity + " is already included as a destination");
    // return false;
    // } else if (comparison > 0) {
    // // newCity should appear before this one
    // // Brisbane->Adelaide
    // stringListIterator.previous();
    // stringListIterator.add(newCity);
    // } else if (comparison < 0) {
    // // move on the next city
    // }

    // }
    // stringListIterator.add(newCity);
    // }
}
