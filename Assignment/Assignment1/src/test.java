import java.util.Random;
import java.util.Scanner;


public class test {
    public static void main(String[] args) throws Exception {
        Scanner foo = new Scanner(System.in);

        // String[][] gioiTinhNamSinh = {
        //         { "0", "Nam ", "19" }, { "1", "Nu ", "19" },
        //         { "2", "Nam ", "20" }, { "3", "Nu ", "20" },
        //         { "4", "Nam ", "21" }, { "5", "Nu ", "21" },
        //         { "6", "Nam ", "22" }, { "7", "Nu ", "22" },
        //         { "8", "Nam ", "23" }, { "9", "Nu ", "23" },
        // };
                Randomcode ran = new Randomcode();
                String code = ran.generateRandomAlphanumberic(6);
                System.out.println(code);
        // String[][] car2 = { { "0", "Nam", "19" }, { "1", "Nu", "19" }, { "2",
        // "Nam", "20" }, { "3", "Nu", "20" } };
        String[][] car3 = { { "0", "Nam" }, { "1", "Nu" }, { "2",
                "Nam" }, { "3", "Nu" } };
        // String t = "15";
        // String a = "3";
        // String cccd = "037153000257";
        // String a = cccd.substring(3, 4);
        // String a ;
        // System.out.println(a instanceof String);
        // for (int i = 0; i < gioiTinhNamSinh.length; i++) {

        // for (int j = 0; j < gioiTinhNamSinh[i].length; j++) {
        // // a = cccd.substring(3, 4);
        // // System.out.print(gioiTinhNamSinh[i][j]);
        // if (gioiTinhNamSinh[i][j].startsWith(a)) {
        // System.out.print(
        // gioiTinhNamSinh[i][j] + " " + gioiTinhNamSinh[i][j + 1] );
        // }
        // //+ " " + car3[i][j + 2]
        // }
        // // System.out.println();
        // }

        // tạo mảng Tỉnh thành phố
        // String[][] maTinh = {
        //         { "00", "Nam ", "19" }, { "01", "Nu ", "19" },
        //         { "02", "Nam ", "20" }, { "03", "Nu ", "20" },
        //         { "04", "Nam ", "21" }, { "05", "Nu ", "21" },
        //         { "06", "Nam ", "22" }, { "07", "Nu ", "22" },
        //         { "08", "Nam ", "23" }, { "09", "Nu ", "23" },
        //         // { "1", "Hà Nội", "199" }, { "2", "Hà Giang" },
        //         // { "4", "Cao Bằng" },
        //         // { "6", "Bắc Kạn" }, { "8", "Tuyên Quang" },
        //         // { "0", "Lào Cai" }, { "1", "HĐiện Biên" },
        //         // { "2", "Lai Châu" }, { "4", "Sơn La" },
        //         // { "5", "Yên Bái" }, { "7", "Hòa Bình" },
        // };
        // String cccd = "037853000257";
        // String a =cccd.substring(6);
        // System.out.println(a);
        // for (int i = 0; i < maTinh.length; i++) {
        //     for (int j = 0; j < maTinh[i].length; j++) {
        //         // System.out.print(maTinh[i][j]+" ");
        //         if (maTinh[i][j].startsWith(a)) {
        //             System.out.print(maTinh[i][j + 1] + " " + maTinh[i][j+2]);
        //             // System.out.println();
        //         }
        //     }
        // }

        // ! lấy 3 ký đầu của "CCCD" để tìm nơi sinh
        // System.out.println(a);
        // String a = cccd.substring(3, 4);
        // duyệt mảng để lấy nơi sinh thông qua mã tĩnh

        // System.out.println("nam sinh"+namSinh);
        // System.out.println(gioiTinh);

        // System.out.print("Enter your phone: ");
        // while (true) {
        // String a = foo.nextLine();

        // Pattern pattern = Pattern.compile("^[0][0-9]{11}");
        // if (pattern.matcher(a).find()) {
        // System.out.println("day la so " + a);
        // } else {
        // System.out.println("khong phai so");
        // }
        // }
        // int number;

        // boolean flag = false;
        // while (!flag) {
        // System.out.print("Enter number: ");
        // if (!foo.hasNextInt()) {
        // String numberString = foo.nextLine();
        // System.out.println(numberString + "not number");
        // }
        // number = foo.nextInt();
        // System.out.println(number + " is number");
        // }

        // final String NAME = "Thoai";
        // System.out.println(NAME);

        // int number;
        // while (true) {

        // System.out.print("Chon so ");
        // while (!foo.hasNextInt()) {
        // String input = foo.next();
        // System.out.printf("\"%s\" is not a valid number.%n", input);
        // }
        // number = foo.nextInt();
        // boolean flag = false;
        // switch (number) {
        // case 0:
        // flag = true;
        // break;
        // case 1:
        // boolean checkCode = false;
        // while (!checkCode) {
        // int code = (int) Math.floor(((Math.random() * 899) + 100));
        // System.out.println(code);
        // System.out.print("Nhap ma xac thuc: ");
        // // System.out.println();
        // int confinCode = foo.nextInt();
        // foo.nextLine();
        // if (confinCode == code) {
        // String cccd = "";
        // boolean checkCccd = false;
        // while (!checkCccd) {
        // System.out.print("Vui long nhap so CCCD: ");
        // cccd = foo.nextLine();
        // Pattern pattern = Pattern.compile("^[0-9]{12}");
        // // if (cccd.length() == 12) {
        // if (pattern.matcher(cccd).find() && cccd.length() == 12) {

        // // System.out.println(cccd);
        // boolean checkInfo = false;
        // while (!checkInfo) {
        // System.out.println("\t1. kiem tra noi sinh");
        // System.out.println("\t2. kiem tra tuoi, gioi tinh");
        // System.out.println("\t3. kiem tra so ngau nhien");
        // System.out.println("\t0. Thoat");
        // System.out.println();
        // System.out.print("Chuc nang: ");
        // int chon = foo.nextInt();
        // switch (chon) {
        // case 0:
        // checkInfo = true;
        // break;
        // case 1:

        // String[][] maTinh = { { "001", "Hà Nội" }, { "002", "Hà Giang" },
        // { "004",
        // "Cao Bằng" },
        // { "006", "Bắc Kạn" } };
        // String a = cccd.substring(0, 3);
        // for (int i = 0; i < maTinh.length; i++) {
        // for (int j = 0; j < maTinh[i].length; j++) {
        // // System.out.print(maTinh[i][j]);
        // if (maTinh[i][j].startsWith(a)) {
        // System.out.print("Noi Sinh: " + maTinh[i][j + 1]);
        // }
        // }
        // }
        // System.out.println();
        // break;
        // case 2:
        // System.out.println("Chuc nang 2");
        // break;
        // case 3:
        // System.out.println("Chuc nang 3");
        // break;
        // default:
        // System.out.println("Nhap sai vui long nhap lai");

        // break;
        // }
        // }

        // } else if (cccd.toLowerCase().startsWith("no")) {
        // checkCode = true;
        // checkCccd = true;

        // } else {

        // System.out.println("So CCCD khong hop le. \nVui long nhap lai hoac ‘No’ de
        // thoat:");

        // checkCccd = false;
        // }

        // }
        // // 001123456789
        // // checkCode = true;

        // } else {
        // System.out.println("Ma xac thuc khong dung. Vui long thu lai.");
        // checkCode = false;
        // }
        // }
        // break;
        // default:
        // System.out.println("Nhap sai vui long nhap lai");
        // flag = false;
        // break;
        // }

        // System.out.printf("You have entered a positive number %d.%n", number);
        // }

        // System.out.print("Enter cccd: ");
        // String cccd = foo.nextLine();
        // System.out.println(cccd);
        // // 037153000257
        // int intGioitinh = Integer.parseInt(cccd.substring(3, 4));
        // int namSinh = Integer.parseInt(cccd.substring(3, 4));
        // if (intGioitinh == 1 || intGioitinh == 0) {
        // System.out.println("dung");
        // }
        // System.out.println(intGioitinh);

        // boolean check = false;
        // System.out.println("nhap cccd: ");

        // String cccd = foo.nextLine();

        // System.out.println(no == no);

        // if (cccd.toLowerCase().startsWith("no")) {
        // System.out.println("dung");
        // } else
        // System.out.println("sai");
        // while (!check) {
        // if (cccd == no) {
        // System.out.println("chon NO");
        // check = true;
        // } else {
        // System.out.println("Error");
        // check = false;

        // }
        // // if (cccd.length() == 12) {
        // // System.out.println("cccd " + cccd);
        // // check =false;
        // // }
        // }

    }
}
