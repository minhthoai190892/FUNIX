package Algorithms.BirthdayCakeCandles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 0;
        if (candles.size() == 1) {
            return 1;
        }
        candles.sort(Comparator.reverseOrder() ); // big to small
        int max = candles.get(0);
        for (int i = 0; i < candles.size(); i++) {
            if (max == candles.get(i) ) {
                count++;
            }
        }
        return count;
    
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(1);
        System.out.println(birthdayCakeCandles(list));
    }
}
