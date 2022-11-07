public interface Withdraw {
    /**
     * Hàm rút tiền
     * @param amount số tiền
     * @return true / fasle
     */
    boolean withdraw(double amount);
    /**
     * Hàm kiểm tra số tiền người dùng muốn rút
     * @param amount số tiền
     * @return true / fasle
     */
    boolean isAccepted(double amount);
}
