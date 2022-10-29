import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        // LoanAccount loanAccount = new LoanAccount("123456", 5000000, "Loan");

        // System.out.println(loanAccount.withdraw(4000000));
        // loanAccount.log(4000000);
        // System.out.println("====");
        // SavingAccount savingAccount = new SavingAccount("456789", 50000000,
        // "Saving");
        // savingAccount.withdraw(50000000);
        // savingAccount.log(50000000);
        // System.out.println(getDateTime());

        // DigitalCustomer digitalCustomer = new DigitalCustomer("Thoai", "123456789");
        // digitalCustomer.addSavingsAccount("123123", 5000000, "Saving");
        // digitalCustomer.addLoanAccount("123223", 10000000, "Loan");
        // // digitalCustomer.withdrawSaving("123123", 1200000);
        // digitalCustomer.withdrawLoan("123223", 500000);
        // // digitalCustomer.withdrawSaving("123223", 1000000);
        DigitalBank digitalBank = new DigitalBank();
        digitalBank.addCustomer("Thoai", "123465789");
        digitalBank.addSavingsAccount("123465789", "123456", 5000000, "Saving");
        digitalBank.addSavingsAccount("123465789", "123466", 7000000, "Saving");
        digitalBank.addCustomer("Thoai2", "123465788");
        digitalBank.addSavingsAccount("123465788", "123456", 400000, "Saving");
        digitalBank.withdrawSavings("123465789", "123456", 2000000);
        digitalBank.getCustomerById("123465789");
        digitalBank.displayaccountBank();
        Customer customer = digitalBank.getCustomerById("123465789");
        customer.displayInformation();
        // DigitalCustomer customer = digitalBank.getCustomerById("123465789");
        // customer.displayAccount();
        // System.out.println("======");
        // Customer customer1 = digitalBank.getCustomerById("123465789");
        // customer1.displayInformation();
        // Customer customer = new Customer("Thoai ", "123789756456");
        // customer.addSavingsAccount("123456 ", 10000000, "save");
        // customer.addSavingsAccount("123556 ", 100000, "save");
        // customer.withdrawSaving("123456", 1000000);
        // // customer.displayInformation();

        // abstact1 abstact1 = new abstact1(0, 0) {
            
        };
    }

    // public static String getDateTime() {
    // DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    // Date today = Calendar.getInstance().getTime();
    // return df.format(today);
    // }

