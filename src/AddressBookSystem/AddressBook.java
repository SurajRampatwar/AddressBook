package AddressBookSystem;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Program");
        Contact contact = new Contact();
        while (true) {
            System.out.println("[1] Add New Contact");
            System.out.println("[2] Edit Existing Contact");
            System.out.println("[3] Delete Contact");
            System.out.println("[4] Display Contact");
            System.out.println("[5] Exit");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num == 1) {
                contact.addContact();
            } else if (num == 2) {
                break;
            } else if (num == 4) {
                contact.display();
            }
        }
    }
}