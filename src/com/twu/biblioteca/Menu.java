package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {

    private boolean loggedIn;

    public String welcomeMessage() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }


    public void login(User[] users) {
        System.out.println("Please enter your library number: ");
        String libraryNo = getUserInput();
        System.out.println("Please enter your password: ");
        String password = getUserInput();

        for (User user : users) {
          if (user.getLibraryNo().equals(libraryNo) && user.getPassword().equals(password)) {
              System.out.println(password);
              System.out.println(libraryNo);
              this.loggedIn = true;
              System.out.println("Welcome, " + user.getName());
              break;
            }
        }
        if(!loggedIn) {
            System.out.println("Sorry, incorrect library number and password");
        }
    }

    public void runMenu(LibraryGrid grid, Library library) {
        if(loggedIn) {
            printMenu();
            System.out.print("Enter option here: ");

            int choice = Integer.valueOf(getUserInput());
            performAction(choice, grid, library);
        };
    }
    private void printMenu() {
        System.out.println("-----------------------------");
        System.out.println("Please select an option");
        System.out.println("1) View list of books");
        System.out.println("2) Return a book");
        System.out.println("3) Checkout a book");
        System.out.println("4) View list of movies");
        System.out.println("5) Return a movie");
        System.out.println("6) Checkout a movie");
        System.out.println("0) Exit");
        System.out.println("------------------------------");
    }

    private String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        return choice;
    }

    private void performAction(int choice, LibraryGrid grid, Library library) {
        switch (choice) {
            case 0:
                System.out.println("Thank you for visiting Biblioteca, Good bye!");
                loggedIn = false;
                System.exit(0);
                break;
            case 1:
                grid.printLibrary(library);
                break;
            case 2:
                library.returnBook();
                break;
            case 3:
                library.checkoutBook();
                break;
            default:
                System.out.println("Please select a valid option!");
                break;
        }
    }
}
