package lab.lab11Polymorphism.PolymorphismObject.RectangleAndCircl;

public class Circl implements IShap{
    private double radius;

    public Circl(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * 3.14 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
