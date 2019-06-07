package com.twu.biblioteca;


public class BibliotecaApp {

    public static void main(String[] args) {

        User[] users = {
                new User("Yasmin","123 4567","password", "email@hotmail.com", "023 4567"),
                new User("Jade","456 1234","Password", "email@gmal.com", "123 4567")
        };

        LibraryGrid grid = new LibraryGrid(40, 30, 5);
        Library library = new Library();
        Menu menu = new Menu();
        menu.login(users);
        System.out.println(menu.welcomeMessage());
        System.out.println();
        menu.runMenu(grid, library);
    }
}
