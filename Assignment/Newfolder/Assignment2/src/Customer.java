import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public abstract class Customer extends User {
    ArrayList<Account> accounts;

    /**
     * Contructor
     * 
     * @param name
     * @param customerId
     */
    public Customer(String name, String customerId) {
        super(name, customerId);
        this.accounts = new ArrayList<>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    /**
     * Hàm tạo "Account"
     * Nếu "true" thì tạo "Account". "False" thì không tạo "Accout"
     * 
     * @param accountNumber
     * @param balance
     * @return true/false
     */
    public boolean addSavingsAccount(String accountNumber, double balance, String accountName) {
        // kiểm tra xem "accountNumber" có tồn tại trong "ArrayList" không
        if (findAccount(accountNumber) == null) {
            // nếu "accountNumber" chưa có ta sử dụng phương thức "add" để tạo mới một
            // "Account"
            accounts.add(new SavingsAccount(accountNumber, balance, accountName));
            return true;
        }
        return false;
    }

    public boolean addLoanAccount(String accountNumber, double balance, String accountName) {
        // kiểm tra xem "accountNumber" có tồn tại trong "ArrayList" không
        if (findAccount(accountNumber) == null) {
            // nếu "accountNumber" chưa có ta sử dụng phương thức "add" để tạo mới một
            // "Account"
            accounts.add(new LoanAccount(accountNumber, balance, accountName));
            return true;
        }
        return false;
    }

    /**
     * Hàm tìm "Acount"
     * 
     * @param accountNumber
     * @return "Account"
     */
    public Account findAccount(String accountNumber) {
        // duyệt qua mảng "accounts"
        for (int i = 0; i < this.accounts.size(); i++) {
            Account checkAccount = this.accounts.get(i);
            // kiểm tra trong mảng xem có "accountNumber" chưa
            if (checkAccount.getAccountNumber().equals(accountNumber)) {
                return checkAccount;
            }
        }
        return null;
    }

    /**
     * Hàm kiểm tra tài khoản có là Premium
     * 
     * @return Premium / Nomal
     */
    public String isPremium() {
        double isPremium = getBalance();

        if (isPremium >= 10000000) {
            return "Premium";
        } else {
            return "Nomal";
        }

    }

    /**
     * Hàm lấy "Balance"
     * 
     * @return tổng số dư của tài khoản
     */
    public double getBalance() {
        double isPremium = 0;

        for (int i = 0; i < accounts.size(); i++) {
            isPremium += accounts.get(i).getBalance();
        }
        return isPremium;
    }

    /**
     * Hàm hiển thị thông tin tài khoản
     */
    public void displayInformation() {
        String checkIsPremium = isPremium();
        // định dạng hiển thị
        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);

        String stringBalance = en.format(getBalance());
        // hiển thị thông tin khách hàng
        System.out.printf("%-12s|%18s |%15s|%sd \n", getCustomerId(), getName(), checkIsPremium, stringBalance);
        // hiển thị tất cả tài khoản khách hàng đó có
        for (int i = 0; i < accounts.size(); i++) {
            System.out.printf("%s %10s  %17s | %25sd \n", i + 1, accounts.get(i).getAccountNumber(),accounts.get(i).getAccountName(),
                    en.format(accounts.get(i).getBalance()));

        }
    }

    public abstract void withdrawSavingsAccount(String accountNumber, double amount);
    public abstract void withdrawLoanAccount(String accountNumber, double amount);

}
