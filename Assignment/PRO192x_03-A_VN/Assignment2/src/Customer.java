import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Customer extends User {
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
     * @param newAccount
     * @param balance
     * @return true/false
     */
    public boolean addAccount(String newAccount, double balance) {
        // kiểm tra xem "newAccount" có tồn tại trong "ArrayList" không
        if (findAccount(newAccount) == null) {
            // nếu "newAccount" chưa có ta sử dụng phương thức "add" để tạo mới một
            // "Account"
            accounts.add(new Account(newAccount, balance));
            return true;
        }
        return false;
    }

    /**
     * Hàm tìm "Acount"
     * 
     * @param newAccount
     * @return "Account"
     */
    private Account findAccount(String newAccount) {
        // duyệt qua mảng "accounts"
        for (int i = 0; i < this.accounts.size(); i++) {
            Account checkAccount = this.accounts.get(i);
            // kiểm tra trong mảng xem có "newAccount" chưa
            if (checkAccount.getAccountNumber().equals(newAccount)) {
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
        //định dạng hiển thị
        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);

        String stringBalance = en.format(getBalance());
        //hiển thị thông tin khách hàng
        System.out.printf("%-15s|%15s|%-15s|%sd \n", getCustomerId(), getName(), checkIsPremium, stringBalance);
        //hiển thị tất cả tài khoản khách hàng đó có
        for (int i = 0; i < accounts.size(); i++) {
            System.out.printf("%-5s  %-40s %sd \n", i + 1, accounts.get(i).getAccountNumber(),
                    en.format(accounts.get(i).getBalance()));
        }
    }

}
