package W2_3;

public class LibraryMain {
    public static void main(String[] args) {
        System.out.println("Library");
        Library library = new Library();
        
        Book dracula = new Book("Dracula", "Bram Stroker", 2102);
        library.addBook(dracula);
        
        Book ratedBook = new Book("Book 123", "Author Name", 2024);
        ratedBook.addRating(2.4);
        ratedBook.addRating(3.5);
        ratedBook.addReview("this book was ok");
        ratedBook.addReview("i didnt like this book so much");
        library.addBook(ratedBook);
        System.out.println();

        System.out.println("Review arrays for " + ratedBook.getTitle());
        System.out.println(ratedBook.getRatings());
        System.out.println(ratedBook.getReviews());

        library.displayBooks();

        System.out.println();

        library.borrowBook("Dracula");
        System.out.printf("Dracula is %savailable%n", library.isBookAvailable("Dracula") ? "" : "not ");

        library.returnBook(dracula);
        System.out.printf("Dracula is %savailable at the Library%n", library.isBookAvailable("Dracula") ? "" : "not ");
        dracula.addRating(5.0);
        
        System.out.println();

        System.out.println("Books by Jane Austen");
        library.displayBookArray(library.findBooksByAuthor("Jane Austen"));

        System.out.println();

        System.out.println("Books by Author Name");
        library.displayBookArray(library.findBooksByAuthor("Author Name"));

        System.out.println();

        System.out.println();

        library.displayBooks();

        System.out.printf("Average rating of books in the library: %s%n", library.getAverageBookRating());
    }
}
