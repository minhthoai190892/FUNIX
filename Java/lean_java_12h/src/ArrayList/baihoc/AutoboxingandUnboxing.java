package ArrayList.baihoc;

import java.util.ArrayList;

public class AutoboxingandUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integer.add(Integer.valueOf(i));
        }
        for (int i = 0; i < integer.size(); i++) {
            System.out.println(integer.get(i));
        }
    }
}
