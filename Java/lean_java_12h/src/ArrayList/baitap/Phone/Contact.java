package ArrayList.baitap.Phone;

public class Contact {
    // khai báo field
    private String name;
    private String phoneNumber;

    // tạo contructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    // tạo contructor

    // getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // getter and setter

    public static Contact createContact(String name, String phoneNumber) {

        return new Contact(name, phoneNumber);

    }
}
