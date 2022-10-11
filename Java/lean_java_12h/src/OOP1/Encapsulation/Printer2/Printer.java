package OOP1.Encapsulation.Printer2;

/**
 * In this exercise you will create one class and name it Printer. This class
 * will have two member variables of type int, tonerLevel and pagesPrinted, and
 * one of type boolean called duplex. All three fields will have private access.
 * The constructor will accept two of these variables, tonerLevel and duplex, as
 * parameters following these rules:
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // khởi tạo đối tượng
    /**
     * tonerLevel must be greater than -1 but less than or equal to 100. If it does
     * not meet these conditions then it should be initialized to -1.
     * 
     * @param tonerLevel
     * @param duplex
     */
    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    /**
     * addToner will accept one parameter, tonerAmount of type int. First off,
     * tonerAmount should be greater than 0 and less than or equal to 100. If this
     * condition is met a second test must be included to test whether tonerLevel
     * plus tonerAmount is greater than 100. If so, the method should return -1. If
     * not then tonerLevel should have the incoming tonerAmount added to it and the
     * new tonerLevel should then be returned by the method. Also, if the initial
     * condition test fails, then the method should return -1.
     * 
     * @param tonerAmount
     * @return
     */
    public int addToner(int tonerAmount) {
        // kiểm tra "tonerAmount" >0 và <=100
        if (tonerAmount > 0 && tonerAmount <= 100) {
            // đúng
            // kiểm tra "tonerLevel + tonerAmount" >100
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;

        } else {
            return -1;
        }
    }

    /**
     * printPages will accept one parameter, pages of type int. A variable called
     * pagesToPrint should be created and initialized to the value of the incoming
     * parameter. A conditional check should be performed on whether the Printer
     * class field, duplex, is either "true" or "false". If "true" then a
     * calculation must be performed to determine the number of pages needed to
     * print the job double sided. The pagesToPrint value is then added to the class
     * field pagesPrinted, but the value of pagesToPrint should be returned by the
     * method.
     * 
     * @param pages
     * @return 
     */
    public int printPages(int pages) {
        int pagesToPrint = pages;
        //kiểm tra máy in có in 2 mặt không
        if (this.duplex) {
            pagesToPrint = (pages/2)+(pages%2);
           
        }
        //cập nhật pagesPrinted
        this.pagesPrinted = pagesToPrint;
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
