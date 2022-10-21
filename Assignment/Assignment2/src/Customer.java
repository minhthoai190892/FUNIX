import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Customer extends User {
    ArrayList<Account> accounts;

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

    public boolean addAccount(String newAccount, double balance) {
        if (findAccount(newAccount) == null) {
            // ta sẽ thêm newAccount vào arraylist
            accounts.add(new Account(newAccount, balance));
            return true;
        }
        return false;
    }

    private Account findAccount(String newAccount) {
        for (int i = 0; i < this.accounts.size(); i++) {
            Account checkAccount = this.accounts.get(i);
            if (checkAccount.getAccountNumber().equals(newAccount)) {
                return checkAccount;
            }
        }
        return null;
    }

    public String isPremium() {
        double isPremium = getBalance();

        if (isPremium >= 10000000) {
            return "Premium";
        } else {
            return "Nomal";
        }
    }

    public double getBalance() {
        double isPremium = 0;

        for (int i = 0; i < accounts.size(); i++) {
            isPremium += accounts.get(i).getBalance();
        }
        return isPremium;
    }

    public void displayInformation() {
        String checkIsPremium = isPremium();

        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);
        String stringBalance = en.format(getBalance());
        // String stringBalanceAccount = en.format(getBalance())
        System.out.printf("%-15s|%15s|%-15s|%sd \n", getCustomerId(), getName(), checkIsPremium, stringBalance);
        // System.out.println(getCustomerId() + " | " + getName() + " | " +
        // checkIsPremium + " | " + stringBalance + "d");
        for (int i = 0; i < accounts.size(); i++) {
            System.out.printf("%-5s  %-40s %sd \n", i + 1, accounts.get(i).getAccountNumber(),
                    en.format(accounts.get(i).getBalance()));
        }
    }

}
