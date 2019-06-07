package com.twu.biblioteca;

public class Book extends LibraryItem{


    private String author;

    public Book(String title, String author, int year, boolean onLoan) {
        super(title, year, onLoan);
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString(){
       return String.format("%s - %s, %d", this.getTitle(), this.getAuthor(), this.getYear());
    }


}

