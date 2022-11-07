import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Animal animal = new Animal("Dog", 25);
        animal.display();
        // System.out.print("");
        // Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        // int c = scanner.nextInt();
        // // System.out.println(a + b);
        // test(a, b, c);
        // int[] array = new int[3];
        // for (int i = 0; i < array.length; i++) {
        // int temp ;
        // // array[0]=array[i+1]
        // // if (array[0]>array[i+1]) {
        // // array[0]=temp;
        // // temp = array[i+1];
        // // array[i+1]= a
        // // }

        // }

    }

    public static void test(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("a lon");
        } else if (b > a && b > c) {
            System.out.println("b lon");
        } else {
            System.out.println("c lon");
        }
    }

}
