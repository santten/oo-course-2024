package W2_3;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void displayBooks(){
        System.out.printf("%nAll Books in the Library%n");
        for (Book b : this.books) {
            System.out.printf("%s by %s (%s)%n", b.getTitle(), b.getAuthor(), b.getPublicationYear());
        };
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void findBooksByAuthor(String author){
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        System.out.printf("%nAll Books by %s%n", author);
        
        for (Book b : this.books) {
            if (b.getAuthor() == author){
                booksByAuthor.add(b);
                System.out.printf("%s by %s (%s)%n", b.getTitle(), b.getAuthor(), b.getPublicationYear());
            }
        }
    }
}