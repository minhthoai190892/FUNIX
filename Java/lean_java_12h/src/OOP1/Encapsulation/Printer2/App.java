package OOP1.Encapsulation.Printer2;

public class App {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Toner = " + printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        // bắt đầu in 4 trang
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "
                + printer.getPagesPrinted());
        // in thêm 2 trang nữa

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "
                + printer.getPagesPrinted());
    }
}
