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
        menu.login(users);
        System.out.println(menu.welcomeMessage());
        System.out.println();
        menu.runMenu(grid, library);





        //String response = library.checkoutBook();
        //System.out.println(response); // checked out book not showing on the list;

       // System.out.println(library);

        //Book invalidBook = new Book("Harry Potter", "J K Rowling", 2007);
      //  String result = library.checkoutBook();
        //System.out.println(result);

        //System.out.println(library);

//         String returnResponse = library.returnBook();
//         System.out.println(library);
//         System.out.println(returnResponse);

//         Book book = new Book("Man's Search for Meaning", "Viktor Frankl", 1946);
//         String validReturn = library.returnBook(book);
//         System.out.println(library);
//         System.out.println(validReturn);



    }
}
