package Polymorphism.Hamburger;

public class App {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "pork", 1200, "white");
        // gọi hàm "itemizeHamburger" để lấy giá tiền của từng loại
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tao", 100);
        hamburger.addHamburgerAddition2("nho", 200);
        hamburger.addHamburgerAddition3("ca chua", 300);
        hamburger.addHamburgerAddition4("ca hoi", 400);
        hamburger.addHamburgerAddition5("thit vit", 500);
        System.out.println("total burger price is " + hamburger.itemizeHamburger());
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("eggs", 5.43);
        healthyBurger.addHealthyAddition1("lentils", 3.41);
        System.out.println("total healthy burger price is " + healthyBurger.itemizeHamburger());
        System.out.println("====");
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("should not do that", 50.53);
        System.out.println("total healthy burger price is " + deluxeBurger.itemizeHamburger());

    }
}
