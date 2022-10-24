package lab.lab11Polymorphism.NapChongPhuongThuc;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(5, 5));
        System.out.println(calculator.add(5, 5, 5));
    }
}
