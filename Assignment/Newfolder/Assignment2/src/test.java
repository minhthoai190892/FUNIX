import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID");
        String customerId = scanner.nextLine();

        System.out.print("Enter Customer name");
        String customerName = scanner.nextLine();

        System.out.print("Enter account number");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter account Name");
        String accountName = scanner.nextLine();

        System.out.print("Enter balance");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter amount");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        // DigitalCustomer customer = new DigitalCustomer("Thoai", "123465897");
        // customer.addSavingsAccount("231456", 5000000, "Sav1");
        // customer.addSavingsAccount("232456", 5000000, "Save 2");
        // customer.addLoanAccount("3456789", 6000000, "Loan1");
        // customer.withdrawSavingsAccount("232456", 1000000);
        // customer.withdrawLoanAccount("3456789", 1000000);
        // customer.displayInformation();

        // DigitalBank digitalBank = new DigitalBank();
        // digitalBank.addCustomer(customerName, customerId);
        // digitalBank.addSavingsAccount(customerId, accountNumber, balance,
        // accountName);
        // digitalBank.withdrawSavingsAccount(customerId, accountNumber, 1000000);
        // // digitalBank.display();
        // digitalBank.display();
        DigitalBank digitalBank = new DigitalBank();
        // digitalBank.addCustomer("Thoai", "123456789312");
        // // digitalBank.addSavingsAccount("123456789312", "123465", 50000000, "save");
        // // digitalBank.withdrawSavingsAccount("123456789312", "123465", 1000000);
        // digitalBank.addLoanAccount("123456789312", "123456", 5000000, "Loan");
        // digitalBank.withdrawLoanAccount("123456789312", "123456", 1000000);

        // 123456789312
        // 5000000
        // 1000000
        digitalBank.addCustomer(customerName, customerId);
        digitalBank.addLoanAccount(customerId, accountNumber, balance, accountName);
        digitalBank.withdrawLoanAccount(customerId, accountNumber, amount   );

        digitalBank.display();
    }
}
