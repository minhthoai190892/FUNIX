package lab.lap10OOP.ArrayCalculator;

public class App {
    public static void main(String[] args) {
        ArrayCalculator arrayCalculator = new ArrayCalculator();
        int[] arr1 = new int[] { 3, 4, 2 };
        double[] arr2 = new double[] { 1.3, 4.2, 6.7 };
        System.out.println("Min double " + arrayCalculator.minOfArray(arr2));
        System.out.println("Min int " + arrayCalculator.minOfArray(arr1));
        System.out.println("Max double " + arrayCalculator.maxOfArray(arr2));
        System.out.println("Max int " + arrayCalculator.maxOfArray(arr1));

    }
}
