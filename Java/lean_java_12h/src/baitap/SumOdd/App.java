package baitap.SumOdd;

public class App {
    public static void main(String[] args) throws Exception {
        boolean number = SumOddRange.isOdd(5);
        System.out.println(number);
        int sum = SumOddRange.sumOdd(-1, 100);
        System.out.println(sum);

    }
}
