package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Movie> movies;

    public Library(){
        this.books = new ArrayList<Book>(Arrays.asList(
                new Book("The House on Mango Street", "Sandra Cisneros", 1984, true),
                new Book("The Alchemist", "Paulo Coelho", 1988, false),
                new Book("God of Small Things", "Arundhati Roy", 1997, false),
                new Book("One Hundred Years of Solitude", "Gabriel García Márquez ", 1967, false),
                new Book("Man's Search for Meaning", "Viktor Frankl", 1946, false)));

        this.movies = new ArrayList(Arrays.asList(
                new Movie("test", "jade", 2000, 9.0, false),
                new Movie("am a movie title", "director", 1999, 8.5, true),
                new Movie("another movie title", "another director", 1985, 7.5, false),
                new Movie("a movie", "a director", 2015, 8.5, false)
        ));
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Movie>getMovies() {
        return this.movies;
    }


    public void returnBook() {
        String bookTitle = requestUserInput();

        boolean validItem = false;
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle)) {
                book.setOnLoan(false);
                validItem = true;
                System.out.println("Thank you for returning the book");

            }
        }
        if (!validItem) {
            System.out.println("Sorry, this book does not belong to the library!");
        }
    }


    public void checkoutBook() {
        String bookTitle = requestUserInput();

        boolean itemAvailable = false;
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle)) {
                book.setOnLoan(true);
                itemAvailable = true;
                System.out.println("Thank you! Enjoy the book");
                break;
            }
        }
        if(!itemAvailable) {
            System.out.println("Sorry, this book is not available");

        }
    }

    private String requestUserInput() {
        System.out.println("Please enter the item title: ");
        String title  = getUserInput();
        return title;
    }

    private String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        scanner.close();
        return choice;
    }

    @Override
    public String toString() {
        String result = "";
        for (Book book : books) {
            String myBook = book.toString();
            result += myBook + "\n";
        }
        return result;
    }
}

