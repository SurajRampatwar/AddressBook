package AddressBookSystem;
import java.util.Scanner;
public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Program");
        Person contact = new Person();
        while (true) {
            System.out.println("[1] Add New Contact");
            System.out.println("[2] Edit Existing Contact");
            System.out.println("[3] Delete Contact");
            System.out.println("[4] Exit");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num == 1) {
                contact.AddContact();
                break;
            }
        }
    }
}