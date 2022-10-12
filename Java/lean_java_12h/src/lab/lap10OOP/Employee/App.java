package lab.lap10OOP.Employee;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Thoai", 200);
        System.out.println("Employee ");
        employee.display();
        System.out.println();
        System.out.println("Manager ");
        Manager manager = new Manager("Thanh", 300, 100);
        manager.display();
    }
}
