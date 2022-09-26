package baitap.SpeedConverter;

public class SpeedConverter {
    /**
     * hàm nhận giá trị và tính tốc độ và làm tròn
     * 
     * @param kilometersPerHour
     * @return
     */
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        // lam tron so
        return Math.round(kilometersPerHour / 1.609);

    }

    /**
     * hàm hiển thị thông tin giá trị vừa nhập
     * 
     * @param kilometersPerHour
     */
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            // goi lai ham "toMilesPerHour"
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
