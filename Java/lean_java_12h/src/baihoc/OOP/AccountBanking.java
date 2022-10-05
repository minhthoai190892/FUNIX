package baihoc.OOP;

import java.security.PrivilegedAction;

public class AccountBanking {
    private String number;
    private double blance;
    private String accountName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public AccountBanking(String number, double blance, String accountName,
            String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.blance = blance;
        this.accountName = accountName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

  

    // public AccountBanking() {
    // System.out.println("Empty constructor called");
    // }

    /**
     * 
     * @param depositAmount amount deposited by the user
     *                      return the amount in the bank
     */
    public void deposit(double depositAmount) {
        this.blance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New blance is " + this.blance);
    }

    /**
     * 
     * @param withdrawalAmount withdrawal Amount by user
     *                         return the amount in the bank
     */
    public void withdrawal(double withdrawalAmount) {
        // check if the amount in the account is less than the withdrawal amount
        if (this.blance - withdrawalAmount < 0) {
            System.out.println("Only " + this.blance + " available. Withdrawal not processed");
        } else {
            this.blance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining blance = " + this.blance);
        }
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBlance() {
        return this.blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

}
