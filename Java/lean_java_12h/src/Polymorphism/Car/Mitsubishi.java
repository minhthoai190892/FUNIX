package Polymorphism.Car;

public class Mitsubishi  extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String accelerate() {
        // TODO Auto-generated method stub
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        // TODO Auto-generated method stub
        return "Mitsubishi -> brake()";

    }

    @Override
    public String startEngine() {
        // TODO Auto-generated method stub
        return "Mitsubishi -> startEngine()";

    }
    
}
