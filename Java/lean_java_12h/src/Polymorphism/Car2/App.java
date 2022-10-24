package Polymorphism.Car2;

public class App {
    public static void main(String[] args) {
        
        Car car = new Car(true, "asdfasf", 4, 2);
        car.accelerate();
        car.brake();
        car.startEngine();
        Mitsubishi Mitsubishi = new Mitsubishi(true, "asdfasf", 4, 2);
        Mitsubishi.accelerate();
        Mitsubishi.brake();
        Mitsubishi.startEngine();
    }

}
