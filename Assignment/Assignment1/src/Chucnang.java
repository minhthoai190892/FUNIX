public class Chucnang {
    public static void soNgauNhien(String cccd) {
        // ! sử dụng phương thức "substring" để cắt chuổi lấy 6 số cuối
        String soNgauNhienString = cccd.substring(6);
        System.out.println("So ngau nhien: " + soNgauNhienString);
    }

    public static void thongTinGioiTinhNamSinh(String cccd) {
        // tạo mảng giới tính và năm sinh
        String[][] gioiTinhNamSinh = {
                { "00", "Nam ", "19" }, { "01", "Nu ", "19" },
                { "02", "Nam ", "20" }, { "03", "Nu ", "20" },
                { "04", "Nam ", "21" }, { "05", "Nu ", "21" },
                { "06", "Nam ", "22" }, { "07", "Nu ", "22" },
                { "08", "Nam ", "23" }, { "09", "Nu ", "23" },
        };
        // sử dụng phương thức "substring" để lấy "giới tính" và "tuổi"
        String gioiTinh = "0" + cccd.substring(3, 4);
        String namSinh = cccd.substring(4, 6);
        // sau khi có "giới tính" và "tuổi" ta duyệt qua mảng
        for (int i = 0; i < gioiTinhNamSinh.length; i++) {
            for (int j = 0; j < gioiTinhNamSinh[i].length; j++) {
                // sử dụng phương thức "startsWith" để kiểm tra xem số đại diện cho "giới tính"
                // có trong mảng không
                if (gioiTinhNamSinh[i][j].startsWith(gioiTinh)) {
                    System.out.print(
                            "Gioi tinh: " + gioiTinhNamSinh[i][j + 1] + " | " + gioiTinhNamSinh[i][j + 2] + namSinh);

                }
            }
        }
        System.out.println();
    }

    public static void thongTinNoiSinh(String cccd) {
        // tạo mảng Tỉnh thành phố
        String[][] maTinh = {
                { "001", "Hà Nội" }, { "002", "Hà Giang" },
                { "004", "Cao Bằng" },
                { "006", "Bắc Kạn" }, { "008", "Tuyên Quang" },
                { "010", "Lào Cai" }, { "011", "HĐiện Biên" },
                { "012", "Lai Châu" }, { "014", "Sơn La" },
                { "015", "Yên Bái" }, { "017", "Hòa Bình" },
                { "019", "Thái Nguyên" }, { "020", "020" },
                { "022", "Quảng Ninh" }, { "024", "Bắc Giang" },
                { "025", "Phú Thọ" }, { "026", "Vĩnh Phúc" },
                { "027", "Bắc Ninh" }, { "030", "Hải Dương" },
                { "031", "Hải Phòng" }, { "033", "Hưng Yên" },
                { "034", "Thái Bình" }, { "035", "Hà Nam" },
                { "036", "Nam Định" }, { "035", "Hà Nam" },
                { "034", "Thái Bình" }, { "037", "Ninh Bình" },
                { "038", "Thanh Hóa" }, { "040", "Nghệ An" },
                { "042", "Hà Tĩnh" }, { "044", "Quảng Bình" },
                { "045", "Quảng Trị" }, { "046", "Thừa Thiên Huế" },
                { "048", "Đà Nẵng" },
                { "049", "Quảng Nam" }, { "051", "Quảng Ngãi" },
                { "052", "Bình Định" }, { "054", "Phú Yên" }, { "", "" },
                { "056", "Khánh Hòa" }, { "058", "Ninh Thuận" },
                { "060", "Bình Thuận" }, { "062", "Kon Tum" }, { "", "" },
                { "064", "Gia Lai" }, { "066", "Đắk Lắk" },
                { "067", "Đắk Nông" }, { "068", "Lâm Đồng" },
                { "070", "Bình Phước" },
                { "072", "Tây Ninh" }, { "074", "Bình Dương" },
                { "075", "Đồng Nai" }, { "077", "Bà Rịa - Vũng Tàu" },
                { "079", "Hồ Chí Minh" },
                { "080", "Long An" }, { "082", "Tiền Giang" },
                { "083", "Bến Tre" }, { "084", "Trà Vinh" },
                { "086", "Vĩnh Long" },
                { "087", "Đồng Tháp" }, { "089", "An Giang" },
                { "091", "Kiên Giang" }, { "092", "Cần Thơ" },
                { "093", "Hậu Giang" },
                { "094", "Sóc Trăng" }, { "095", "Bạc Liêu" },
                { "096", "Cà Mau" }
        };
        // ! lấy 3 ký đầu của "CCCD" để tìm nơi sinh
        String a = cccd.substring(0, 3);
        // duyệt mảng để lấy nơi sinh thông qua mã tĩnh
        for (int i = 0; i < maTinh.length; i++) {
            for (int j = 0; j < maTinh[i].length; j++) {
                // System.out.print(maTinh[i][j]);
                if (maTinh[i][j].startsWith(a)) {
                    System.out.print("Noi Sinh: " + maTinh[i][j + 1]);
                }
            }
        }
        System.out.println();
    }

    /**
     * 
     * @param author
     * @param version
     */
    public static void chucNangSo1(String author, String version) {
        System.out.println("+--------+------------------------------+--------+");
        System.out.println("|  NGAN HANG SO  |  " + author + "@" + version + "\t\t |");
        System.out.println("+--------+------------------------------+--------+");
        System.out.println("|  1. Nhap CCCD                                  |");
        System.out.println("|  0. Thoat                                      |");
        System.out.println("+--------+------------------------------+--------+");
        System.out.println();
    }

    public static void menuThongTin() {
        System.out.println("\t1. kiem tra noi sinh");
        System.out.println("\t2. kiem tra tuoi, gioi tinh");
        System.out.println("\t3. kiem tra so ngau nhien");
        System.out.println("\t0. Thoat");
        System.out.println();
    }
}
