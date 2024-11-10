package W3_3_T3.library;

import W3_3_T3.library.model.Book;
import W3_3_T3.library.model.LibraryMember;
import W3_3_T3.library.system.Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(new ArrayList<>(), new ArrayList<>());

        LibraryMember member1 = new LibraryMember("Jack");
        LibraryMember member2 = new LibraryMember("Jill");
        LibraryMember member3 = new LibraryMember("Jane");

        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);

        Book book1 = new Book("Amazing Book", "Author Name", "01234-X-213");
        Book book2 = new Book("Boring Book", "Best Author", "3123-4123111");
        Book book3 = new Book("Okay Book", "Book Author", "12421314-X");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Books in the library currently:");
        for (Book b : library.getBooks()) {
            b.displayInfo();
        }
        System.out.println();

        System.out.println("Members of the library currently:");
        for (LibraryMember m : library.getMembers()) {
            m.displayInfo();
        }
        System.out.println();

        library.reserveBook(member1, book1);
        library.reserveBook(member2, book1);
        library.borrowBook(member1, book1);
        library.borrowBook(member1, book2);
        library.borrowBook(member1, book3);

        System.out.println();
        member1.displayBorrowedBooks();
        System.out.println();

        library.returnBook(member1, book2);
        library.borrowBook(member2, book2);
        library.returnBook(member1, book3);
        library.borrowBook(member3, book3);
        library.borrowBook(member2, book3);

        System.out.println();
        member1.displayBorrowedBooks();
        System.out.println();
        member2.displayBorrowedBooks();
        System.out.println();
        member3.displayBorrowedBooks();

        System.out.println();
        library.returnBook(member1, book3);
        library.returnBook(member2, book2);
        library.reserveBook(member3, book2);

        System.out.println();
        member3.displayReservedBooks();

        System.out.println();
        library.cancelReservation(member3, book2);
        library.cancelReservation(member2, book2);
    }
}
