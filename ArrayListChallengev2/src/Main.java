import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobile = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    System.out.println("Shitting down...");
                    break;
                case 1:
                    mobile.printContacts();
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
                    printInstructions();
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
        if (mobile.addNewContent(newContact)){
            System.out.println("New contact added: " + name + ", phone = " + phone);
        } else
        {
            System.out.println("Cannot add, " + name + " already on file ");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobile.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumber);
        if (mobile.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobile.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if (mobile.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobile.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }

    public static void printInstructions(){
        System.out.println("\nAvailable actions ");
        System.out.println("\t 0 - To shutdown");
        System.out.println("\t 1 - To print contacts");
        System.out.println("\t 2 - To add a new contact");
        System.out.println("\t 3 - To update an existing contact");
        System.out.println("\t 4 - To remove an existing contact");
        System.out.println("\t 5 - To query if an existing contact exists");
        System.out.println("\t 6 - To print a list of available actions");
        System.out.println("Choose your actions: ");
    }

    private static void startPhone(){
        System.out.println("Starting phone....");
    }
}
