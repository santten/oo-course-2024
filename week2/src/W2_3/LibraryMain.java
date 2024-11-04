package W2_3;

public class LibraryMain {
    public static void main(String[] args) {
        System.out.println("Library");
        Library library = new Library();
        library.addBook(new Book("Dracula", "Bram Stroker", 2102));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", 1012));
        library.addBook(new Book("Book 2", "Jane Austen", 1222));
    library.displayBooks();
    library.findBooksByAuthor("Jane Austen");
    }
}
