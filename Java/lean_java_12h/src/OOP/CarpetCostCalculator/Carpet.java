package OOP.CarpetCostCalculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else
            this.cost = cost;
    }

    /**
     * Method named getCost without any parameters, it needs to return the value of
     * cost field
     * 
     * @return
     */
    public double getCost() {
        return this.cost;
    }
}
