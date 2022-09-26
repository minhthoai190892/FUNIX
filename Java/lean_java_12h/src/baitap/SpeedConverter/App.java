package baitap.SpeedConverter;

public class App {
    public static void main(String[] args) throws Exception {
        // gọi hàm ở "file" khác
        double miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);
        // gọi hàm hiển thị thông tin
        SpeedConverter.printConversion(10.5);
    }

}
