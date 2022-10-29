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

        DigitalCustomer digitalCustomer = new DigitalCustomer("Thoai", "123456789");
        digitalCustomer.addSavingsAccount("123123", 5000000, "Saving");
        digitalCustomer.addLoanAccount("123223", 10000000, "Loan");
        // digitalCustomer.withdrawSaving("123123", 1200000);
        digitalCustomer.withdrawLoan("123223", 500000);
        // digitalCustomer.withdrawSaving("123223", 1000000);
        
    

    }

    public static String getDateTime() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        return df.format(today);
    }
}
