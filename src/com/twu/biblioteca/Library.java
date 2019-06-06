package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Library {

    private ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<Book>(Arrays.asList(
                new Book("The House on Mango Street", "Sandra Cisneros", 1984),
                new Book("The Alchemist", "Paulo Coelho", 1988), new Book("God of Small Things", "Arundhati Roy", 1997),
                new Book("One Hundred Years of Solitude", "Gabriel García Márquez ", 1967),
                new Book("Man's Search for Meaning", "Viktor Frankl", 1946)));
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    // Directly mutating the state
    public String returnBook() {
        // need to check the book belongs to the library
        System.out.println("Please enter the book title: ");
        String bookTitle  = getUserInput();

        for(Book book : books){
            if(book.getTitle().equals(bookTitle)){

                books.add(book);
                return "Thank you for returning the book";
            }
        }
        return "Sorry, this book does not belong to the library!";

    }

    // Directly mutating the state!!
    // Maybe add onLoan field to book and change that instead of removing the book
    public String checkoutBook() {
        System.out.println("Please enter the book title: ");
        String bookTitle  = getUserInput();

        for (Book book : books) {
            if (book.getTitle().equals(bookTitle)) {
                int index = books.indexOf(book);
                books.remove(index);
                return  "Thank you! Enjoy the book";
            }
        }
        return "Sorry, this book is not available";
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

