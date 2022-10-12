package lab.lap10OOP.ArrayCalculator;

public class ArrayCalculator {
    public int maxOfArray(int[] arr) {
        int maxArray = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArray) {
                maxArray = arr[i];
            }
        }
        return maxArray;
    }

    public double maxOfArray(double[] arr) {
        double maxArray = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArray) {
                maxArray = arr[i];
            }
        }
        return maxArray;
    }

    public int minOfArray(int[] arr) {
        int minArray = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minArray) {
                minArray = arr[i];
            }
        }
        return minArray;
    }

    public double minOfArray(double[] arr) {
        double minArray = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minArray) {
                minArray = arr[i];
            }
        }
        return minArray;
    }
}
