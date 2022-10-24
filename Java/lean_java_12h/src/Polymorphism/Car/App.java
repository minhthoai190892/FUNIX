package Polymorphism.Car;

public class App {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println("====");
        Mitsubishi Mitsubishi = new Mitsubishi(8, "Base car");
        System.out.println(Mitsubishi.startEngine());
        System.out.println(Mitsubishi.accelerate());
        System.out.println(Mitsubishi.brake());
    }
}
