package OOP1.Room;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public void turnOn() {
        System.out.println("Lamp -> Turning on");
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

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
    
    
}
