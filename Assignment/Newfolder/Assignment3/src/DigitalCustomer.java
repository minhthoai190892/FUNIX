public class DigitalCustomer extends Customer {
    // kế thừa Constructor của Customer
    public DigitalCustomer(String name, String customerId) {
        super(name, customerId);
        // TODO Auto-generated constructor stub
    }

    /*
     * Override hàm "displayInformation" của "Customer"
     * Dùng để hiển thị thông tin người dùng
     */
    @Override
    public void displayInformation() {
        // TODO Auto-generated method stub
        super.displayInformation();
    }

    /**
     * Hàm thêm Savings Account
     * dùng để thêm tài khoản Savings
     */
    @Override
    public boolean addSavingsAccount(String accountNumber, double balance, String accountName) {
        // TODO Auto-generated method stub
        return super.addSavingsAccount(accountNumber, balance, accountName);
    }

    /**
     * Hàm thêm Loan Account
     * đung để thêm tài khoản Loan
     */
    @Override
    public boolean addLoanAccount(String accountNumber, double balance, String accountName) {
        // TODO Auto-generated method stub
        return super.addLoanAccount(accountNumber, balance, accountName);
    }

    /**
     * Hàm rút tiền
     */
    public void withdraw(String accountNumber, double amount) {
        // tìm kiếm "Account"
        Account account = findAccount(accountNumber);
        // có "Account" ta thực hiện rút tiền và in biên lai
        if (findAccount(accountNumber) != null) {
            // Kiểm tra số tiền người dủng rút có lơn hơn số dư trong tài khoản không
            if (getBalance() > amount) {
                account.withdraw(amount);
                account.log(amount);
            } else {
                System.out.println("So tien lon hon so du khong the rut tien");
            }
        } else {
            System.out.println("Tai khoan sai");
        }
    }

    // hàm tìm kiếm "Account" được kế thừa từ Customer
    //
    @Override
    public Account findAccount(String accountNumber) {
        // TODO Auto-generated method stub
        return super.findAccount(accountNumber);
    }
}
