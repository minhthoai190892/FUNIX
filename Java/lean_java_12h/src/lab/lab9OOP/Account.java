package lab.lab9OOP;

public class Account {
    private int id;
    private String name;
    private int balance;

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getbalance() {
        return balance;
    }

    public void setbalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
         balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;		
        }else{
             System.out.println("That amount exceeds your current balance.​");
        }
        
    }

    public void display() {
        System.out.println("Id " + this.id);
        System.out.println("Name " + this.name);
        System.out.println("balance " + this.balance);
    }
}
