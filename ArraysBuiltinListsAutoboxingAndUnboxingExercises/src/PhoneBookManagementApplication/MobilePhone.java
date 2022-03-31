package PhoneBookManagementApplication;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        int position = findContact(contact);
        if (position > 0) {
            System.out.println("Contact already exists in Phone Book");
            return false;
        }
        this.myContacts.add(contact);
        System.out.println("Contact Added Successfully");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println("Contact was not found");
            return false;
        }
        this.myContacts.set(position, newContact);
        System.out.println("Contact Updated Successfully");
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            System.out.println("Contact was not found");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println("Contact Removed Successfully");
        return true;
    }

    private int findContact(Contact searchContact) {
        int position = myContacts.indexOf(searchContact);
        return position;
    }

    private int findContact(String searchContactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(searchContactName)) {
                return i;
            }
        }
        return -1; //means that Contact doesn't found.
    }

    public Contact queryContact(String contactName) {
        int position = findContact(contactName);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println(myContacts.get(i).getName() + " -> " +
                    myContacts.get(i).getPhoneNumber());
        }
    }
}
