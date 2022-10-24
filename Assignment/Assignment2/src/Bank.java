import java.util.ArrayList;
import java.util.UUID;

public class Bank {
    // field
    private String id;
    private ArrayList<Customer> customers;

    // Contructor
    public Bank() {
        this.id = String.valueOf(UUID.randomUUID());
        this.customers = new ArrayList<>();
    }

    // getter and setter
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

    /**
     * Hàm thêm khách hàng
     * 
     * @param customerName
     * @param customerId
     * @return true/false
     */
    public boolean addCustomer(String customerName, String customerId) {
        // kiểm tra khách hàng đã tồn tại chưa
        if (findCustomer(customerId) == null) {
            // nếu chưa ta gọi phương thức "add" và tạo mới "Customer"
            this.customers.add(new Customer(customerName, customerId));
            return true;
        }
        return false;
    }

    /**
     * Hàm tạo tài khoản
     * 
     * @param customerId
     * @param accountNumber
     * @param balance
     * @return true/false
     */
    public boolean addAccount(String customerId, String accountNumber, double balance) {
        Customer customer = findCustomer(customerId);
        if (customer != null) {
            return customer.addAccount(accountNumber, balance);
        }
        return false;
    }

    /**
     * Hàm tìm khách hàng
     * 
     * @param customerName
     * @return Customer
     */
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

    public void name(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            ArrayList<Customer> customersList = new ArrayList<>();
            customersList.add(findCustomer(name));
            System.out.println(customersList.get(i).getName());
        }
    }

    public void searchCustomerByName(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkCustomer = this.customers.get(i);
            // name.matches("(.*)" + textString + "(.*)")
            if (checkCustomer.getName().contains(customerName)) {
                // System.out.println(checkCustomer.getName());
                checkCustomer.displayInformation();
            }
        }

    }

}
