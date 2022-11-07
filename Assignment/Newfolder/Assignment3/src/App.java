import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int EXIT_COMMAND_CODE = 0;
    private static final int EXIT_ERROR_CODE = -1;
    private static final DigitalBank activeBank = new DigitalBank();
    private static final String CUSTOMER_ID = "001215000001";
    private static final String CUSTOMER_NAME = "FUNIX";

    public static void main(String[] args) throws Exception {
        activeBank.addCustomer(CUSTOMER_NAME, CUSTOMER_ID);
        activeBank.addSavingsAccount(CUSTOMER_ID, "123456", 5000000, "Save");
        activeBank.addLoanAccount(CUSTOMER_ID, "231456", 50000000, "Loan");

        printMenu();
        boolean flag = false;
        while (!flag) {
            int choice;
            System.out.print("Chuc nang: ");
            // ! kiểm tra người dùng có nhập số không
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
                    showCustomer();
                    break;
                case 2:
                    System.out.println("Chuc nang so 2");
                    addSavingsAccount();
                    break;
                case 3:
                    System.out.println("Chuc nang so 3");
                    addLoanAccount();
                    break;
                case 4:
                    System.out.println("Chuc nang so 4");
                    withdraw();

                    break;
                case 5:
                    System.out.println("Chuc nang so 5");

                    break;
                case 6:
                    flag = true;
                    break;
                default:
                    System.out.println("Nhap sai vui long nhap");
                    break;
            }
        }
    }

    /*
     * Hàm rút tiền
     */
    private static void withdraw() {
        System.out.print("Nhap ma STK gom 6 so: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Nhap so tien: ");
        double amount = scanner.nextDouble();
        activeBank.withdraw(CUSTOMER_ID, accountNumber, amount);
    }

    // Hàm thêm Loan Account
    private static void addLoanAccount() {
        boolean checkAccount = false;
        String accountNumber = "";
        double balance = 0;
        while (!checkAccount) {
            System.out.print("Nhap ma STK gom 6 so: ");
            accountNumber = scanner.nextLine();
            // ! chỉ cho phép nhập số và có độ dài bằng 6
            Pattern pattern = Pattern.compile("^[0-9]{6}");
            if (pattern.matcher(accountNumber).find() && accountNumber.length() == 6) {
                while (!checkAccount) {

                    System.out.print("Nhap so du: ");
                    // vòng lặp kiểm tra xem người dùng nhập vào có phải là số không
                    while (!scanner.hasNextDouble()) {
                        String input = scanner.next();
                        System.out.printf("\"%s\" phải là số.%n", input);
                        System.out.println("Nhap sai vui long nhap lai");
                        System.out.print("Nhap so du: ");
                    }
                    balance = scanner.nextDouble();
                    // kiểm tra người dùng nhập vào số tiền có lớn hơn 50000 không
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
        // kiểm tra xem có đúng "Customer" không và "Account" đã tồn tại chưa
        if (!activeBank.addLoanAccount(CUSTOMER_ID, accountNumber, balance, "Loan")) {

            System.out.println("khach hang khong ton tai hoac tai khoan da ton tai");

        } else {
            System.out.println("Them tai khoan thanh cong");
        }
    }

    // hàm them Savings Account
    private static void addSavingsAccount() {
        boolean checkAccount = false;
        String accountNumber = "";
        double balance = 0;
        while (!checkAccount) {
            System.out.print("Nhap ma STK gom 6 so: ");
            accountNumber = scanner.nextLine();
            // ! chỉ cho phép nhập số và có độ dài bằng 6
            Pattern pattern = Pattern.compile("^[0-9]{6}");
            if (pattern.matcher(accountNumber).find() && accountNumber.length() == 6) {
                while (!checkAccount) {

                    System.out.print("Nhap so du: ");
                    // vòng lặp kiểm tra xem người dùng nhập vào có phải là số không
                    while (!scanner.hasNextDouble()) {
                        String input = scanner.next();
                        System.out.printf("\"%s\" phải là số.%n", input);
                        System.out.println("Nhap sai vui long nhap lai");
                        System.out.print("Nhap so du: ");
                    }
                    balance = scanner.nextDouble();
                    // kiểm tra người dùng nhập vào số tiền có lớn hơn 50000 không
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
        // kiểm tra xem có đúng "Customer" không và "Account" đã tồn tại chưa

        if (!activeBank.addSavingsAccount(CUSTOMER_ID, accountNumber, balance, "Savings")) {

            System.out.println("khach hang khong ton tai hoac tai khoan da ton tai");

        } else {
            System.out.println("Them tai khoan thanh cong");
        }
    }

    private static void showCustomer() {
        Customer customer = activeBank.getCustomerById(CUSTOMER_ID);
        customer.displayInformation();
    }

    private static void printMenu() {

        System.out.println("+-------------------------------------------+");
        System.out.println("| NGAN HANG DIEN TU | FX231231@V3.0.0            |");
        System.out.println("+-------------------------------------------+");
        System.out.println(" 1. Thong tin khach hang");
        System.out.println(" 2. Them tai khoan ATM");
        System.out.println(" 3. Them tai khoan tin dung");
        System.out.println(" 4. Rut tien");
        System.out.println(" 5. Lich su giao dich");
        System.out.println(" 6. Thoat ");
        System.out.println("+-------------------------------------------+");

    }
}
