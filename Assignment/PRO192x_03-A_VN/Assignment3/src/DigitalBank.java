public class DigitalBank extends Bank {

    @Override
    /**
     * Override hàm tìm kiếm "Customer"
     * Dùng để tìm kiếm xem "Customer" đã tồn tại chưa
     */
    public Customer getCustomerById(String customerId) {
        // TODO Auto-generated method stub
        return super.getCustomerById(customerId);
    }

    @Override
    /**
     * Override Hàm thêm "Customer"
     * Dùng để thêm "Customer" khi khách hàng chưa có
     */
    public boolean addCustomer(String customerName, String customerId) {
        // TODO Auto-generated method stub
        return super.addCustomer(customerName, customerId);
    }

    @Override
    /**
     * Override hàm hiển thị thông tin khách hàng
     */
    public void display() {
        // TODO Auto-generated method stub
        super.display();
    }

    /**
     * Hàm rút tiền
     * 
     * @param customerId
     * @param accountNumber
     * @param amount
     */
    public void withdraw(String customerId, String accountNumber, double amount) {
        // tìm kiếm "Customer"
        Customer customer = getCustomerById(customerId);
        // tìm thấy "Customer"
        if (customer != null) {
            // gọi hàm withdraw của Customer
            customer.withdraw(accountNumber, amount);
        }
    }

    @Override
    /*
     * Override hàm "addSavingsAccount"
     * dùng để thêm tài khoản Savings
     */
    public boolean addSavingsAccount(String customerId, String accountNumber, double balance, String accountName) {
        // TODO Auto-generated method stub
        return super.addSavingsAccount(customerId, accountNumber, balance, accountName);
    }


    @Override
    /*
     * Override hàm "addLoanAccount"
     * dùng để thêm tài khoản Loan
     */
    public boolean addLoanAccount(String customerId, String accountNumber, double balance, String accountName) {
        // TODO Auto-generated method stub
        return super.addLoanAccount(customerId, accountNumber, balance, accountName);
    }
}
