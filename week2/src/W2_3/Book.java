package W2_3;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private ArrayList<Double> ratings;
    private ArrayList<String> reviews;
    private boolean availability;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ratings = new ArrayList<>();
        this.reviews = new ArrayList<>();
        this.availability = true;
    }

    public void borrowBook() {
        this.availability = false;
    }

    public void returnBook() {
        this.availability = true;
    }

    public boolean getAvailability() {
        return this.availability;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public ArrayList<Double> getRatings() {
        return ratings;
    }

    public void addRating(Double rating) {
        this.ratings.add(rating);
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void addReview(String review) {
        this.reviews.add(review);
    }
}