package ArrayList.baitap.CellPhone;

public class Contact {

    private String name;
    private String phoneNumber;

    // khởi tạo đối tượng
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 
     * @param name
     * @param phoneNumber
     * @return Object Contact
     */
    public static Contact createContact(String name, String phoneNumber) {
        System.out.println(name);
        System.out.println(phoneNumber);
        return new Contact(name, phoneNumber);
    }
}
