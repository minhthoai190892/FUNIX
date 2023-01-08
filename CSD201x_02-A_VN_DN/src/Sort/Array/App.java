package Sort.Array;

public class App {
    public static void main(String[] args) {
        int[] numbers = {2,4,1,8,3};
        reverseArray(numbers, 0, 4);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        sortArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
    public static void reverseArray(int[] numbers,int start,int end) {
        while (start<end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }
    }
    public static int[] sortArray(int[]numbers) {
        int lengthArray  = numbers.length;
        for (int i = 0; i < lengthArray-1; i++) {
            for (int j = 0; j < lengthArray-i-1; j++) {
                if (numbers[j]>numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        return numbers;
        
    }
}
