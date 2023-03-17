package lab.lab4;

import java.util.Objects;

public class MyList {
    Node head, tail;

    MyList() {
        head = tail = null;
    }

    void clear() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    // public Person addPerson(String name, int age) {

    //     return new Person(name, age);

    // }

    public void insertTail(Person x) {

        Node newNode = new Node(x);
        if (isEmpty()) {
            this.head = newNode;
            return;
        } else {
            Node currentNode;
            // duyệt từ đầu danh sách đến node cuối có bằng null không
            for (currentNode = this.head; currentNode.next != null; currentNode = currentNode.next) {

            }
            // gán giá trị cho node cuối cùng
            currentNode.next = newNode;
        }
    }
    public void insertHead(Person x) {
        Node newnoNode = new Node(x);
        if (head==null) {
            head= newnoNode;
        }else{
            newnoNode.next = head;
            head = newnoNode;
        }
    }


    // public void insertTail(String name, int age) {
    //     Person newPerson = new Person(name, age);
    //     Node newNode = new Node(newPerson);
    //     if (isEmpty()) {
    //         this.head = newNode;
    //         this.tail = newNode;
    //     } else {
    //         this.tail.next = newNode;
    //         this.tail = newNode;
    //     }
    // }
    void traverse() {
        Node curren = this.head;
        while (Objects.nonNull(curren)) {
            System.out.print(curren.info + " ");
            System.out.println();
            curren = curren.next;
        }

    }

    void addMany(String[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            Person person = new Person(a[i], b[i]);
            Node newNode = new Node(person);
            if (isEmpty()) {
                this.head = newNode;
                this.tail = newNode;
            } else {
                this.tail.next = newNode;
                this.tail = newNode;
            }
        }
    }
    // void addMany(String name, int age) {
       
    //         Person person = new Person(name, age);
    //         Node newNode = new Node(person);
    //         if (isEmpty()) {
    //             this.head = newNode;
    //             this.tail = newNode;
    //         } else {
    //             this.tail.next = newNode;
    //             this.tail = newNode;
    //         }
        
    // }


        void sortByName() {
            Node currentNode = head, index = null;
            if (Objects.isNull(head)) {
                return;
            } else {
                while (Objects.nonNull(currentNode)) {
                    index = currentNode.next;
                    while (Objects.nonNull(index)) {
                        if (currentNode.info.name.compareToIgnoreCase(index.info.name) > 0) {
                            Person temp = currentNode.info;
                            currentNode.info = index.info;
                            index.info = temp;
                        }
                        index = index.next;
                    }
                    currentNode = currentNode.next;
                }
            }
        }

}


