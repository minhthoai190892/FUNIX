import java.util.ArrayList;
import java.util.UUID;

public class DigitalBank extends Bank {
    private String id;
    ArrayList<DigitalCustomer> digitalCustomers;

    public DigitalBank() {
        this.id = String.valueOf(UUID.randomUUID());
        this.digitalCustomers = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<DigitalCustomer> getDigitalCustomers() {
        return digitalCustomers;
    }

    public void setDigitalCustomers(ArrayList<DigitalCustomer> digitalCustomers) {
        this.digitalCustomers = digitalCustomers;
    }

    public DigitalCustomer getCustomerById(String customerId) {
        for (int i = 0; i < this.digitalCustomers.size(); i++) {
            DigitalCustomer checkCustomer = this.digitalCustomers.get(i);
            if (checkCustomer.getCustomerId().equals(customerId)) {
                return checkCustomer;
            }
        }
        return null;
    }
   
    public boolean addCustomer(String customerName, String customerId) {
        // kiểm tra khách hàng đã tồn tại chưa
        if (getCustomerById(customerId) == null) {
            // nếu chưa ta gọi phương thức "add" và tạo mới "Customer"
            this.digitalCustomers.add(new DigitalCustomer(customerName, customerId));
            return true;
        }
        return false;
    }

    public boolean addSavingsAccount(String customerId, String accountNumber, double balance, String name) {
        DigitalCustomer customer = getCustomerById(customerId);
        // kiểm tra xem "Customer" có tồn tại không
        if (customer != null) {// => Customer
            // gọi hàm "addAccount" của "Account" để tạo tài khoản
            // return customer.addAccount(accountNumber, balance);
            return ((DigitalCustomer) customer).addSavingsAccount(accountNumber, balance, accountNumber);
        }
        return false;
    }

    public boolean addLoanAccount(String customerId, String accountNumber, double balance, String name) {
        DigitalCustomer customer = getCustomerById(customerId);
        // kiểm tra xem "Customer" có tồn tại không
        if (customer != null) {// => Customer
            // gọi hàm "addAccount" của "Account" để tạo tài khoản
            // return customer.addAccount(accountNumber, balance);
            return ((DigitalCustomer) customer).addLoanAccount(accountNumber, balance, accountNumber);
        }
        return false;
    }

    public void withdrawSavings(String customerId, String accountNumber, double amount) {
        DigitalCustomer customer = getCustomerById(customerId);
        if (customer != null) {
            customer.withdrawSaving(accountNumber, amount);
        }

    }

    public void displayaccountBank() {
        DigitalCustomer customer;
        for (int i = 0; i < digitalCustomers.size(); i++) {
            customer = digitalCustomers.get(i);
            customer.displayAccount();
        }

    }
}
