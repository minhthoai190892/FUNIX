package baitap.SortDescending;

public class App {
    public static void main(String[] args) throws Exception {
        int[] myIntegers = SortDescending.getIntegers(5);
        int[] sorted = SortDescending.sortIntegers(myIntegers);
        SortDescending.printArray(sorted);
    }
}
