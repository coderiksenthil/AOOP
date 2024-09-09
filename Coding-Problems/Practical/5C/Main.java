public class Main {
    public static void main(String[] args) {
        // Create instances of the Library, Books, and Members
        Library library = new Library();

        // Create and add books to the library
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");
        library.addBook(book1);
        library.addBook(book2);

        // Create and register members
        Member member1 = new Member("Alice Smith", "M001");
        Member member2 = new Member("Bob Johnson", "M002");
        library.registerMember(member1);
        library.registerMember(member2);

        // Test borrowing a book
        System.out.println("Borrowing '1984' by Alice Smith...");
        member1.borrowBook(book1);
        System.out.println("Book '1984' availability: " + book1.isAvailable());

        // Test returning a book
        System.out.println("Returning '1984'...");
        member1.returnBook(book1);
        System.out.println("Book '1984' availability: " + book1.isAvailable());

        // Attempt to borrow a book that's already borrowed
        System.out.println("Attempting to borrow '1984' by Bob Johnson...");
        try {
            member2.borrowBook(book1); // This should fail as the book is already borrowed
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // Show the book and member details
        System.out.println("Book Details: " + book1.getTitle() + ", Author: " + book1.getAuthor() + ", ISBN: " + book1.getISBN());
        System.out.println("Member Details: " + member1.getName() + ", Member ID: " + member1.getMemberId());
    }
}
