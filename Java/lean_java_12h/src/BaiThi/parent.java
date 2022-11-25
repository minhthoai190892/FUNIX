package BaiThi;

public class parent {

    private String name;

    public parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3) {
            System.out.println("Nhap lai");
            this.name = null;
        } else {

            this.name = name;
        }
    }

}
