package ArrayList.baitap.Phone;

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printAction();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printAction();
                    break;
                default:
                    break;
            }
        }
    }

    private static void queryContact() {
        System.out.print("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact exitstingContactRecord = mobilePhone.queryContact(name);
        if (exitstingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + exitstingContactRecord.getName() + " phone number is "
                + exitstingContactRecord.getPhoneNumber());
    }

    private static void removeContact() {
        System.out.print("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact exitstingContactRecord = mobilePhone.queryContact(name);
        if (exitstingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(exitstingContactRecord)) {
            System.out.println("Successfully deteled");
        } else {
            System.out.println("Error deletin contact");
        }
    }

    private static void updateContact() {
        System.out.print("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact exitstingContactRecord = mobilePhone.queryContact(name);
        if (exitstingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhone);
        if (mobilePhone.updateContact(exitstingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error update record");
        }

    }

    private static void addNewContact() {
        // Nhập thông tin "contact"
        System.out.print("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        // khai báo biến kểu "Contact" và gọi hàm "createContact"
        Contact newContact = Contact.createContact(name, phone);
        // sau khi tạo được 1 contact mới ta kiểm tra xem nó có tồn tại chưa
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already one file");
        }
    }

    private static void printAction() {

        System.out.println("\nAvailabe actions:\nPress");
        System.out.println("0 - To shutdown");
        System.out.println("1 - To print contacts.");
        System.out.println("2 - To add a new contact.");
        System.out.println("3 - To update an existing contact");
        System.out.println("4 - To remove an existing contact");
        System.out.println("5 - Query if an existing contact exists");
        System.out.println("6 - To print a list of available actions");
        System.out.print("Choice your action:");

    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }
}
