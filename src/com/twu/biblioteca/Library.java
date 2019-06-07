package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Library {

    private ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<Book>(Arrays.asList(
                new Book("The House on Mango Street", "Sandra Cisneros", 1984, false),
                new Book("The Alchemist", "Paulo Coelho", 1988, false),
                new Book("God of Small Things", "Arundhati Roy", 1997, false),
                new Book("One Hundred Years of Solitude", "Gabriel García Márquez ", 1967, false),
                new Book("Man's Search for Meaning", "Viktor Frankl", 1946, false)));
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    // Directly mutating the state

    public void returnBook() {
        String bookTitle  = requestUserInput();

        for(Book book : books){
                if(book.getTitle().equals(bookTitle)){
                books.add(book);
                System.out.println("Thank you for returning the book");
            }
        }
        System.out.println("Sorry, this book does not belong to the library!");
    }

    // Directly mutating the state!!
    // Maybe add onLoan field to book and change that instead of removing the book

    public void checkoutBook() {
        String bookTitle = requestUserInput();

        for (Book book : books) {
            if (book.getTitle().equals(bookTitle)) {
                int index = books.indexOf(book);
                //System.out.println(index);
                books.remove(index);
                System.out.println("Thank you! Enjoy the book");
            }
        }
       System.out.println("Sorry, this book is not available");
    }

    private String requestUserInput() {
        System.out.println("Please enter the book title: ");
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

