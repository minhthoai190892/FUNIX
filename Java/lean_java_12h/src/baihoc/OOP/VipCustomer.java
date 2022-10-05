package baihoc.OOP;

public class VipCustomer {
    private String name;
    private double createLimit;
    private String address;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreateLimit() {
        return this.createLimit;
    }

    public void setCreateLimit(double createLimit) {
        this.createLimit = createLimit;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public VipCustomer() {
        this("Default name ", 50000.00, "default@gmail.com");
    }

    /**
     * 1st constructor empty should call the constructor with 3 parameters with
     * defalt values
     * 
     * @param name
     * @param createLimit
     * @param address
     */
    public VipCustomer(String name, double createLimit, String address) {
        this.name = name;
        this.createLimit = createLimit;
        this.address = address;
    }

    /**
     * 2nd constructor should pass on the 2 values it receives and add a default
     * value for the 3rd
     * 
     * @param name
     * @param createLimit
     * @param address-    default
     */

    public VipCustomer(String name, double createLimit) {
        // this.name = name;

        // this.createLimit = createLimit;
        this(name, createLimit, "Unknown");
    }

    /**
     * 3rd constructor should save all fields
     * 
     * @param name
     * @param createLimit
     * @param address
     */

}
