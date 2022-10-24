package lab.lab11Polymorphism.GhiDePhuongThuc;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Thoai", 1000);
        employee.display();
        Manager manager = new Manager("thanh", 10000, 100);
        manager.display();
    }
}
