import java.util.ArrayList;

public class DigitalBank extends Bank {
    ArrayList<DigitalCustomer> customers;

    public DigitalBank(ArrayList<DigitalCustomer> customers) {
        this.customers = customers;
    }

    private Customer getCustomerById (String customerId) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkCustomer = this.customers.get(i);
            if (checkCustomer.getCustomerId().equals(customerId)) {
                return checkCustomer;
            }
        }
        return null;
    }

    public boolean addCustomer(String customerName, String customerId) {
        // kiểm tra khách hàng đã tồn tại chưa
        if (getCustomerById (customerId) == null) {
            // nếu chưa ta gọi phương thức "add" và tạo mới "Customer"
            this.customers.add(new DigitalCustomer(customerName, customerId));
            return true;
        }
        return false;
    }

  
}
