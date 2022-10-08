package baihoc.Inheritance.PoolArea;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        }
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return getWidth() * getLength();
    }
}
