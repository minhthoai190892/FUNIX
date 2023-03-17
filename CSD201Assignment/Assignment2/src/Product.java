import java.util.Objects;

public class Product implements Comparable<Product> {

    private String bcode;
    private String title;
    private int quantity;

    private double price;

    public Product(String bcode, String title, int quantity, double price) {
        this.bcode = bcode;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }

    public Product(String bcode) {
        this.bcode = bcode;
    }

    public Product() {
    }

    public String getBcode() {
        return bcode;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        // TODO Auto-generated method stub
        return this.bcode.compareTo(bcode);
    }

    @Override
    public String toString() {
        return bcode + "::" + title + "::" + quantity + "::" + price;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     * so sánh 2 phần tử liền kề nhau
     */
    @Override
    public boolean equals(Object o) {
        // TODO Auto-generated method stub
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;

        }
        Product product = (Product) o;
        return bcode.equals(product.bcode);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(bcode);
    }

    public int convertToBinary(int x, MyStack<String> binary) {
        binary.push(String.valueOf(x % 2));
        if (x==1) {//x=1 thì trả về 1 và kết thúc đệ quy
            return 1;
        }
        else{//x!=1  thì tiếp tục đệ quy bằng cách truyền và thương của phép chia x cho 2
            return convertToBinary(x/2, binary);
        }
    }

}
