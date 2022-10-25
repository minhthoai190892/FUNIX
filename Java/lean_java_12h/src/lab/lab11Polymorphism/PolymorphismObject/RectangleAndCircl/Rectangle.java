package lab.lab11Polymorphism.PolymorphismObject.RectangleAndCircl;

public class Rectangle implements IShap {
    private double length;
    private double width;
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return length * width;
    }
    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return (length + width) * 2;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

}
