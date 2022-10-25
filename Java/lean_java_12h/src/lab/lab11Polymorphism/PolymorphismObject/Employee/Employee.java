package lab.lab11Polymorphism.PolymorphismObject.Employee;

public abstract class Employee implements IEmployee {
    private String name;
    private int paymentPerHour;

    // @Override
    // public int calculateSalary() {
    //     // TODO Auto-generated method stub
    //     return 0;
    // }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

}
