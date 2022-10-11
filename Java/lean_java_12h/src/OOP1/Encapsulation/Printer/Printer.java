package OOP1.Encapsulation.Printer;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {

            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        // kiểm tra lượng mực đổ vào
        if (tonerAmount > 0 && tonerAmount <= 100) {
            // kiểm tra sau khi lượng mực đổ vào + với lượng mực còn trong máy
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        // khai báo biến để nhận giá trị "page"
        int pagesToPrint = pages;
        // kiểm tra nếu máy in là in 2 mặt thì chia 2
        if (this.duplex) {
            // pagesToPrint/=2;
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in dulex mode");
        }
        // cập nhật lại số giấy in
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public boolean isDuplex() {
        return this.duplex;
    }

    public boolean getDuplex() {
        return this.duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }


}
