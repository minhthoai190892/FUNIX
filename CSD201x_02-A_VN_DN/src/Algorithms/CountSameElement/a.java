package Algorithms.CountSameElement;

import java.util.HashMap;
import java.util.Map;

public class a {
    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 2 ,3,3,3,3,3,5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <a.length; i++) {
            addElement(map, a[i]);
        }
        System.out.print("Các phần tử xuất hiện 2 lần: \n");
        for (Integer key : map.keySet()) {
            System.out.printf("%d xuất hiện %d lần.\n", key, map.get(key));
        }
    }
    public static void addElement(Map<Integer,Integer> map,int element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }

}



