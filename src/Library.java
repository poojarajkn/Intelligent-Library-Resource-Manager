import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            b.displayBook();
        }
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.getBookId() == id && b.isAvailable()) {
                b.issueBook();
                System.out.println("Book issued successfully!");
                return;
            }
        }
        System.out.println("Book not available!");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.getBookId() == id && !b.isAvailable()) {
                b.returnBook();
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Invalid return request!");
    }
}
