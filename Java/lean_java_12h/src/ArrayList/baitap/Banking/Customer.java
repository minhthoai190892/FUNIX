package ArrayList.baitap.Banking;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name, double initalAmount) {
        this.name = name;
        this.transaction = new ArrayList<>();
        addTransaction(initalAmount);
    }

    public void addTransaction(double amount) {
        this.transaction.add(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

}
