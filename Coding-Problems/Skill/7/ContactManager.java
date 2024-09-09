public interface ContactManager {
    void addContact(Contact contact);
    void removeContact(String phoneNumber);
    Contact getContact(String phoneNumber);
    void displayContacts();
}