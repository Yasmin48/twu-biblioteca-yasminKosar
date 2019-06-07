package com.twu.biblioteca;

public class LibraryItem {

    private String title;
    private int year;
    private boolean onLoan;

    public LibraryItem(String title, int year, boolean onLoan) {
        this.title = title;
        this.year = year;
        this.onLoan = onLoan;
    }

    public String getTitle() {
        return title;

    }

    public int getYear() {
        return year;
    }

    public boolean getOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }


}

