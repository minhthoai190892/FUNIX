package baihoc.OOP;

public class App {
    public static void main(String[] args) throws Exception {
        // todo - Tạo đối tượng dựa trên class
        ClassesPart1_Car porsche = new ClassesPart1_Car();
        porsche.setModel("asdf");
        System.out.println(porsche.getModel());

        // Sum Calculator
        // SumCalculator calculator = new SumCalculator();
        // calculator.setFirstNumber(5.0);
        // calculator.setSecondNumber(0);
        // System.out.println("Add " + calculator.getAdditionResult());
        // System.out.println("Sub " + calculator.getSubtractionResult());
        // System.out.println("Mul " + calculator.getMultiplicationResult());
        // System.out.println("Div " + calculator.getDivisionResult());

        // Person
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(-5);

        System.out.println("Full name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("Full name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("Full name = " + person.getFullName());
        // Banking
        AccountBanking bobsAccount = new AccountBanking();
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
    }
}
