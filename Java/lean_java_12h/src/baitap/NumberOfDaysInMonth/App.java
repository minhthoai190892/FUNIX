package baitap.NumberOfDaysInMonth;

public class App {
    public static void main(String[] args) throws Exception {
        boolean leapYear = NumberOfDaysInMonth.isLeapYear(2000);
        System.out.println(leapYear);
        System.out.println("----");
        int a = NumberOfDaysInMonth.getDaysInMonth(8, 2020);
        System.out.println(a);
       
    }
}
