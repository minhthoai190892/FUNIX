import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MyList<T extends Comparable<T>> {

    // public class MyList<T extends Comparable<T>> {
    Node<T> head;
    Node<T> tail;

    public Node<T> getHead() {
        return head;
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

    /**
     * hàm thêm vào đầu danh sách
     * 
     * @param data
     */
    public void insertHead(T data) {
        Node<T> p = new Node<>(data);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.setNext(head);
            head = p;
        }
    }

    /**
     * hàm thêm vào cuối danh sách
     * 
     * @param data
     */
    public void insertTail(T data) {
        Node<T> p = new Node<>(data);

        if (isEmpty()) {
            head = tail = p;
        } else {
            tail.setNext(p);
            tail = p;
        }
    }

    /**
     * hàm xóa một node
     * 
     * @param data dữ liệu cần xóa
     * @return
     */
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

  

    /**
     * hàm search
     * 
     * @param data dữ liệu cần tiềm
     * @return
     */
    public Node<T> search(T data) {
        for (Node<T> node = head; node != null; node = node.getNext()) {
            if (node.getData().equals(data)) {
                return node;
            }
        }
        return null;
    }

    // public T findMinIndex(T minIndex, Node<T> current) {
    // if (current.getNext() == null) {// kiểm tra node phía sau là null
    // return minIndex;
    // }
    // if (current.getNext().getData().compareTo(minIndex) <= 0) {// nếu giá trị
    // node phía sau nhỏ hơn hoặc bằng giá
    // // trị node hiện tại
    // minIndex = current.getNext().getData();// gán giá trị nhỏ nhất cho node phía
    // sau
    // }
    // return findMinIndex(minIndex, current);
    // }

    /**
     * hàm hiển thị thông tin
     */
    public void showList() {
        for (Node<T> node = head; node != null; node = node.getNext()) {
            System.out.println(node.getData());
        }
    }

    /**
     * hàm hiển thị thông tin khi binary
     */
    public void showBinary() {
        for (Node<T> node = head; node != null; node = node.getNext()) {
            System.out.print(node.getData());
        }
        System.out.println();
    }

    public void clear() {
        head = null;
    }

    /**
     * hàm đọc file
     * 
     * @param fileName tên file
     */
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

    /**
     * hàm kiểm tra xem file có rỗng không
     * 
     * @param fileName tên file
     * @return
     */
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

    /**
     * hàm rest lại file
     * 
     * @param fileName têm file
     */
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
                // tạo mảng chứa thông tin
                String txt[] = line.split("::");
                String bcode = txt[0];
                String tilte = txt[1];
                int quantity = Integer.parseInt(txt[2]);
                double price = Double.parseDouble(txt[3]);
                // tạo mới product
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

    public void sortByCode(String fileName) throws IOException {
        File fin = new File(fileName);
        FileInputStream fis = new FileInputStream(fin);
        BufferedReader in = new BufferedReader(new InputStreamReader(fis));
        String aLine;
        ArrayList<String> al = new ArrayList<String>();
        int i = 0;
        while ((aLine = in.readLine()) != null) {
            // lấy thông tin add vào arraylist
            if (!aLine.trim().startsWith("-") && aLine.trim().length() > 0) {
                al.add(aLine);
                i++;
            }
        }
        // sort
   

            Collections.sort(al);
            for (String string : al) {
                System.out.println(string);
            }
       

        // gi lại vào file
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String string : al) {
                bw.write(string);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        in.close();
        // out.close();

    }

}