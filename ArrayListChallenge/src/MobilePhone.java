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
        Contact contactItem = findContactItem(fullName, phoneNumber);
        contactsList.remove(contactItem);
    }

    private Contact findContactItem(String contactFullName, String contactPhoneNumber) {

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

    private Integer findContactItemPosition(String currentContactFullName) {
        int position = contactsList.indexOf(currentContactFullName);
        return position;
    }

    public boolean onFile(String searchContactFullName) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (searchContactFullName.equals(contactsList.get(i).getName())) {
                return true;
            }
        }
        return false;
    }

}
