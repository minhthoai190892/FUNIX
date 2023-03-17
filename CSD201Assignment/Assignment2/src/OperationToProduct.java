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

    public MyList<Product> readFile(String filename, MyList<Product> list) {
        // return list.readFromFile(filename,list,true);
        return list.readFromFile(filename, list, true);
    }

    public void addLast(Product newProduct, MyList<Product> list) {
        list.insertTail(newProduct);
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

    public boolean deleteById(Product product, MyList<Product> list) {
        if (list.removeNode(product)) {
            return true;
        } else {

            return false;
        }
    }

    public void changeToBinary(Product p8, MyStack<String> binary) {
        p8.convertToBinary(p8.getQuantity(), binary);
    }

    // public void sortProduct(MyList<Product> list) {
    //     list.sortList();
    // }
    public void sortByCode(MyList<Product> list) {
        MyList<Product> listSmaller = new MyList<>();
        MyList<Product> listGreater = new MyList<>();
        Node<Product> flag, pointer;
        if (list.getHead() == list.getTail()) return;
        flag = list.getHead();
        list.setHead(list.getHead().getNext());
        flag.setNext(null);                       // cô lập cờ flag lại

        // partition thành 2 list nhỏ hơn và lớn hơn
        while(list.getHead()!=null){
            pointer = list.getHead();
            list.setHead(list.getHead().getNext()); 
            pointer.setNext(null);                // cô lập con trỏ
            // nhảy con trỏ tới điểm nào thì so sánh, nếu nhỏ hơn cờ thì vào list nhỏ hơn, ngược lại vào list lớn hơn
            if (pointer.getData().compareTo(flag.getData())<=0) listSmaller.insertTail(pointer.getData());
            else listGreater.insertTail(pointer.getData());
        }

        //Gọi đệ quy 2 list nhỏ hơn và lớn hơn
        sortByCode(listSmaller);
        sortByCode(listGreater);

        // nếu danh sách nhỏ hơn không rỗng thì danh sách của chúng ta bắt đầu bởi danh sách nhỏ
        // và nối tiếp với node cờ flag
        // còn nếu danh sách nhỏ hơn mà rỗng thì danh sách của chúng ta bắt đầu bằng cờ luôn
        if (listSmaller.getHead()!=null){
            list.setHead(listSmaller.getHead()); 
            // listSmaller.tail.next = flag;
            // listSmaller.getTail().getNext() = flag;
            // listSmaller.setTail(flag)..getNext();
            // listSmaller.setTail(flag);
        } else list.setHead(flag) ;

        // Tiếp nối sau cờ sẽ là danh sách lớn hơn
        // nếu danh sách lớn hơn không rỗng thì đuôi danh sách lớn hơn chính là đuôi của danh sách kết quả
        // còn nếu danh sách lớn hơn rỗng thì đuôi danh sách kết quả chính là cờ flag
        flag.setNext(listGreater.getHead()); 
        if(listGreater.getHead()!=null) list.setTail(listGreater.getTail()); 
        else list.setTail(flag);
    }
    // public void sortByRecursion(MyList<Product> list) {
    //     list.sortRecursion(list.front());
    // }

    public void saveToFile(String fileName, MyList<Product> list) {
        list.writeToFile(fileName);
    }

    
}