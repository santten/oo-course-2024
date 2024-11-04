package W2_3;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks;

    public User(String name, int age){
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBorrowedBook(Book b) {
        this.borrowedBooks.add(b);
        b.borrowBook();
    }

    public void returnBorrowedBook(Book b){
        this.borrowedBooks.remove(b);
        b.returnBook();
    }
}
