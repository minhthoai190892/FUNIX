package baihoc.OOP;

public class Point {
    private int x;
    private int y;

    /**
     * Method named getX without any parameters, it needs to return the value of x
     * field.
     * 
     * @return
     */
    public int getX() {
        return this.x;
    }

    /**
     * Method named setX with one parameter of type int, it needs to set the value
     * of the x field.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Method named getY without any parameters, it needs to return the value of y
     * field.
     */
    public int getY() {
        return this.y;
    }

    /**
     * Method named setY with one parameter of type int, it needs to set the value
     * of the y field.
     */
    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    /**
     * Method named distance without any parameters, it needs to return the distance
     * between this Point and Point 0,0 as double.
     * 
     * @return
     */
    public double distance() {
        return distance(0, 0);
    }

    /**
     * Method named distance with two parameters x, y both of type int, it needs to
     * return the distance between this Point and Point x,y as double.
     * 
     * @param x
     * @param y
     * @return
     */
    public double distance(int x, int y) {
        // ! d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    /**
     * Method named distance with parameter another of type Point, it needs to
     * return the distance between this Point and another Point as double.
     * 
     * @param another
     * @return
     */
    public double distance(Point another) {
        return distance(another.x, another.y);
    }

}
