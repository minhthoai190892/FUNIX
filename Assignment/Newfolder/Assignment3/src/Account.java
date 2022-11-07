import java.text.NumberFormat;
import java.util.Locale;

public abstract class Account {
    private String accountNumber;
    private double balance;
    private String accountName;

    /**
     * Contructor
     * 
     * @param accountNumber
     * @param balance
     */
    public Account(String accountNumber, double balance, String accountName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Hàm kiểm tra xem tài khoản có phải là "Premium"
     * 
     * @return true/false
     */
    public boolean isPremium() {
        if (this.balance >= 10000000) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Hàm hiển thị thông tin của tài khoản
     */
    public void display() {
        // tạo mới phương thức Locale để format hiển thị
        Locale localeEN = new Locale("en", "EN");
        // format hiển thị theo kểu "english"
        NumberFormat en = NumberFormat.getInstance(localeEN);
        String stringBalance = en.format(balance);
        System.out
                .println(accountNumber + " | " + "\t" + stringBalance + "d");
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void log(double amount) {
    }

    public abstract boolean withdraw(double amount);
}
