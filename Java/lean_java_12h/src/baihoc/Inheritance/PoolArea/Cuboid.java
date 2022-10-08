package baihoc.Inheritance.PoolArea;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;

        }
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }
}
