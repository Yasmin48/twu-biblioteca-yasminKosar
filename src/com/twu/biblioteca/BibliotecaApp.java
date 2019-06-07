package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaApp {

    public static void main(String[] args) {

        Book[] books = {
                new Book("The House on Mango Street", "Sandra Cisneros", 1984, false),
                new Book("The Alchemist", "Paulo Coelho", 1988, false),
                new Book("God of Small Things", "Arundhati Roy", 1997, false),
                new Book("One Hundred Years of Solitude", "Gabriel García Márquez ", 1967, false),
                new Book("Man's Search for Meaning", "Viktor Frankl", 1946, false)
        };

        User[] users = {
                new User("Yasmin","yasmin123","password", "email@hotmail.com", "123 4567"),
                new User("Jade","Jade1123","Password", "email@gmal.com", "123 4567")
        };

        LibraryGrid grid = new LibraryGrid(40, 30, 5);
        Library library = new Library();
        Menu menu = new Menu();
        //menu.login(users);
        System.out.println(menu.welcomeMessage());
        System.out.println();
        menu.runMenu(grid, library, books);

        //System.out.println(library);
    }
}
