package W2_3;

import java.util.ArrayList;
import java.util.Comparator;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void displayBooks() {
        System.out.printf("All Books in the Library%n");
        displayBookArray(this.books);
    }

    public void displayBookArray(ArrayList<Book> b) {
        int i = 0;
        for (Book book : b) {
            i++;
            System.out.printf("%s. %s by %s (%s)%n", i, book.getTitle(), book.getAuthor(), book.getPublicationYear());
        }
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();

        for (Book b : this.books) {
            if (b.getAuthor() == author) {
                booksByAuthor.add(b);
            }
        }

        return booksByAuthor;
    }

    public boolean isBookAvailable(String title) {
        for (Book b : this.books) {
            if (b.getTitle() == title && b.getAvailability()) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating() {
        int amount = 0;
        double totalRatings = 0;

        for (Book b : this.books) {
            amount++;
            double bookTotalRatings = b.getRatings().stream()
                    .mapToDouble(a -> a)
                    .sum();
            totalRatings += bookTotalRatings / b.getRatings().size(); 
        }

        return totalRatings / amount;
    }

    public Book getMostReviewedBook() {
        return this.books.stream()
                .max(Comparator.comparingInt(b -> b.getReviews().size()))
                .orElse(null);
    }
}