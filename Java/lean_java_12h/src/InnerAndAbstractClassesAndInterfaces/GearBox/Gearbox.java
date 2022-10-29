package InnerAndAbstractClassesAndInterfaces.GearBox;

import java.util.ArrayList;

public class Gearbox {
    // tạo field
    private ArrayList<Gear> gears;
    private int maxGears;
    private int CurrentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutarl = new Gear(0, 0.0);
        this.gears.add(neutarl);
        for (int i = 0; i < maxGears; i++) {
            addGear(i, i * 5.3);
        }
    }

    /**
     * Hàm nhận giá trị sau đó set giá trị
     * 
     * @param in
     */
    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    /**
     * Hàm thêm
     * 
     * @param number
     * @param ratio
     */
    public void addGear(int number, double ratio) {
        if (number > 0 && (number <= maxGears)) {
            // thêm "Gear" mới vào ArrayList
            this.gears.add(new Gear(number, ratio));
        }
    }

    /**
     * 
     * @param newGear
     */
    public void changeGear(int newGear) {
        if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn) {
            this.CurrentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind!");
            this.CurrentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!");
            return 0.0;

        }
        return revs * gears.get(CurrentGear).getRatio();
    }

    /**
     * InnerGearbox
     */
    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }

        public int getGearNumber() {
            return gearNumber;
        }

        public void setGearNumber(int gearNumber) {
            this.gearNumber = gearNumber;
        }

        public double getRatio() {
            return ratio;
        }

        public void setRatio(double ratio) {
            this.ratio = ratio;
        }

    }
}
