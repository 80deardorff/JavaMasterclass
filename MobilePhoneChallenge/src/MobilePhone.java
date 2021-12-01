import java.util.ArrayList;

public class MobilePhone {
    private final Contact myContact;
    private final ArrayList<Contact> contacts;

    public MobilePhone(String myName, String myNumber) {
        this.myContact = new Contact(myName, myNumber);
        this.contacts = new ArrayList<Contact>();
    }

    public boolean addContact(String name, String phoneNumber) {
        int nameLocation = (findNameIndex(name) + 1);
        int numberLocation = (findNumberIndex(phoneNumber) + 1);
        if (nameLocation > 0) {
            System.out.println("Add contact failed. Contact name already exists at location " + nameLocation);
            return false;
        } else if (numberLocation > 0) {
            System.out.println("Add contact failed. Contact number already exists at location " + numberLocation);
            return false;
        } else {
            contacts.add(Contact.createContact(name, phoneNumber));
            return true;
        }
    }

    public boolean modifyContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index < 0) {
            System.out.println("Modify contact failed. Contact was not found in contact list.");
            return false;
        } else {
            contacts.set(index, newContact);
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if (index < 0) {
            System.out.println("Remove contact failed. Contact was not found in contact list.");
            return false;
        }
        contacts.remove(index);
        return true;
    }

    public String queryContact(Contact contact) {
        int index = findContact(contact);
        if (index < 0) {
            System.out.println("Remove contact failed. Contact was not found in contact list.");
            return null;
        }
        return contact.getName();
    }

    private int findContact(Contact contact) {
        return contacts.indexOf(contact);
    }

    private int findNameIndex(String contactName) {
        Contact contact;
        for (int i = 0; i < contacts.size(); i++) {
            contact = contacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    private int findNumberIndex(String contactNumber) {
        Contact contact;
        for (int i = 0; i < contacts.size(); i++) {
            contact = contacts.get(i);
            if (contact.getPhoneNumber().equals(contactNumber)) {
                return i;
            }
        }
        return -1;
    }

    public String getMyContactName() {
        return myContact.getName();
    }

    public String getMyContactPhoneNumber() {
        return myContact.getPhoneNumber();
    }
}
