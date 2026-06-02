package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book(1, "Java Basics", "James Gosling"));
        library.addBook(new Book(2, "Python Programming", "Guido van Rossum"));
        library.addBook(new Book(3, "Data Structures", "Mark Allen"));

        library.displayBooks();

        System.out.println("\nIssuing Book ID 2...");
        library.issueBook(2);

        library.displayBooks();

        System.out.println("\nReturning Book ID 2...");
        library.returnBook(2);

        library.displayBooks();
    }
}