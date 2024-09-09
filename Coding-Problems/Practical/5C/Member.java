import java.util.HashMap;
import java.util.Map;

public class Member implements IMember {
    private String name;
    private String memberId;
    private Map<String, IBook> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new HashMap<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMemberId() {
        return memberId;
    }

    @Override
    public void borrowBook(IBook book) {
        if (book.isAvailable()) {
            book.borrow();
            borrowedBooks.put(book.getISBN(), book);
        } else {
            throw new IllegalStateException("Book is not available");
        }
    }

    @Override
    public void returnBook(IBook book) {
        if (borrowedBooks.containsKey(book.getISBN())) {
            book.returnBook();
            borrowedBooks.remove(book.getISBN());
        } else {
            throw new IllegalStateException("Book not borrowed by this member");
        }
    }
}
