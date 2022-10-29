import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SavingsAccount extends Account implements ReportService, Withdraw {
   

    public SavingsAccount(String accountNumber, double balance, String accountName) {
        super(accountNumber, balance, accountName);
        //TODO Auto-generated constructor stub
    }

 
    private String title = "BIEN LAI GIAO DICH SAVINGS";
    
    private static final double SAVINGS_ACCOUNT_MAX_WITHDRAW = 5000000;
   



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
    }

    public static double getSavingsAccountMaxWithdraw() {
        return SAVINGS_ACCOUNT_MAX_WITHDRAW;
    }


    @Override
    public void log(double amount) {
        // TODO Auto-generated method stub
        System.out.println("+-----------+-----------------------------------+-----------+");
        System.out.printf("%30s%n", getTitle());
        System.out.printf("NGAY G/D: %28s \n", getDateTime());
        System.out.printf("ATM ID: %30s \n", "DIGITAL-BANK-ATM 2022");
        System.out.printf("SO TK: %31s \n", getAccountNumber());
        System.out.printf("SO TIEN: %28sd \n", formatBalance(amount));
        System.out.printf("SO DU: %30sd \n", formatBalance(getBalance()));
        System.out.printf("PHI + VAT: %27sd \n",0);

        System.out.println("+-----------+-----------------------------------+-----------+");
    }

    public static String getDateTime() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        return df.format(today);
    }

    public static String formatBalance(double amount) {
        Locale localeEN = new Locale("en", "EN");
        // format hiển thị theo kểu "english"
        NumberFormat en = NumberFormat.getInstance(localeEN);
        String stringBalance = en.format(amount);
        return stringBalance;
    }

    @Override
    public boolean withdraw(double amount) {
        // TODO Auto-generated method stub
        double newBalance = 0.0;
        if (isAccepted(amount)) {
            if (isPremium() == false) {
                if (amount <= SAVINGS_ACCOUNT_MAX_WITHDRAW) {
                    newBalance = getBalance() - amount;
                }
            } else {
                newBalance = getBalance() - amount;
            }
            if (newBalance <= 50000) {
                return false;
            } else {

                setBalance(newBalance);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean isAccepted(double amount) {
        if (amount >= 50000) {
            return true;
        } else {

            return false;
        }
    }

}
