package W3_3_T3.library.model;

import java.util.ArrayList;

public class LibraryMember {
    private final String name;
    private final int memberId;

    private final ArrayList<Book> borrowedBooks;

    private static int totalMembers;
    private final ArrayList<Book> reservedBooks;

    public LibraryMember(String name) {
        totalMembers++;
        this.name = name;
        this.memberId = totalMembers;
        this.borrowedBooks = new ArrayList<>();
        this.reservedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.printf("%s (Member ID #%s)%n", getName(), getMemberId());
    }

    public void displayBorrowedBooks() {
        System.out.printf("Books borrowed by %s%n", getName());
        for (Book b : getBorrowedBooks()){
            b.displayInfo();
        }
    }

    public int getMemberId() {
        return memberId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBorrowedBook(Book book){
        this.borrowedBooks.add(book);
    }

    public void removeBorrowedBook(Book book){
        this.borrowedBooks.remove(book);
    }

    public void displayReservedBooks() {
        System.out.printf("Books reserved by %s%n", getName());
        for (Book b : getReservedBooks()){
            b.displayInfo();
        }
    }

    public ArrayList<Book> getReservedBooks() {
        return reservedBooks;
    }

    public void addReservedBook(Book book){
        this.reservedBooks.add(book);
    }

    public void removeReservedBook(Book book){
        this.reservedBooks.remove(book);
    }

}