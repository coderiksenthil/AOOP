public interface IMember {
    String getName();
    String getMemberId();
    void borrowBook(IBook book);
    void returnBook(IBook book);
}
