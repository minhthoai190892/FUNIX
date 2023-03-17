import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class MyList<T> {
    
// public class MyList<T extends Comparable<T>> {
    private Node<T> head;
    private Node<T> tail;

    public Node<T> getHead() {
        return head;
    }

    public void sortList() {

        // Node<T> current = head;
        // Node<T> index = null;

        // while (current != null) {
        //     index = current.getNext();
        //     while (index != null) {

        //         if (current.getData().compareTo(index.getData()) > 0) {
        //             T temp = current.getData();
        //             current.setData(index.getData());
        //             index.setData(temp);
        //         }
        //         index = index.getNext();
        //     }
        //     current = current.getNext();
        // }
    }
    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node<T> front() {
        return head;
    }

    public T behind() {
        return tail.getData();
    }

    public void insertHead(T data) {
        Node<T> p = new Node<>(data);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.setNext(head);
            head = p;
        }
    }

    public void insertTail(T data) {
        Node<T> p = new Node<>(data);
        if (isEmpty()) {
            head = tail = p;
        } else {
            tail.setNext(p);
            tail = p;
        }
    }

    public boolean removeNode(T data) {
        Node<T> x = head;
        Node<T> prevX = head;
        if (!isEmpty()) {
            while (x != null) {// duyệt từ đầu danh sách
                if (x.getData().equals(data)) {// kiểm tra giá trị của node có bằng giá trị truyền vào không
                    break;// kết thúc vòng lặp
                }
                prevX = x;// nếu không thì cặp nhật prevX
                x = x.getNext();// cập nhật x thành node tiếp theo

            }
            // kiểm tra x khác null
            if (x != null) {
                if (x == head) {// kiểm tra x bằng head
                    head = x.getNext();// gán node head là node phía sau x
                    x.setNext(null);// ngắt liên kết của x
                } else if (x == tail) {// kiểm tra x là node cuối
                    prevX.setNext(null);// ngắt liên kết của node phía trước x với x
                    tail = prevX;// gán tail là node phía trước x
                } else {
                    // node cần xóa nằm giữa danh sách
                    prevX.setNext(x.getNext());// cho node phía trước x liên kết với node sau x
                    x.setNext(null);// ngắt liên kết của x

                }
                return true;
            } else {
                // x==null
                return false;
            }
        } else {
            // danh sách rỗng
            System.out.println("Empty");
            return false;
        }

    }

    // public void sortRecursion(Node<T> current) {
    //     if (current != null) {
    //         T temp = current.getData();// lưu giá trị của node hiện tại vào biến tạm
    //         T x = findMinIndex(current.getData(), current);// tìm giá trị nhỏ nhất
    //         Node<T> min = search(x);// tìm kiếm trong danh sách node có giá trị nhỏ nhất
    //         current.setData(x);// đổi chỗ giá trị của node hiện tại và node có giá trị nhỏ nhất vừa tìm được
    //         min.setData(temp);
    //         sortRecursion(current.getNext());// thực hiện đệ quy với node phía sau
    //     }
    // }

    public Node<T> search(T data) {
        for (Node<T> node = head; node != null; node = node.getNext()) {
            if (node.getData().equals(data)) {
                return node;
            }
        }
        return null;
    }

    // public T findMinIndex(T minIndex, Node<T> current) {
    //     if (current.getNext() == null) {// kiểm tra node phía sau là null
    //         return minIndex;
    //     }
    //     if (current.getNext().getData().compareTo(minIndex) <= 0) {// nếu giá trị node phía sau nhỏ hơn hoặc bằng giá
    //                                                                // trị node hiện tại
    //         minIndex = current.getNext().getData();// gán giá trị nhỏ nhất cho node phía sau
    //     }
    //     return findMinIndex(minIndex, current);
    // }

    public void showList() {
        for (Node<T> node = head; node != null; node = node.getNext()) {
            System.out.println(node.getData());
        }
    }

    public void showBinary() {
        for (Node<T> node = head; node != null; node = node.getNext()) {
            System.out.print(node.getData()+" ");
        }
        System.out.println();
    }

    public void clear() {
        head = null;
    }

   

    public void writeToFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Node<T> node = head; node != null; node = node.getNext()) {
                bw.write(String.valueOf(node.getData()));
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public boolean fileIsEmpty(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            br.close();
            return line == null;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }

    public void resetFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("");
            bw.close();
            fw.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public MyList<T> readFromFile(String filename, MyList<T> list, boolean addLast) {
        // nếu true thì thêm vào cuối
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String txt[] = line.split("::");
                String bcode = txt[0];
                String tilte = txt[1];
                int quantity = Integer.parseInt(txt[2]);
                double price = Double.parseDouble(txt[3]);

                Product newProduct = new Product(bcode, tilte, quantity, price);
                if (addLast) {
                    list.insertTail((T) newProduct);
                } else {
                    list.insertHead((T) newProduct);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return list;
    }

   
}