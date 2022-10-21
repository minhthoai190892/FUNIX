import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
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

    public boolean isPremium() {
        if (this.balance >= 10000000) {
            return true;
        } else {
            return false;
        }
    }

    public void display() {
        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);
        String stringBalance = en.format(balance);
        System.out
                .println(accountNumber + " | " + "\t" + stringBalance + "d");
    }
}