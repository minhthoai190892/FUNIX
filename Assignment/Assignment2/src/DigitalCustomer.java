import java.util.ArrayList;

public class DigitalCustomer extends Customer {
    private ArrayList<Account> accounts;

    public DigitalCustomer(String name, String customerId) {
        super(name, customerId);
        // TODO Auto-generated constructor stub
        this.accounts = new ArrayList<>();

    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public Account findAccount(String newAccount) {
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

    public boolean addSavingsAccount(String accountNumber, double balance, String accountName) {
        // kiểm tra xem "newAccount" có tồn tại trong "ArrayList" không
        if (findAccount(accountNumber) == null) {
            // nếu "newAccount" chưa có ta sử dụng phương thức "add" để tạo mới một
            // "Account"

            accounts.add(new SavingAccount(accountNumber, balance, accountName));

            return true;
        }
        return false;
    }

    public boolean addLoanAccount(String accountNumber, double balance, String accountName) {
        // kiểm tra xem "newAccount" có tồn tại trong "ArrayList" không
        if (findAccount(accountNumber) == null) {
            // nếu "newAccount" chưa có ta sử dụng phương thức "add" để tạo mới một
            // "Account"

            accounts.add(new LoanAccount(accountNumber, balance, accountName));

            return true;
        }
        return false;
    }

    public void withdrawSaving(String accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (findAccount(accountNumber) != null) {
            ((SavingAccount) account).withdraw(amount);
            ((SavingAccount) account).log(amount);
        }
    }

    public void withdrawLoan(String accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (findAccount(accountNumber) != null) {
            ((LoanAccount) account).withdraw(amount);
            ((LoanAccount) account).log(amount);
        }
    }

    public void displayAccount() {
        System.out.println(getCustomerId() + " " + getName());
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i).getAccountNumber() + " " + accounts.get(i).getBalance());
        }
    }
    public void testText() {
        System.out.println("Test");
    }

}
