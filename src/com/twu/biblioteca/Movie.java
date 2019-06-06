package com.twu.biblioteca;

public class Movie {

    // name, year , director and moving rating

    private final String name;
    private final String director;
    private final int year;
    private final double rating;


    public Movie(String name, String director, int year, double rating) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }


    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public String getDirector() {
        return this.director;
    }

    public double getRating() {
        return this.rating;
    }

    public String toString() {
        return String.format("%s, by %s, (%d), (Rating: %.2f)", this.getName(), this.getDirector(), this.getYear(), this.getRating());
    }
}

