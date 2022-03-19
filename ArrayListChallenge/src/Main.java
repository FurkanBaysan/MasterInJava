import java.util.Scanner;

public class Main {

    private static MobilePhone mobilePhone = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        printInstructions();
        int choice = 0;

        System.out.println();

        while (!quit) {
            System.out.println("Enter your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContactItems();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\t" + " 0 - Print the Options Menu");
        System.out.println("\t" + " 1 - Print the Contacts");
        System.out.println("\t" + " 2 - Add New Contact");
        System.out.println("\t" + " 3 - Modify a Contact");
        System.out.println("\t" + " 4 - Remove a Contact");
        System.out.println("\t" + " 5 - Find a Contact");
        System.out.println("\t" + " 6 - Quit the Application");
    }

    public static void addContact() {
        Contact newContact = new Contact();
        System.out.println("Enter The Contact Full Name: ");
        String contactName = scanner.nextLine();
        newContact.setName(contactName);
        System.out.println("Enter the Contact Phone Number: ");
        String contactPhoneNumber = scanner.nextLine();
        newContact.setPhoneNumber(contactPhoneNumber);
        mobilePhone.addContactItem(newContact);
    }

    public static void modifyContact() {
        System.out.println("Enter the Current Contact Full Name: ");
        String contactFullName = scanner.nextLine();
        System.out.println("Enter the Current Contact Phone Number: ");
        String contactPhoneNumber = scanner.nextLine();
        System.out.println("Enter the New Phone Number: ");
        String newPhoneNumber = scanner.nextLine();
        mobilePhone.modifyContactItem(contactFullName, contactPhoneNumber, newPhoneNumber);
    }

    public static void removeContact() {
        System.out.println("Enter the Current Contact Full Name: ");
        String currentContactFullName = scanner.nextLine();
        System.out.println("Enter the Current Contact Phone Number: ");
        String currentContactPhoneNumber = scanner.nextLine();
        mobilePhone.removeContactItem(currentContactFullName, currentContactPhoneNumber);
    }

    public static void searchForContact() {
        System.out.println("Contact Full Name to search for: ");
        String contactFullName = scanner.nextLine();
        if (mobilePhone.onFile(contactFullName)) {
            System.out.println("Found " + contactFullName);
        } else {
            System.out.println(contactFullName + " not found in the Phone Book");
        }
    }
//    public static void searchForContact() {
//        System.out.println("Contact Full Name: ");
//        String contactFullName = scanner.nextLine();
//        System.out.println("Contact Phone Number: ");
//        String contactPhoneNumber = scanner.nextLine();
//        if (mobilePhone.onFile(contactFullName)) {
//            System.out.println("Contact Found");
//            System.out.println("Name: " + mobilePhone.findContactItem(contactFullName, contactPhoneNumber).getName());
//            System.out.println("Phone Number: " + mobilePhone.findContactItem(contactFullName, contactPhoneNumber).getPhoneNumber());
//        } else {
//            System.out.println(contactFullName + " not found in the Phone Book");
//        }
//    }
}
