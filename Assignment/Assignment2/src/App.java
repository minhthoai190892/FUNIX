import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    private static Bank bank = new Bank();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        bank.addCustomer("THOAI", "001123456789");
        bank.addCustomer("THOAI1", "00112345677");
        bank.addCustomer("THANH", "001123456788");
        bank.addCustomer("DOAN", "001123456786");
        printMenu();
        boolean flag = false;
        while (!flag) {
            int choice;
            System.out.print("Chuc nang: ");
            //! kiểm tra người dùng có nhập số không
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" phải là số.%n", input);
                System.out.println("Nhap sai vui long nhap lai");
                System.out.print("Chuc nang: ");
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Chuc nang so 1");
                    addCustomer();
                    break;
                case 2:
                    System.out.println("Chuc nang so 2");
                    addAccount();
                    break;
                case 3:
                    System.out.println("Chuc nang so 3");
                    bank.display();
                    break;
                case 4:
                    System.out.println("Chuc nang so 4");
                    searchForCCCD();

                    break;
                case 5:
                    System.out.println("Chuc nang so 5");
                    searchForName();
                    break;
                default:
                    System.out.println("Nhap sai vui long nhap");
                    break;
            }
        }
    }

    private static void searchForName() {
        System.out.print("Nhap ten khach hang: ");
        String name = scanner.nextLine().toUpperCase();
        bank.searchCustomerByName(name);
    }

    private static void searchForCCCD() {
        System.out.print("Nhap CCCD: ");
        String customerId = scanner.nextLine();
        Customer customer = bank.searchCustomerId(customerId);
        if (customer == null) {
            System.out.println("khong tim thay");
            return;
        }
        customer.displayInformation();
    }

    private static void addAccount() {
        boolean checkAccount = false;

        System.out.print("Nhap CCCD khach hang: ");
        String customerId = "";

        customerId = scanner.nextLine();
        String accountNumber = "";
        double balance = 0;
        while (!checkAccount) {
            System.out.print("Nhap ma STK gom 6 so: ");
            accountNumber = scanner.nextLine();
            //! chỉ cho phép nhập số và có độ dài bằng 6
            Pattern pattern = Pattern.compile("^[0-9]{6}");
            if (pattern.matcher(accountNumber).find() && accountNumber.length() == 6) {
                while (!checkAccount) {
                    
                    System.out.print("Nhap so du: ");
                    while (!scanner.hasNextDouble()) {
                        String input = scanner.next();
                        System.out.printf("\"%s\" phải là số.%n", input);
                        System.out.println("Nhap sai vui long nhap lai");
                        System.out.print("Nhap so du: ");
                    }
                    balance = scanner.nextDouble();

                    if (balance >= 50000) {
                        checkAccount = true;
                    } else {
                        System.out.println("Nhap so du phai lon hon 50000");
                        checkAccount = false;
                    }
                }
                checkAccount = true;
            } else {
                System.out.println("So tai khoan phai la so");
                checkAccount = false;
            }
        }
        //kiểm tra xem có đúng "Customer" không và "Account" đã tồn tại chưa
        if (!bank.addAccount(customerId, accountNumber, balance)) {

            System.out.println("khach hang khong ton tai hoac tai khoan da ton tai");

        } else {
            System.out.println("Them tai khoan thanh cong");
        }
    }

    private static void addCustomer() {
        // 001123456789
        System.out.print("Nhap ten khach hang: ");
        String customerName = scanner.nextLine().toUpperCase();
        boolean checkCustomer = false;
        String customerId = "";
        while (!checkCustomer) {
            System.out.print("Nhap so CCCD: ");
            customerId = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[0][0-9]{11}");
            if (pattern.matcher(customerId).find() && customerId.length() == 12) {
                //kiểm tra xem "Customer" đã có chưa
                if (bank.addCustomer(customerName, customerId)) {
                    System.out.println("Them " + customerId + " thanh cong");
                } else {
                    System.out.println("Them " + customerId + " that bai hoac da ton tai ");
                }
                checkCustomer = true;
            } else {
                System.out.println("CCCD phai bat dau (0) va co 12 so");
            }
        }
        checkCustomer = false;
    }

    private static void printMenu() {

        System.out.println("+-------------------------------------------+");
        System.out.println("| NGAN HANG SO | FX231231@V2.0.0            |");
        System.out.println("+-------------------------------------------+");
        System.out.println(" 1. Them khach hang");
        System.out.println(" 2. Them tai khoan khach hang");
        System.out.println(" 3. Hien thi danh sach khach hang");
        System.out.println(" 4. Tim theo CCCD");
        System.out.println(" 5. Tim theo ten khach hang");
        System.out.println("+-------------------------------------------+");

    }
}
