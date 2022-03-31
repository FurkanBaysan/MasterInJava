import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0531 470 09 25");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter Action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting Down..");
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
                    printActions(); // Print the Options Menu
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter New Contact Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the New Contact Phone Number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);// Legendary Move
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New Contact Added: " + "Name: " + name + " " +
                    "Phone: " + phoneNumber);
        } else {
            System.out.println("Can not Add" + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter Existing Contact Name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter New Contact Name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter New Contact Phone Number: ");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNumber);
        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Successfully Updated the Contact");
        } else {
            System.out.println("Error Updating Contact");
        }
    }

    private static void removeContact() {
        System.out.println("Enter Existing Contact Name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Successfully Deleted the Contact");
        } else {
            System.out.println("Error Deleting Contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter Existing Contact Name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        // If a record is found that matches the specified name, that is,
        // the name passed as a parameter, then let's print the name and phone number
        // of this Contact Object found.
        System.out.println("Name: " + existingContact.getName() + " " +
                "Phone Number: " + existingContact.getPhoneNumber());
    }

    private static void startPhone() {
        // Very-very simplistic representation of starting a Phone.
        System.out.println("Starting Phone...");
    }

    //  Menu of Options
    private static void printActions() {
        System.out.println("\nAvailable Actions:\npress");
        System.out.println("0 - to Shutdown\n" +
                "1 - to Print Contacts\n" +
                "2 - to Add a New Contact\n" +
                "3 - to Update an Existing Contact\n" +
                "4 - to Remove an Existing Contact\n" +
                "5 - Query if an Existing Contact Exists\n" +
                "6 - To Print a List of Available Actions");
        System.out.println("Choose your Action: ");
    }
}
