package OOP.CarpetCostCalculator;

/**
 * The Carpet Company has asked you to write an application that calculates the
 * price of carpeting for rectangular rooms. To calculate the price, you
 * multiply the area of the floor (width times length) by the price per square
 * meter of carpet. For example, the area of the floor that is 12 meters long
 * and 10 meters wide is 120 square meters. To cover the floor with a carpet
 * that costs $8 per square meter would cost $960.
 */
public class Floor {
    private double width;
    private double length;

    /**
     * The class needs to have one constructor with parameters width and length of
     * type double and it needs to initialize the fields.
     * 
     * @param width
     * @param length
     *               In case the width parameter is less than 0 it needs to set the
     *               width field value to 0, in case the length parameter is less
     *               than 0 it needs to set the length field value to 0.
     */

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0.0;
        }
        if (length < 0) {
            this.length = 0.0;
        }
        this.width = width;

        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
