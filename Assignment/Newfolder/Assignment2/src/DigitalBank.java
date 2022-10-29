public class DigitalBank extends Bank {

    @Override
    public Customer getCustomerById(String customerId) {
        // TODO Auto-generated method stub
        return super.getCustomerById(customerId);
    }

    // @Override
    // public boolean addSavingsAccount(String customerId, String accountNumber, double balance) {
    //     // TODO Auto-generated method stub
    //     return super.addSavingsAccount(customerId, accountNumber, balance);
    // }

    
    @Override
    public boolean addCustomer(String customerName, String customerId) {
        // TODO Auto-generated method stub
        return super.addCustomer(customerName, customerId);
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
    }

   
public void withdraw(String customerId, String accountNumber, double amount) {
        Customer customer = getCustomerById(customerId);
        if (customer!=null) {
          customer.withdraw(accountNumber, amount);
        }
    }






    // public void withdrawSavingsAccount(String customerId, String accountNumber, double amount) {
    //     Customer customer = getCustomerById(customerId);
    //     if (customer!=null) {
    //       customer.withdrawSavingsAccount(accountNumber, amount);
    //     }
    // }
    // public void withdrawLoanAccount(String customerId, String accountNumber, double amount) {
    //     Customer customer = getCustomerById(customerId);
    //     if (customer!=null) {
    //       customer.withdrawLoanAccount(accountNumber, amount);
    //     }
    // }












    @Override
    public boolean addSavingsAccount(String customerId, String accountNumber, double balance, String accountName) {
        // TODO Auto-generated method stub
        return super.addSavingsAccount(customerId, accountNumber, balance, accountName);
    }

    @Override
    public String toString() {
        return "DigitalBank []";
    }

    @Override
    public boolean addLoanAccount(String customerId, String accountNumber, double balance, String accountName) {
        // TODO Auto-generated method stub
        return super.addLoanAccount(customerId, accountNumber, balance, accountName);
    }
}
