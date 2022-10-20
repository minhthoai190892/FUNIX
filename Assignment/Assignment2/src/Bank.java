import java.util.ArrayList;
import java.util.UUID;

public class Bank {
    private String id;
    private ArrayList<Customer> customers;

    public Bank() {
        this.id = String.valueOf(UUID.randomUUID());
        this.customers = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public boolean addCustomer(String customerName, String customerId) {
        if (findCustomer(customerId) == null) {
            this.customers.add(new Customer(customerName, customerId));
            return true;
        }
        return false;
    }

    public boolean addAccount(String customerId, String accountNumber, double balance) {
        Customer customer = findCustomer(customerId);
        if (customer != null) {
            return customer.addAccount(accountNumber, balance);
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkCustomer = this.customers.get(i);
            if (checkCustomer.getCustomerId().equals(customerName)) {
                return checkCustomer;
            }
        }
        return null;
    }

    public void display() {
        /*
         * for (int i = 0; i < customersList.size(); i++) {
         * System.out.println(customersList.get(i).getCustomerId());
         * for (int j = 0; j < customersList.get(i).getAccounts().size(); j++) {
         * System.out.println(customersList.get(i).getAccounts().get(j).getAccountNumber
         * ()
         * + " -> "
         * + customersList.get(i).getAccounts().get(j).getBalance());
         * sum += customersList.get(i).getAccounts().get(j).getBalance();
         * 
         * }
         */
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).getCustomerId());
            for (int j = 0; j < customers.get(i).getAccounts().size(); j++) {
                System.out.println(customers.get(i).getAccounts().get(j).getAccountNumber() + " -> "
                        + customers.get(i).getAccounts().get(j).getBalance());
            }
        }
    }
}
