import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LoanAccount extends Account implements Withdraw, ReportService {
    // kế thừa từ "Account"
    public LoanAccount(String accountNumber, double balance, String accountName) {
        super(accountNumber, balance, accountName);
        // TODO Auto-generated constructor stub
    }

    // tạo các field
    private String name;
    private String title = "BIEN LAI GIAO DICH LOAN";
    private static final double LOAN_ACCOUNT_WITHDRAW_FEE = 0.05;
    private static final double LOAN_ACCOUNT_WITHDRAW_PREMIUM_FEE = 0.01;
    private static final double LOAN_ACCOUNT_MAX_BALANCE = 100000000;

    // getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    /**
     * Hàm rút tiền lấy từ interface "Withdraw"
     * 
     */
    public boolean withdraw(double amount) {
        // TODO Auto-generated method stub
        double newBalance = 0.0;
        double withdrawAmount = 0.0;
        // kiểm tra xem khách hàng rút tiền có lớn hơn 50000 không
        if (isAccepted(amount)) {
            if (isPremium()) {
                // đúng ta nhân với 0.01
                withdrawAmount = amount * LOAN_ACCOUNT_WITHDRAW_PREMIUM_FEE;
            } else {
                // ta nhân với 0.05
                withdrawAmount = amount * LOAN_ACCOUNT_WITHDRAW_FEE;

            }
            newBalance = getBalance() - withdrawAmount - amount;
            // cập nhật lại Balance nếu balance <50000
            if (newBalance < 50000) {
                return false;
            } else {
                setBalance(newBalance);
            }
            return true;
        }
        return false;
    }

    @Override
    /*
     * Hàm kiểm tra số tiền người dùng nhập có quá 100.000.000 không
     */
    public boolean isAccepted(double amount) {
        if (amount <= LOAN_ACCOUNT_MAX_BALANCE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    /*
     * Hàm in biên lai lấy từ interface "ReportService"
     */
    public void log(double amount) {
        boolean isPremium = isPremium();
        // TODO Auto-generated method stub
        System.out.println("+-----------+-----------------------------------+-----------+");
        System.out.printf("%30s%n", getTitle());
        System.out.printf("NGAY G/D: %28s \n", getDateTime());
        System.out.printf("ATM ID: %30s \n", "DIGITAL-BANK-ATM 2022");
        System.out.printf("SO TK: %31s \n", getAccountNumber());
        System.out.printf("SO TIEN: %28sd \n", formatBalance(amount));
        System.out.printf("SO DU: %30sd \n", formatBalance(getBalance()));
        System.out.printf("PHI + VAT: %26sd \n", formatBalance(
                isPremium == true ? amount * LOAN_ACCOUNT_WITHDRAW_PREMIUM_FEE : amount * LOAN_ACCOUNT_WITHDRAW_FEE));

        System.out.println("+-----------+-----------------------------------+-----------+");
    }

    /**
     * Hàm định dạng thời gian giao dịch
     * 
     * @return ngày giao dịch
     */
    public static String getDateTime() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        return df.format(today);
    }

    /**
     * hàm định dạng "Balance"
     * @param amount 
     * @return định dạng "Balance"
     */
    public static String formatBalance(double amount) {
        Locale localeEN = new Locale("en", "EN");
        // format hiển thị theo kểu "english"
        NumberFormat en = NumberFormat.getInstance(localeEN);
        String stringBalance = en.format(amount);
        return stringBalance;
    }

}
