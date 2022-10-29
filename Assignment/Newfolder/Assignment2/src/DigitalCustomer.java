public class DigitalCustomer extends Customer {

    public DigitalCustomer(String name, String customerId) {
        super(name, customerId);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void displayInformation() {
        // TODO Auto-generated method stub
        super.displayInformation();
    }

    @Override
    public boolean addSavingsAccount(String accountNumber, double balance,String accountName) {
        // TODO Auto-generated method stub
        return super.addSavingsAccount(accountNumber, balance,accountName);
    }


    public void withdraw(String accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (findAccount(accountNumber) != null) {
         account.withdraw(amount);
            account.log(amount);
        }
    }





    // public void withdrawSavingsAccount(String accountNumber, double amount) {

    //     Account account = findAccount(accountNumber);

    //     if (findAccount(accountNumber) != null) {
    //      account.withdraw(amount);
    //         account.log(amount);
    //     }
    // }

    
    // public void withdrawLoanAccount(String accountNumber, double amount) {

    //     Account account = findAccount(accountNumber);

    //     if (findAccount(accountNumber) != null) {
    //         account.withdraw(amount);
    //         account.log(amount);
    //     }
    // }

    @Override
    public Account findAccount(String accountNumber) {
        // TODO Auto-generated method stub
        return super.findAccount(accountNumber);
    }
}
