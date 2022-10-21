import java.sql.Blob;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // User user1 = new User("null1", "null");
        // User user2 = new User("null2", "null");
        // User user3 = new User("null3", "001123123132");
        // User user4 = new User("null4", "null");
        // ArrayList<User> users = new ArrayList<>();

        // 001123123132
        // User user = new User("Thoai", "325555");

        // System.out.println(user.setCustomerId("023123132"));
        // users.add(user1);
        // users.add(user2);
        // users.add(user3);
        // users.add(user4);
        // for (int i = 0; i < users.size(); i++) {
        // // System.out.println("element " + i + " is " + users.get(i));
        // System.out.println(users.get(i).getName() + " -> " +
        // users.get(i).getCustomerId());
        // }

        // Account customer = new Account();
        // customer.setAccountNumber("123465");
        // customer.setBalance(10200000.0);
        // Account customer2 = new Account();
        // customer2.setAccountNumber("123465");

        // customer.display();
        // customer2.display();
        // ArrayList<Customer> customersList = new ArrayList<>();
        // Customer customer = new Customer("Thoai", "001123456789");
        // Customer customer2 = new Customer("Thoai2", "001123456777");
        // Customer customer3 = new Customer("Thoai2", "001123456777");
        // customer.addAccount("123456", 10000);
        // customer.addAccount("456789", 120000);
        // customer.addAccount("789456", 130000);
        // customer2.addAccount("987456", 10000);
        // customer2.addAccount("987456", 100200);

        // customersList.add(customer);
        // customersList.add(customer2);
        // customersList.add(customer3);

        // double sum = 0;
        // for (int i = 0; i < customersList.size(); i++) {
        // System.out.println(customersList.get(i).getCustomerId());
        // for (int j = 0; j < customersList.get(i).getAccounts().size(); j++) {
        // System.out.println(customersList.get(i).getAccounts().get(j).getAccountNumber()
        // + " -> "
        // + customersList.get(i).getAccounts().get(j).getBalance());
        // sum += customersList.get(i).getAccounts().get(j).getBalance();

        // }

        // // System.out.println("sum is " + sum);
        // }
        // System.out.println("sum is " + sum);

        // System.out.println("========");

        // for (int i = 0; i < customersList.size(); i++) {
        // // System.out.println(customersList.get(i).getCustomerId());
        // // sum+=customersList.get(i).getBalance();
        // for (int j = 0; j < customersList.get(i).getAccounts().size(); j++) {
        // //
        // System.out.println(customersList.get(i).getAccounts().get(j).getAccountNumber()
        // + " -> "
        // // + customersList.get(i).getAccounts().get(j).getBalance());
        // sum += customersList.get(i).getAccounts().get(j).getBalance();
        // System.out.println("sum is " + sum);

        // }

        // }
        // System.out.println("sum is " + sum);

        // // 001123123132
        // Bank bank = new Bank();
        // bank.addCustomer("Thoai", "0011232222123132");
        // bank.addCustomer("Thoai", "001123233132");
        // bank.addAccount("0011232222123132", "123123 ", 10000);
        // bank.addAccount("001123123132", "123133 ", 20000);
        // bank.addAccount("001123233132", "123133 ", 20000);
        // bank.addAccount("001123233132", "123133 ", 20000);
        // // if (!bank.addCustomer("Thoai", "002223123132")) {
        // System.out.println("Customer da ton tai");
        // } else {
        // System.out.println("Them customer");
        // }
        // if (bank.addAccount("001123123132", "123123 ", 10000)) {
        // System.out.println("Acount da ton tai");
        // } else {
        // System.out.println("Them account");
        // }
        // bank.display();
        // System.out.println("======");
        // Customer customer = new Customer("Thoai", "001123123132");
        // customer.addAccount("123123", 9000000);
        // customer.addAccount("123133", 1000000);
        // customer.addAccount("123153", 1000000);
        // Customer customer2 = new Customer("Thoai", "001123123132");
        // customer2.addAccount("123123", 2000000);
        // customer2.addAccount("123133", 1000000);
        // customer2.addAccount("123153", 1000000);
        // customer.displayInformation();
        String name = "Coding reiver";
        Scanner scanner = new Scanner(System.in);
        String textString = scanner.nextLine();
        if (name.matches("(.*)" + textString + "(.*)")) {
            System.out.println(name);
        }else{
            System.out.println("khongn tim thay");
        }
    }
}
