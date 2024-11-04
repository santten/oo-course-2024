package W2_3;

public class LibraryMain {
    public static void main(String[] args) {
        System.out.println("Library");
        Library library = new Library();
        
        Book prideAndPrejudice = new Book("Pride and Prejudice", "Jane Austen", 2024);
        prideAndPrejudice.addRating(3.5);
        library.addBook(prideAndPrejudice);

        Book dracula = new Book("Dracula", "Bram Stroker", 2102);
        library.addBook(dracula);
        
        Book ratedBook = new Book("Book 123", "Author Name", 2024);
        ratedBook.addRating(2.4);
        ratedBook.addRating(3.5);
        ratedBook.addReview("this book was ok");
        ratedBook.addReview("i didnt like this book so much");
        library.addBook(ratedBook);
        System.out.println();


        library.displayBooks();

        System.out.println();

        User user = new User("Jane Doe", 21);
        System.out.printf("%s is borrowing %s%n", user.getName(), dracula.getTitle());
        user.addBorrowedBook(dracula);
        System.out.printf("Dracula is %savailable at the Library%n", library.isBookAvailable("Dracula") ? "" : "not ");
        dracula.addRating(5.0);
        
        user.returnBorrowedBook(dracula);
        System.out.printf("%s is returning %s%n", user.getName(), dracula.getTitle());
        System.out.printf("Dracula is %savailable at the Library%n", library.isBookAvailable("Dracula") ? "" : "not ");
        
        System.out.println();

        System.out.println("Books by \"Jane Austen\"");
        library.displayBookArray(library.findBooksByAuthor("Jane Austen"));

        System.out.println();

        System.out.println("Books by \"Author Name\"");
        library.displayBookArray(library.findBooksByAuthor("Author Name"));

        System.out.println();

        System.out.println();

        library.displayBooks();

        System.out.println();
        System.out.println("Library Statistics");
        System.out.printf("Average rating of books in the library: %.2f%n", library.getAverageBookRating());
        Book mostReviewed = library.getMostReviewedBook();
        System.out.printf("Most reviewed book: \"%s\" by %s (%s)%n", mostReviewed.getTitle(), mostReviewed.getAuthor(), mostReviewed.getPublicationYear());
    }
}
