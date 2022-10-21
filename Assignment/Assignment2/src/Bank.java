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
        Customer customer;

        for (int i = 0; i < customers.size(); i++) {
            customer = customers.get(i);
            customer.displayInformation();
        }

    }

    public Customer searchCustomerId(String customerId) {
        return findCustomer(customerId);
    }

    public Customer searchCustomerName(String name) {
        return findCustomerName(name);
    }

    private Customer findCustomerName(String customerName) {
        
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkCustomer = this.customers.get(i);
            // name.matches("(.*)" + textString + "(.*)")
            if (checkCustomer.getName().contains(customerName)) {
                return checkCustomer;
            }
        }
        return null;
    }

}
