package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {


        LibraryGrid grid = new LibraryGrid(40, 30, 5);
        Library library = new Library();
        Book invalidBook = new Book("test", "author", 2010);
        Book testBook = new Book("Man's Search for Meaning", "Viktor Frankl", 1946);
        Menu menu = new Menu();
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
