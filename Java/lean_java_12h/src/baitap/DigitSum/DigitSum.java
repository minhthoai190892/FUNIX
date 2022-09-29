package baitap.DigitSum;

public class DigitSum {
    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) {
            return -1;
        }
        // ! 125->125/10=12->12*10=120->125-120=5
        while (number > 0) {
            // ! extract the lest-significant digit
            int digit = number % 10;
            sum += digit; 
            // ! drop the lest-significant digit
            number /= 10;

        }
        return sum;

    }
}
