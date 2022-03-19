import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactsList = new ArrayList<Contact>();//Holding the Contact Objects.

    public void addContactItem(Contact contact) {
        contactsList.add(contact);
    }

    public void printContactItems() {
        System.out.println("Number of Contacts: " + contactsList.size());
        for (Contact contact : contactsList) {
            System.out.println("Contact Name: " + contact.getName() + " " +
                    "Contact Phone: " + contact.getPhoneNumber());
        }
    }

    public void modifyContactItem(String currentContactFullName, String currentContactPhoneNumber, String newContactPhoneNumber) {
        Contact contact = findContactItem(currentContactFullName, currentContactPhoneNumber);
        contact.setPhoneNumber(newContactPhoneNumber);
        System.out.println("Contact Item " +
                " has been modified.");
    }

    public void removeContactItem(String fullName, String phoneNumber) {
        /* Using the findContactItem(contactFullName,contactPhoneNumber), we can directly find the specified
         Contact Object as we can see below
         */
        // Contact currentContact = findContactItem(fullName, phoneNumber);
        Integer contactItemPosition = findContactItemPosition(fullName, phoneNumber);
        Contact contact = contactsList.get(contactItemPosition);
        contactsList.remove(contact);
    }

    // This method find the specified Contact Object
    public Contact findContactItem(String contactFullName, String contactPhoneNumber) {

        String resultFullName = " ";
        String resultPhoneNumber = " ";
        Contact contact = new Contact();

        for (int i = 0; i < contactsList.size(); i++) {
            if ((contactFullName.equals(contactsList.get(i).getName()) &&
                    contactPhoneNumber.equals(contactsList.get(i).getPhoneNumber()))) {
                resultFullName = contactFullName;
                resultPhoneNumber = contactPhoneNumber;
                contact = contactsList.get(i);
            }
        }
        return contact;
    }

    // This method find the index (position) of specified Contact Object
    public Integer findContactItemPosition(String contactFullName, String contactPhoneNumber) {

        Contact contact = new Contact();

        for (int i = 0; i < contactsList.size(); i++) {
            if (contactFullName.equals(contactsList.get(i).getName()) &&
                    contactPhoneNumber.equals(contactsList.get(i).getPhoneNumber())) {
                contact = contactsList.get(i);
            }
        }
        return contactsList.indexOf(contact);
    }

    public boolean onFile(String contactFullName) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactFullName.equals(contactsList.get(i).getName())) {
                return true;
            }
        }
        return false;
    }

}
