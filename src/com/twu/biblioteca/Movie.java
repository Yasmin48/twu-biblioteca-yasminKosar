package com.twu.biblioteca;

public class Movie extends LibraryItem {
    private final String director;
    private final double rating;

    public Movie(String title, String director, int year, double rating, boolean onLoan) {
        super(title, year, onLoan);
        this.director = director;
        this.rating = rating;
    }

    public String getDirector() {
        return this.director;
    }

    public double getRating() {
        return this.rating;
    }


    public String toString() {
        return String.format("%s - %s, (%d), (Rating: %.2f)", this.getTitle(), this.getDirector(), this.getYear(), this.getRating());
    }
}

