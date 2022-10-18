package ArrayList.baitap.Phone;

import java.util.ArrayList;

import OOP.Point;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    /**
     * when addingor updating be sure to check if the contact already exists(use
     * name)
     * 
     * @param contact truyền vào đối tượng Contact
     * @return true / fasle
     * @ true: nếu chưa có contact trong ArrayList
     * 
     * @ fasle: nếu đã có contact trong ArrayList
     * 
     */
    public boolean addNewContact(Contact contact) {
        // kiểm tra xem "name" có trong myContacts chưa
        if (findContact(contact.getName()) >= 0) {
            // nếu có rồi ta in ra thông báo và trả về "fasle"
            System.out.println("Contact is already on file");
            return false;
        }
        // khi chưa có "name" trong myContacts ta add contact mới vào myContacts và trả
        // về true
        myContacts.add(contact);
        return true;
    }

    /**
     * 
     * @param contact truyền vào đối tượng contact
     * @return trả về vị trí của đối contact
     */
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    /**
     * 
     * @param contactName truyền vào một tên contact
     * @return
     */
    private int findContact(String contactName) {
        // sử dụng vòng lặp để duyệt qua ArrayList
        for (int i = 0; i < this.myContacts.size(); i++) {
            // khai báo biến "contact" kểu đối tượng "Contact"
            Contact contact = this.myContacts.get(i);
            // kiểm tra tên trong "myContacts" đã có chưa
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 
     * @param oldContact
     * @param newContact
     * @return true/fasle
     */
    public boolean updateContact(Contact oldContact, Contact newContact) {
        // khai báo biến dể nhận giá trị từ "findContact"
        int foundPosition = findContact(oldContact);
        // kiểm tra xem vị trí của "olaContact" có trong arrayList không
        if (foundPosition < 0) {
            System.out.println(oldContact + ", was not found.");
            return false;
        } else if (findContact(newContact) != -1) {
            System.out
                    .println("Contact with name " + newContact.getName()
                            + " already exists. Update was not successful.");
            return false;
        }
        // nếu có thì ta cập nhật trong arrayList
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    // public String queryContact(Contact contact) {
    // if (findContact(contact) >= 0) {
    // return contact.getName();
    // }
    // return null;
    // }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was delete");
        return true;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() + " -> "
                    + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
