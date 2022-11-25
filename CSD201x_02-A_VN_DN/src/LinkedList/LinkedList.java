package LinkedList;

public class LinkedList {
    private Node head;

    public void insertAtHead(int data) {
        //tạo đối tượng "newNode"
        Node newNode = new Node(data);
        //để đối tượng "newNode" trỏ đên head hiện tại
        newNode.setNextNode(this.head);
        //sau đó để "head" của "Linked List" trỏ tới đối tượng "newNode"
        this.head = newNode;
    }

    /**
     * hàm tính độ dài của LinkedList
     * 
     * @return length
     */
    public int length() {
        int length = 0;
        // khởi tạo Node
        Node current = this.head;
        // sử dụng vòng lặp để kiểm tra LinkedList
        while (current != null) {
            length++;
            // chuyển sang nút kế tiếp
            current = current.getNextNode();
        }
        return length;
    }

    public void deleteFromHead() {
        // tham chiếu "head" trỏ đến "nextNode" của "head" hiện tại
        this.head = this.head.getNextNode();
    }

    public Node find(int data) {
        //khởi tạo Node hiện tại bằng phần tử "head"
        Node current = this.head;
        //sử dụng vòng lặp để duyệt qua tất cả các nút
        while (current!=null) {
            //kiểm tra "current" có bằng "data" không
            if (current.getData() == data) {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "{";
        //khai báo đối tượng Node trỏ đến head
        Node current = this.head;
        //sử dụng vòng lặp while để đi qua các phần tử của danh sách
        while (current!=null) {
            result += current.toString()+",";
            // đi tới nút tiếp theo
            current = current.getNextNode();
        }
        result+="}";
        return result;
    }
}
