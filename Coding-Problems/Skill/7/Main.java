public class Main {
    public static void main(String[] args) {
        ContactManagement contactManagement = new ContactManagement();

        Contact contact1 = new Contact("John Doe", "1234567890");
        Contact contact2 = new Contact("Jane Doe", "9876543210");
        Contact contact3 = new Contact("Bob Smith", "5551234567");

        contactManagement.addContact(contact1);
        contactManagement.addContact(contact2);
        contactManagement.addContact(contact3);

        contactManagement.displayContacts();

        contactManagement.removeContact("9876543210");

        contactManagement.displayContacts();

        Contact retrievedContact = contactManagement.getContact("5551234567");
        if (retrievedContact != null) {
            System.out.println("Retrieved Contact: " + retrievedContact.getName() + ", " + retrievedContact.getPhoneNumber());
        } else {
            System.out.println("Contact not found!");
        }
    }
}