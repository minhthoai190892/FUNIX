package LinkedLists;

class Link {
    public int iData;

    public Link next;

    public Link(int id) {
        iData = id;
    }

    public String toString() {
        return "{" + iData + "} ";
    }
}

class FirstLastList {
    private Link first;
    private Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int dd) {
        Link newLink = new Link(dd);
        if (isEmpty())
            last = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int dd) {
        Link newLink = new Link(dd);

        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }

    public int deleteFirst() {
        int temp = first.iData;
        if (first.next == null)
            last = null;
        first = first.next;
        return temp;
    }

    public String toString() {
        String str = "";
        Link current = first;
        while (current != null) {
            str += current.toString();
            current = current.next;
        }
        return str;
    }
}

public class TestDoubly {
    public static void main(String[] args) {
        FirstLastList theList = new FirstLastList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);

        System.out.println(theList);

        theList.deleteFirst();
        theList.deleteFirst();

        System.out.println(theList);
    }
}
