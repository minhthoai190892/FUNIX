package OOP1.Computer;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resoltion nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resoltion nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Draw pixel a " + x + "," + y + " in colour " + color);
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Resoltion getNativeResolution() {
        return this.nativeResolution;
    }

    public void setNativeResolution(Resoltion nativeResolution) {
        this.nativeResolution = nativeResolution;
    }

}
