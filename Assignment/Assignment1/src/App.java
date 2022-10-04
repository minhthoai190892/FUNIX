import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        System.out.println(!flag);
        while (!flag) {
            System.out.println("+--------+------------------------------+--------+");
            System.out.println("|  NGAN HANG SO  |  FX17775@v1.0.0               |");
            System.out.println("+--------+------------------------------+--------+");
            System.out.println("|  1. Nhap CCCD                                  |");
            System.out.println("|  0. Thoat                                      |");
            System.out.println("+--------+------------------------------+--------+");
            System.out.print("Chuc nang: ");
            int n = scanner.nextInt();
            // scanner.nextLine();

            switch (n) {
                case 0:
                    flag = true;
                    break;
                case 1:

                    // System.out.print("Enter cccd ");
                    // String cccd = scanner.nextLine();

                    String cccd = "";
                    scanner.nextLine();
                    // boolean flag1 = false;

                    // while (flag1) {
                    // if (cccd.length() != 2) {
                    // System.out.print("Enter cccd ");
                    // cccd = scanner.nextLine();
                    // System.out.println("CCCD phai du 2 so");
                    // flag = true;
                    // }
                    // // flag1 = false;
                    // }
                    while (cccd.length() != 2) {
                        System.out.print("Enter cccd ");
                        cccd = scanner.nextLine();
                        System.out.println("CCCD phai du 2 so");
                    }

                    System.out.println("Cccd la " + cccd);
                    break;
                default:
                    System.out.println("Nhap sai vui long nhap lai");

                    break;
            }
        }
    }
}
