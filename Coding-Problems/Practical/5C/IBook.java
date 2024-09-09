public interface IBook {
    String getTitle();
    String getAuthor();
    String getISBN();
    boolean isAvailable();
    void borrow();
    void returnBook();
}
