package AddressBookSystem;
import java.util.ArrayList;
import java.util.Scanner;
public class Person {
    public String firstName, lastName, address, city, state, zip, phoneNumber, emailId;
    ArrayList<Person> store = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    public void AddContact() {
        Person contact = new Person();
        System.out.println("Enter First Name And Last Name");
        contact.firstName = scan.next();
        contact.lastName = scan.next();
        System.out.println("Enter Address");
        contact.address = scan.next();
        System.out.println("Enter City");
        contact.city = scan.next();
        System.out.println("Enter State");
        contact.state = scan.next();
        System.out.println("Enter Zip Code");
        contact.zip = scan.next();
        System.out.println("Enter Phone Number");
        contact.phoneNumber = scan.next();
        System.out.println("Enter Email Id");
        contact.emailId = scan.next();
        store.add(contact);
    }
}