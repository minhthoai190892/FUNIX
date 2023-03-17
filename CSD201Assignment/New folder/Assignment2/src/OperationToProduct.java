import java.util.Scanner;

public class OperationToProduct {

    public void inputProduct(Product newProduct, Scanner scanner) {
        System.out.println("Bcode: ");
        newProduct.setBcode(scanner.nextLine());
        System.out.println("Title");
        newProduct.setTitle(scanner.nextLine());
        System.out.println("Quantity: ");
        newProduct.setQuantity(Integer.parseInt(scanner.nextLine()));
        System.out.println("Price: ");
        newProduct.setPrice(Double.parseDouble(scanner.nextLine()));
    }

    public void addLast(Product newProduct, MyList<Product> list) {

        for (Node<Product> i = list.head; i != null; i = i.next) {
            if (i.getData().getBcode().equals(newProduct.getBcode())) {
                System.out.println("Trung Bcode");
               return;
            }
           
        }
        list.insertTail(newProduct);

    }
    public void addLastQueue(Product newProduct, MyList<Product> list) {

   
        list.insertTail(newProduct);

    }

    public MyList<Product> readFile(String filename, MyList<Product> list) {
        // return list.readFromFile(filename,list,true);
        return list.readFromFile(filename, list, true);
    }

    public void showProduct(MyList<Product> list) {
        list.showList();
    }

    public Product searchById(Product product, MyList<Product> list) {

        Product searchedProduct = list.search(product).getData();
        if (searchedProduct != null) {
            return searchedProduct;
        } else {

            return null;
        }
    }

    /**
     * xóa 1 product
     * 
     * @param product
     * @param list
     * @return
     */
    public boolean deleteById(Product product, MyList<Product> list) {
        if (list.removeNode(product)) {
            return true;
        } else {

            return false;
        }
    }

    /**
     * chuyển sang nhị phân
     * 
     * @param p8
     * @param binary
     */
    public void changeToBinary(Product p8, MyStack<String> binary) {
        p8.convertToBinary(p8.getQuantity(), binary);
    }

    public void saveToFile(String fileName, MyList<Product> list) {
        list.writeToFile(fileName);
    }

    // public void sortByCode1(MyList<Product> list) {
    // Node<Product> current = list.head;
    // Node<Product> index = null;
    // while (current != null) {
    // index = current.getNext();
    // while (index != null) {

    // if (current.getData().compareTo(index.getData().getBcode()) > 0) {
    // Product temp = current.getData();
    // current.setData(index.getData());
    // index.setData(temp);
    // }
    // index = index.getNext();
    // }
    // current = current.getNext();
    // }

    // }

    public void sortByCode(MyList<Product> list) {
        MyList<Product> listSmaller = new MyList<>();
        MyList<Product> listGreater = new MyList<>();
        Node<Product> flag, pointer;
        if (list.head == list.tail)
            return;
        flag = list.head;
        list.head = list.head.next;
        flag.next = null; // cô lập cờ flag lại

        // partition thành 2 list nhỏ hơn và lớn hơn
        while (list.head != null) {
            pointer = list.head;
            list.head = list.head.next;
            pointer.next = null; // cô lập con trỏ
            // nhảy con trỏ tới điểm nào thì so sánh, nếu nhỏ hơn cờ thì vào list nhỏ hơn,
            // ngược lại vào list lớn hơn
            if (pointer.data.getBcode().compareTo(flag.data.getBcode()) <= 0)
                listSmaller.insertTail(pointer.data);
            else
                listGreater.insertTail(pointer.data);
        }

        // Gọi đệ quy 2 list nhỏ hơn và lớn hơn
        sortByCode(listSmaller);
        sortByCode(listGreater);

        // nếu danh sách nhỏ hơn không rỗng thì danh sách của chúng ta bắt đầu bởi danh
        // sách nhỏ
        // và nối tiếp với node cờ flag
        // còn nếu danh sách nhỏ hơn mà rỗng thì danh sách của chúng ta bắt đầu bằng cờ
        // luôn
        if (listSmaller.head != null) {
            list.head = listSmaller.head;
            listSmaller.tail.next = flag;
        } else
            list.head = flag;

        // Tiếp nối sau cờ sẽ là danh sách lớn hơn
        // nếu danh sách lớn hơn không rỗng thì đuôi danh sách lớn hơn chính là đuôi của
        // danh sách kết quả
        // còn nếu danh sách lớn hơn rỗng thì đuôi danh sách kết quả chính là cờ flag
        flag.next = listGreater.head;
        if (listGreater.head != null)
            list.tail = listGreater.tail;
        else
            list.tail = flag;
    }

}