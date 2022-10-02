package ArrayList.baitap.CellPhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContact.add(contact);
        return true;

    }

    /**
     * 
     * @param contact
     * @return position of ArrayList(Contact)
     */
    private int findContact(Contact contact) {
        return this.myContact.indexOf(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        // update
        this.myContact.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContact.size(); i++) {
            Contact contact = this.myContact.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
}
