import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        Randomcode randomcode = new Randomcode();
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            // tạo hằng số
            final String author = "FX17775";
            final String version = "v1.0.0";

            Chucnang.chucNangSo1(author, version);

            // scanner.nextLine();
            while (!flag) {
                int n;
                System.out.print("Chuc nang: ");
                // ! sử dụng vòng lặp để kiểm tra khi người dùng nhập vào là ký tự
                while (!scanner.hasNextInt()) {
                    String input = scanner.next();
                    System.out.printf("\"%s\" phải là số.%n", input);
                    System.out.println("Nhap sai vui long nhap lai");

                    System.out.print("Chuc nang: ");

                }
                n = scanner.nextInt();
                scanner.nextLine();
                switch (n) {
                    case 0:
                        flag = true;
                        break;
                    case 1:
                        while (!flag) {
                            // int confinCode;
                            String confinCode;

                            // tạo "mã xác nhận"
                            // int code = (int) Math.floor(((Math.random() * 899) + 100));
                            String code = randomcode.generateRandomAlphanumberic(6);

                            System.out.println("Ma xac thuc " + code);
                            System.out.print("Nhap ma xac thuc: ");
                            // ! sử dụng vòng lặp để kiểm tra khi người dùng nhập vào là ký tự
                            // while (!scanner.hasNextInt()) {

                            //     String input = scanner.next();
                            //     System.out.printf("\"%s\" mã xác thực phải là số.%n", input);
                            //     System.out.println("Ma xac thuc khong dung. Vui long thu lai.");
                            //     // code = (int) Math.floor(((Math.random() * 899) + 100));
                            //     code = randomcode.generateRandomAlphanumberic(6);
                            //     System.out.println("Ma xac thuc " + code);
                            //     System.out.print("Nhap ma xac thuc: ");

                            // }
                            // confinCode = scanner.nextInt();
                            confinCode = scanner.nextLine();
                            // scanner.nextLine();
                            // kiểm tra người dùng nhập "mã xác nhận" có đúng với "mã xác nhận" đã cho
                            if (confinCode.startsWith(code)) {
                                String cccd = "";
                                while (!flag) {
                                    System.out.print("Vui long nhap so CCCD: ");
                                    cccd = scanner.nextLine();
                                    // ! tạo quy định chỉ nhập só và độ dài 12 ký tự
                                    Pattern pattern = Pattern.compile("^[0][0-9]{11}");
                                    if (pattern.matcher(cccd).find() && cccd.length() == 12) {
                                        while (!flag) {
                                            Chucnang.menuThongTin();
                                            System.out.print("Chuc nang: ");
                                            int chon = scanner.nextInt();
                                            scanner.nextLine();
                                            switch (chon) {
                                                case 0:
                                                    flag = true;
                                                    // checkCccd = true;
                                                    break;
                                                case 1:
                                                    Chucnang.thongTinNoiSinh(cccd);
                                                    break;
                                                case 2:
                                                    Chucnang.thongTinGioiTinhNamSinh(cccd);
                                                    break;
                                                case 3:
                                                    Chucnang.soNgauNhien(cccd);
                                                    break;
                                                default:
                                                    System.out.println("Nhap sai vui long nhap lai");

                                                    break;
                                            }
                                        }
                                        // checkCccd = false;
                                    } else if (cccd.toLowerCase().startsWith("no")) {
                                        flag = true;
                                        // checkCccd = true;
                                    } else {

                                        System.out.println(
                                                "So CCCD khong hop le. CCCD phai du 12 so \nVui long nhap lai hoac ‘No’ de thoat:");

                                        flag = false;
                                    }

                                }
                                // 001123456789
                                // checkCode = true;

                            } else {
                                System.out.println("Ma xac thuc khong dung. Vui long thu lai.");
                                flag = false;
                            }
                        }
                        break;
                    default:
                        System.out.println("Nhap sai vui long nhap lai");
                        break;
                }
            }

        }
    }

}
