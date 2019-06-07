package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        User[] users = {
                new User("Yasmin","yasmin123","password"),
                new User("Jade","Jade1123","Password")
        };

        LibraryGrid grid = new LibraryGrid(40, 30, 5);
        Library library = new Library();
        Menu menu = new Menu();
        //menu.login(users);
        System.out.println(menu.welcomeMessage());
        System.out.println();
        menu.runMenu(grid, library);

        //System.out.println(library);
    }
}
