package lab.lap10OOP.Employee;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        // TODO Auto-generated method stub
        return super.getSalary() + bonus;

    }

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }

}