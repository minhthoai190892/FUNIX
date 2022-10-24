package Polymorphism.Hamburger;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & bacon", 14.54, "white");
        // TODO Auto-generated constructor stub
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        // TODO Auto-generated method stub
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        // TODO Auto-generated method stub
        System.out.println("Cannot add additional items to a deluxe burger");

    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        // TODO Auto-generated method stub
        System.out.println("Cannot add additional items to a deluxe burger");

    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        // TODO Auto-generated method stub
        System.out.println("Cannot add additional items to a deluxe burger");

    }

    @Override
    public void addHamburgerAddition5(String name, double price) {
        // TODO Auto-generated method stub
        System.out.println("Cannot add additional items to a deluxe burger");

    }

}
