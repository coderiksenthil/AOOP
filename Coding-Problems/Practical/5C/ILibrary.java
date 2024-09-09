public interface ILibrary {
    void addBook(IBook book);
    void removeBook(IBook book);
    IBook findBook(String isbn);
    void registerMember(IMember member);
    void unregisterMember(IMember member);
}
