import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("+--------+------------------------------+--------+");
        System.out.println("|  NGAN HANG SO  |  FX17775@v1.0.0               |");
        System.out.println("+--------+------------------------------+--------+");
        System.out.println("|  1. Nhap CCCD                                  |");
        System.out.println("|  0. Thoat                                      |");
        System.out.println("+--------+------------------------------+--------+");
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        scanner.close();
        while (true) {
            System.out.print("Chuc nang: ");
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println("Asd");
            }
        }

    }
}
