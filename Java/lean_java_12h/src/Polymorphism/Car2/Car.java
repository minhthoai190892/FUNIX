package Polymorphism.Car2;

public class Car {
    private boolean engine;
    private String name;
    private int wheels;
    private int cylinders;

    public Car(boolean engine, String name, int wheels, int cylinders) {
        this.engine = engine;
        this.name = name;
        this.wheels = wheels;
        this.cylinders = cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine()");
    }

    public void accelerate () {
        System.out.println("Car -> accelerate ()");
    }

    public void brake () {
        System.out.println("Car -> brake ()");
    }
}
