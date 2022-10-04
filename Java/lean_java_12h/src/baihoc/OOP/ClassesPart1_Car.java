package baihoc.OOP;

public class ClassesPart1_Car {
    private int doors;
    private int wheels;
    private String model;
    private String color;
    private String engine;

    // ! "get" lấy giá trị của field
    public int getDoors() {
        return this.doors;
    }

    // ! cập nhật giá trị cho field
    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("ford") || validModel.equals("honda")) {

            this.model = model;

        } else {
            this.model = "Unknown";
        }
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

}
