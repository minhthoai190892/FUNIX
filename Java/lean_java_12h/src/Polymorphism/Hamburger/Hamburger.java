package Polymorphism.Hamburger;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;
    private String addition5Name;
    private double addition5Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    /**
     * Hàm khởi tạo "Hamburger" loại 1
     * Hamburger
     * @param name
     * @param price
     */
    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    /**
     * Hàm khởi tạo "Hamburger" loại 2
     * 
     * @param name
     * @param price
     */
    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    /**
     * Hàm khởi tạo "Hamburger" loại 3
     * 
     * @param name
     * @param price
     */
    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    /**
     * Hàm khởi tạo "Hamburger" loại 4
     * 
     * @param name
     * @param price
     */
    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    /**
     * Hàm khởi tạo "Hamburger" loại 5
     * 
     * @param name
     * @param price
     */
    public void addHamburgerAddition5(String name, double price) {
        this.addition5Name = name;
        this.addition5Price = price;
    }
/**
 * Hàm kiểm tra loại của "Hamburger"
 * 
 * @return price
 */
    public double itemizeHamburger() {
        double HamburgerPrice = this.price;
        System.out.println(this.name + " Hamburger on a " + this.breadRollType + " roll with "+this.meat+" price is " + this.price);
        if (this.addition1Name != null) {
            HamburgerPrice += this.addition1Price;
            System.out.println("Add " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name != null) {
            HamburgerPrice += this.addition2Price;
            System.out.println("Add " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name != null) {
            HamburgerPrice += this.addition3Price;
            System.out.println("Add " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name != null) {
            HamburgerPrice += this.addition4Price;
            System.out.println("Add " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        if (this.addition5Name != null) {
            HamburgerPrice += this.addition5Price;
            System.out.println("Add " + this.addition5Name + " for an extra " + this.addition5Price);
        }

        return HamburgerPrice;

    }

}
