import PhoneBookManagementApplication.Contact;
import PhoneBookManagementApplication.MobilePhone;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t" + "-- Sorted Array Exercise --");
        int[] inputHolderArray;
        inputHolderArray = SortedArray.getIntegers(5);
        System.out.println("\t" + "Printing Unsorted Array");
        SortedArray.printArray(inputHolderArray);
        SortedArray.sortIntegers(inputHolderArray);
        System.out.println("\t" + "Printing Sorted Array");
        SortedArray.printArray(inputHolderArray);
        System.out.println("\t" + "-- Minimum Element Exercise --");
        int returnedCount = MinimumElement.readInteger();
        int[] returnedArray = MinimumElement.readElements(returnedCount);
        int returnedMinimum = MinimumElement.findMin(returnedArray);
        System.out.println("Minimum Element: " + returnedMinimum);
        System.out.println("\t" + "-- Reverse Array Challenge --");
        int[] originalArray = new int[]{1, 2, 3, 4, 5};
        ReverseArray.reverse(originalArray);
        System.out.println("-- Phone Book Management System in a Mobile Phone --");
//        MobilePhone mobilePhone = new MobilePhone("0531 470 09 25");
//        Contact contact = Contact.createContact("Furkan", "0531 470 09 25");
//        Contact secondContact = Contact.createContact("Omer", "0532 546 30 00");
//        Contact thirdContact = Contact.createContact("Serap", "0533 142 73 53");
//        mobilePhone.addNewContact(contact);
//        mobilePhone.addNewContact(secondContact);
//        mobilePhone.addNewContact(thirdContact);
//        mobilePhone.printContacts();
//        mobilePhone.removeContact(contact);
//        mobilePhone.printContacts();
//        Contact newContact = Contact.createContact("Ali Anil", "0534 201 16 99");
//        mobilePhone.updateContact(secondContact,newContact);
//        mobilePhone.printContacts();


    }
}
