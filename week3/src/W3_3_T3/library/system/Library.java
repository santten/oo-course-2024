package W3_3_T3.library.system;

import W3_3_T3.library.model.Book;
import W3_3_T3.library.model.LibraryMember;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;
    private final ArrayList<LibraryMember> members;

    public Library(ArrayList<Book> books, ArrayList<LibraryMember> members) {
        this.books = books;
        this.members = members;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<LibraryMember> getMembers() {
        return members;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (book.getAvailability()) {
            System.out.printf("%s is borrowing \"%s\"%n", member.getName(), book.getTitle());
            book.setAvailability(false);
            member.addBorrowedBook(book);
        } else if (member.getReservedBooks().contains(book)){
            System.out.printf("%s is borrowing \"%s\" after having it reserved!%n", member.getName(), book.getTitle());
            book.setAvailability(false);
            book.setReserveStatus(false);
            member.removeReservedBook(book);
            member.addBorrowedBook(book);
        } else {
            System.out.printf("%s tried to borrow \"%s\", but it wasn't available!%n", member.getName(), book.getTitle());
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.getBorrowedBooks().contains(book)) {
            System.out.printf("%s is returning \"%s\"%n", member.getName(), book.getTitle());
            book.setAvailability(true);
            member.removeBorrowedBook(book);
        } else {
            System.out.printf("%s tried to return \"%s\", but it was already returned or borrowed by someone else%n", member.getName(), book.getTitle());
        }
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (book.getAvailability()) {
            System.out.printf("%s is reserving \"%s\"%n", member.getName(), book.getTitle());
            book.setAvailability(false);
            book.setReserveStatus(true);
            member.addReservedBook(book);
        } else {
            System.out.printf("%s tried to reserve \"%s\", but it wasn't available!%n", member.getName(), book.getTitle());
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (member.getReservedBooks().contains(book)) {
            System.out.printf("%s is cancelling their reservation of \"%s\"%n", member.getName(), book.getTitle());
            book.setAvailability(true);
            book.setReserveStatus(false);
            member.removeReservedBook(book);
        } else {
            System.out.printf("%s tried to cancel their reservation on \"%s\", but it wasn't reserved by them...%n", member.getName(), book.getTitle());
        }
    }
}
