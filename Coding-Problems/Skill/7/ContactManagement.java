import java.util.*;

public class ContactManagement {
    private Set<Contact> contacts; // Using a Set to store unique contacts
    private Map<String, Contact> contactMap; // Using a Map to efficiently access contacts by phone number

    public ContactManagement() {
        this.contacts = new HashSet<>();
        this.contactMap = new HashMap<>();
    }

    public void addContact(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            contactMap.put(contact.getPhoneNumber(), contact);
            System.out.println("Contact added successfully!");
        } else {
            System.out.println("Contact already exists!");
        }
    }

    public void removeContact(String phoneNumber) {
        if (contactMap.containsKey(phoneNumber)) {
            Contact contact = contactMap.get(phoneNumber);
            contacts.remove(contact);
            contactMap.remove(phoneNumber);
            System.out.println("Contact removed successfully!");
        } else {
            System.out.println("Contact not found!");
        }
    }

    public Contact getContact(String phoneNumber) {
        return contactMap.get(phoneNumber);
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName() + ", Phone Number: " + contact.getPhoneNumber());
        }
    }
}