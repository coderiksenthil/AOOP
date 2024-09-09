import java.util.HashMap;
import java.util.Map;

public class Library implements ILibrary {
    private Map<String, IBook> books;
    private Map<String, IMember> members;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }

    @Override
    public void addBook(IBook book) {
        books.put(book.getISBN(), book);
    }

    @Override
    public void removeBook(IBook book) {
        books.remove(book.getISBN());
    }

    @Override
    public IBook findBook(String isbn) {
        return books.get(isbn);
    }

    @Override
    public void registerMember(IMember member) {
        members.put(member.getMemberId(), member);
    }

    @Override
    public void unregisterMember(IMember member) {
        members.remove(member.getMemberId());
    }
}
