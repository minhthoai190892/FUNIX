package baihoc.OOP;

public class App {
    public static void main(String[] args) throws Exception {
        // todo - Tạo đối tượng dựa trên class
        // ClassesPart1_Car porsche = new ClassesPart1_Car();
        // porsche.setModel("asdf");
        // System.out.println(porsche.getModel());

        // ! Sum Calculator
        // SumCalculator calculator = new SumCalculator();
        // calculator.setFirstNumber(5.0);
        // calculator.setSecondNumber(0);
        // System.out.println("Add " + calculator.getAdditionResult());
        // System.out.println("Sub " + calculator.getSubtractionResult());
        // System.out.println("Mul " + calculator.getMultiplicationResult());
        // System.out.println("Div " + calculator.getDivisionResult());

        // ! Person
        // Person person = new Person();
        // person.setFirstName("");
        // person.setLastName("");
        // person.setAge(-5);
        // System.out.println("Full name = " + person.getFullName());
        // System.out.println("Teen = " + person.isTeen());
        // person.setFirstName("John");
        // person.setAge(18);
        // System.out.println("Full name = " + person.getFullName());
        // System.out.println("Teen = " + person.isTeen());
        // person.setLastName("Smith");
        // System.out.println("Full name = " + person.getFullName());

        // ! Banking
        // AccountBanking bobsAccount = new AccountBanking("123564654", 100,
        // "bankingE11", "banking@gmail.com",
        // "0123-456798");
        // System.out.println(bobsAccount.getAccountName());
        // bobsAccount.withdrawal(100.0);
        // bobsAccount.deposit(50.0);
        // bobsAccount.withdrawal(100.0);
        // bobsAccount.deposit(51.0);
        // bobsAccount.withdrawal(100.0);

        // ! Vip Customer
        // khởi tạo đối tượng
        // VipCustomer customer1 = new VipCustomer();
        // System.out.println("==Customer 1==");
        // System.out.println(customer1.getName()+ " " + customer1.getCreateLimit()+ " "
        // + customer1.getAddress());
        // System.out.println("==Customer 2==");
        // VipCustomer customer2 = new VipCustomer("Thoai", 1000.00);
        // System.out.println(customer2.getName() + " " + customer2.getCreateLimit()+ "
        // " + customer2.getAddress());
        // System.out.println("==Customer 3==");
        // VipCustomer customer3 = new VipCustomer("Customer 3", 20000.00, "123
        // sdafsfd");
        // System.out.println(customer3.getName() + " " + customer3.getCreateLimit() + "
        // " + customer3.getAddress());

        // ! Wall
        // khởi tạo đối tượng
        // WallArea wall = new WallArea(5, 4);
        // System.out.println("area= " + wall.getArea());
        // wall.setHeight(-1.5);
        // System.out.println("width= " + wall.getWidth());
        // System.out.println("height= " + wall.getHeight());
        // System.out.println("area= " + wall.getArea());

        // ! Poin
        // khởi tạo đối tượng
        // Point first = new Point(6, 5);
        // Point second = new Point(3, 1);
        // System.out.println("distance(0,0)= " + first.distance());
        // System.out.println("distance(second)= " + first.distance(second));
        // System.out.println("distance(2,2)= " + first.distance(2, 2));
        // Point point = new Point();
        // System.out.println("distance()= " + point.distance());


        // ! ComplexOperations
        // khởi tạo đối tượng
        ComplexOperations one = new ComplexOperations(1.0, 1.0);
        ComplexOperations number = new ComplexOperations(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

    }
}
