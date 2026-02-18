public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getBookId() {
        return bookId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void issueBook() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void displayBook() {
        System.out.println("ID: " + bookId +
                ", Title: " + title +
                ", Author: " + author +
                ", Available: " + isAvailable);
    }
}
