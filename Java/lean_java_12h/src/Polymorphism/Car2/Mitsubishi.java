package Polymorphism.Car2;

public class Mitsubishi  extends Car {

    public Mitsubishi(boolean engine, String name, int wheels, int cylinders) {
        super(engine, name, wheels, cylinders);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void accelerate() {
        // TODO Auto-generated method stub
       System.out.println("Mitsubishi -> accelerate()");
    }

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println("Mitsubishi -> brake()");

    }

    @Override
    public void startEngine() {
        // TODO Auto-generated method stub
        System.out.println("Mitsubishi -> startEngine()");

    }
    
}
