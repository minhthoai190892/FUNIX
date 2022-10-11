package OOP1.Composition;

/**
 * 1) Create a class and name it Lamp. Inside this class should be declared
 * three member variables: style of type String, battery of type boolean, and
 * globRating of type int. All variables should be marked private. A constructor
 * needs to be created which accepts the three member variables as parameters.
 * In addition, four methods should also be created: turnOn() has no return type
 * and should print a message that the lamp is being turned on; getStyle()
 * returns the lamp style; isBattery returns the value of battery; and
 * getGlobRating() returns the globRating of the lamp.
 */
public class Lamp {
    private String style;
    private boolean battery ;
    private int globRating ;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("the lamp is being turned on");
    }
    

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isBattery() {
        return this.battery;
    }

    public boolean getBattery() {
        return this.battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public int getGlobRating() {
        return this.globRating;
    }

    public void setGlobRating(int globRating) {
        this.globRating = globRating;
    }

}
