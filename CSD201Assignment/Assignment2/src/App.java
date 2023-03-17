
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static final String fileName = "Data.txt";
    public static final String console_file = "console_output.txt";

    public static <T> void main(String[] args) throws Exception {
        int choice;
        Scanner scanner = new Scanner(System.in);
        MyList<Product> list = new MyList<>();
        while (true) {
            System.out.println("1. Load data from file and display");
            System.out.println("2. Input & add to the end");
            System.out.println("3. Display data");
            System.out.println("4. Save product list to file");
            System.out.println("5. Search by ID");
            System.out.println("6. Delete by ID");
            System.out.println("7. Sort by ID");
            System.out.println("8. Convert to Binary");
            System.out.println("9. Load to stack and display");
            System.out.println("10. Load to queue and display");
            System.out.println("11. Sort by Recursion");
            System.out.println("0. Exit");
            System.out.println("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    // đọc dữ liệu từ file và in ra màn hình
                    OperationToProduct p = new OperationToProduct();
                    // kiểm tra xem list có rỗng không
                    if (!list.fileIsEmpty(fileName)) {
                        list.clear();
                        p.readFile(fileName, list);
                        list.showList();
                    } else {
                        System.out.println("File is empty");
                    }
                    break;
                case 2:
                    // Thêm sản phẩm vào cuối danh sách
                    System.out.println("Add a new product: ");
                    OperationToProduct p1 = new OperationToProduct();
                    System.out.println("How many products that you want to import?: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter product's information: ");
                        Product newProduct = new Product();
                        p1.inputProduct(newProduct, scanner);
                        p1.addLast(newProduct, list);
                    }
                    break;
                case 3:
                    // in danh sách sản phẩm ra màng hình
                    if (list.isEmpty()) {
                        System.out.println("List is empty");
                    } else {
                        System.out.println("List product: ");
                        list.showList();
                    }
                    break;
                case 4:
                    // ghi dữ liệu từ danh sách vào file
                    if (!list.isEmpty()) {
                        list.writeToFile(fileName);
                    } else {
                        System.out.println("List is empty");
                    }
                    break;
                case 5:
                    // tìm kiếm sản phẩm bằng id
                    if (list.isEmpty()) {
                        System.out.println("List is empty");

                    } else {
                        System.out.println("Search by ID");
                        String id = scanner.nextLine();
                        Product product = new Product(id);
                        OperationToProduct p5 = new OperationToProduct();
                        var result = p5.searchById(product, list);
                        if (result != null) {
                            System.out.println(result);
                        } else {
                            System.out.println("Not Found");
                        }
                    }
                    break;
                case 6:
                    // xóa sản phẩm bằng id
                    if (list.isEmpty()) {
                        System.out.println("List is empty");

                    } else {
                        System.out.println("Delete by id: ");
                        String id = scanner.nextLine();
                        Product product = new Product(id);
                        OperationToProduct p6 = new OperationToProduct();
                        var result = p6.deleteById(product, list);// boolen
                        if (result) {
                            // nếu xóa thành công thì reset lại file
                            System.out.println("Success Delete");
                            list.resetFile(fileName);
                            list.writeToFile(fileName);
                        } else {
                            System.out.println("Unsuccess delete");
                        }
                    }
                    break;
                case 7:
                    // sắp xếp sản phẩm theo id
                    System.out.println("List of product was sorted by Id: ");
                   
                    // OperationToProduct o7=new OperationToProduct();
                    // o7.sortByCode(list);
                    list.sortList();
                   
                    list.showList();
                    System.out.println("asd");
                    break;
                case 8:
                    if (list.isEmpty()) {
                        System.out.println("List is empty");
                    } else {
                        System.out.println("Convert to binary: ");
                        MyStack<String> binary = new MyStack<>();
                        Product p8 = (Product) list.front().getData();
                        OperationToProduct index = new OperationToProduct();
                        index.changeToBinary(p8, binary);
                        binary.showStackOfBinary();
                    }
                    break;
                case 9:
                    // in danh sách sản phẩm theo stack
                    if (!list.fileIsEmpty(fileName)) {
                        System.out.println("Stack: ");
                        MyStack<Product> stackProduct = new MyStack<>();
                        stackProduct.clearStack();
                        stackProduct.readFile(fileName);
                        stackProduct.showStack();

                    } else {
                        System.out.println("file is empty");
                    }
                    break;
                case 10:
                    // in danh sach san pham theo queue
                    if (!list.fileIsEmpty(fileName)) {
                        System.out.println("Queue: ");
                        MyQueue<Product> queueProduct = new MyQueue<>();
                        OperationToProduct o = new OperationToProduct();
                        o.addLast(null, list);
                        // queueProduct.clearQueue();
                        queueProduct.readFile(fileName);
                        queueProduct.showQueue();

                    } else {
                        System.out.println("File is empty");
                    }
                    break;
                // case 11:
                //     // sap xep danh sach san pham bang de quy
                //     if (list.isEmpty()) {
                //         System.out.println("List is empty");
                //     } else {
                //         System.out.println("Sort by recursion");
                //         OperationToProduct p11 = new OperationToProduct();
                //         p11.sortByRecursion(list);
                //         p11.showProduct(list);
                //     }
                //     break;
                case 0:
                    break;
                default:
                    break;
            }
        }
    }
}
