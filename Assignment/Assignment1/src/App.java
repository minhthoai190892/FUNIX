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
            System.out.println();
            System.out.print("Chuc nang: ");

            int n = scanner.nextInt();
            // scanner.nextLine();

            switch (n) {
                case 0:
                    flag = true;
                    break;
                case 1:
                    boolean checkCode = false;
                    while (!checkCode) {
                        int code = (int) Math.floor(((Math.random() * 899) + 100));
                        System.out.println(code);
                        System.out.print("Nhap ma xac thuc: ");
                        // System.out.println();
                        int confinCode = scanner.nextInt();
                        scanner.nextLine();
                        if (confinCode == code) {
                            String cccd = "";
                            boolean checkCccd = false;
                            while (!checkCccd) {
                                System.out.print("Vui long nhap so CCCD: ");
                                cccd = scanner.nextLine();
                                if (cccd.length() == 12) {
                                    // System.out.println(cccd);
                                    boolean checkInfo = false;
                                    while (!checkInfo) {
                                        System.out.println("\t\t1. kiem tra noi sinh");
                                        System.out.println("\t\t2. kiem tra tuoi, gioi tinh");
                                        System.out.println("\t\t3. kiem tra so ngau nhien");
                                        System.out.println("\t\t0. Thoat");
                                        System.out.println();
                                        System.out.print("Chuc nangw: ");
                                        int chon = scanner.nextInt();
                                        switch (chon) {
                                            case 0:
                                                checkInfo = true;

                                                break;
                                            case 1:
                                                System.out.println("Chuc nang 1");
                                                break;
                                            case 2:
                                                System.out.println("Chuc nang 2");
                                                break;
                                            case 3:
                                                System.out.println("Chuc nang 3");
                                                break;
                                            default:
                                                System.out.println("Nhap sai vui long nhap lai");

                                                break;
                                        }
                                    }

                                } else {
                                    System.out.println("So CCCD khong hop le. \nVui long nhap lai hoac ‘No’ de thoat:");
                                    checkCccd = false;
                                }

                            }

                            checkCode = true;

                        } else {
                            System.out.println("Ma xac thuc khong dung. Vui long thu lai.");
                            checkCode = false;
                        }
                    }

                    // if (a == code) {
                    // // String cccd = "";
                    // // scanner.nextLine();
                    // // while (cccd.length() != 2) {
                    // // System.out.print("Enter cccd ");
                    // // cccd = scanner.nextLine();
                    // // System.out.println("CCCD phai du 2 so");
                    // // }
                    // // System.out.println("Cccd la " + cccd);
                    // System.out.println("test");
                    // } else {
                    // System.out.println("no");
                    // }

                    break;
                default:
                    System.out.println("Nhap sai vui long nhap lai");
                    break;
            }
        }
    }
}
