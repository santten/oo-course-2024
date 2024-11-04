package W2_3;

public class LibraryMain {
    public static void main(String[] args) {
        System.out.println("Library");
        Library library = new Library();
        library.addBook(new Book("Dracula", "Bram Stroker", 2102));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", 1012));
        library.addBook(new Book("Book 212", "Jane Austen", 1222));
        library.addBook(new Book("Book 135", "Author Name", 1222));
        library.addBook(new Book("Book 121", "Author Name", 2102));

        library.displayBooks();
        
        System.out.println();
        
        library.borrowBook("Dracula");

        System.out.println();
        
        System.out.println("Books by Jane Austen");
        library.displayBookArray(library.findBooksByAuthor("Jane Austen"));

        System.out.println();

        System.out.println("Books by Author Name");
        library.displayBookArray(library.findBooksByAuthor("Author Name"));

        System.out.println();
        
        library.returnBook(new Book("Dracula", "Bram Stroker", 2102));
    
        System.out.println();
        
        library.displayBooks();
    }
}
