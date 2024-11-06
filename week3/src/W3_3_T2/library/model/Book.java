package W3_3_T2.library.model;

public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private boolean availability;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availability = true;
    }

    public void setAvailability(boolean bool) {
        this.availability = bool;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getAvailability() {
        return availability;
    }

    public String getIsbn() {
        return isbn;
    }

    public void displayInfo() {
        System.out.printf("%s by \"%s\" (ISBN %s)%n", getTitle(), getAuthor(), getIsbn());
    }
}
