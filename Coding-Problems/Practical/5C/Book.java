public class Book implements IBook {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getISBN() {
        return isbn;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void borrow() {
        if (available) {
            available = false;
        } else {
            throw new IllegalStateException("Book is already borrowed");
        }
    }

    @Override
    public void returnBook() {
        if (!available) {
            available = true;
        } else {
            throw new IllegalStateException("Book was not borrowed");
        }
    }
}
