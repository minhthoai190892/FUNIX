package OOP1.Composition;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getPillows() {
        return this.pillows;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSheets() {
        return this.sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public int getQuilt() {
        return this.quilt;
    }

    public void setQuilt(int quilt) {
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("Bed -> make");
    }

}
