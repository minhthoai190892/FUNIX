import java.util.ArrayList;

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

    // public double getBalance() {
    //     double sum = 0;
    //     for (int i = 0; i < accounts.size(); i++) {
    //         sum += accounts.get(i).getBalance();
    //     }
    //     return sum;
    // }

    public void displayInformation() {
        
    }

}
