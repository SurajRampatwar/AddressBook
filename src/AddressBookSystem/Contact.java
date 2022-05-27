package AddressBookSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    public String firstName, lastName, address, city, state, zip, phoneNumber, emailId;
    ArrayList<Contact> store = new ArrayList<>();
    Scanner get = new Scanner(System.in);

    public void addContact() {
        Contact contact = new Contact();
        System.out.println("Enter First Name And Last Name");
        contact.firstName = get.next();
        contact.lastName = get.next();
        System.out.println("Enter Address");
        contact.address = get.next();
        System.out.println("Enter City");
        contact.city = get.next();
        System.out.println("Enter State");
        contact.state = get.next();
        System.out.println("Enter Zip Code");
        contact.zip = get.next();
        System.out.println("Enter Phone Number");
        contact.phoneNumber = get.next();
        System.out.println("Enter Email Id");
        contact.emailId = get.next();
        store.add(contact);
    }

    public void editContact(String Name) {
        Contact contact = new Contact();
        for (int i = 0; i < store.size(); i++) {
            if (Name.equals(store.get(i).firstName)) {
                System.out.println("Enter New Name");
                Scanner edit = new Scanner(System.in);
                contact.firstName = edit.next();
                System.out.println("Enter Phone Number");
                contact.phoneNumber = edit.next();
                contact.lastName = store.get(i).lastName;
                contact.address = store.get(i).address;
                contact.city = store.get(i).city;
                contact.state = store.get(i).state;
                contact.zip = store.get(i).zip;
                contact.emailId = store.get(i).emailId;
                store.set(i, contact);
            }
            System.out.println("Name not found");
        }
    }

    public void display() {
        for (int i = 0; i < store.size(); i++) {
            System.out.println("Name: " + store.get(i).firstName + " " + store.get(i).lastName);
            System.out.println("Address: " + store.get(i).address);
            System.out.println("City: " + store.get(i).city);
            System.out.println("State: " + store.get(i).state);
            System.out.println("Zip Code: " + store.get(i).zip);
            System.out.println("Phone Number: " + store.get(i).phoneNumber);
            System.out.println("Email Id: " + store.get(i).emailId);
            System.out.println("\n\n");
        }
    }
}
