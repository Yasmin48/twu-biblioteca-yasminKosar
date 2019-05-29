package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {


        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");

        System.out.println();

        Library library = new Library();

        //System.out.println(library.getBooks());

        //System.out.println(library);

         Book testBook = new Book("Man's Search for Meaning", "Viktor Frankl", 1946);

         String response = library.checkoutBook(testBook);
        //System.out.println(response); // checked out book not showing on the list;
        //System.out.println(library);

//        Book invalidBook = new Book("Harry Potter", "J K Rowling", 2007);
//        String result = library.checkoutBook(invalidBook);
//        System.out.println(result);

//         Book returnedBook = new Book("Yasmin", "test", 1999);
//         String returnResponse = library.returnBook(returnedBook);
//         System.out.println(library);
//         System.out.println(returnResponse);

         Book book = new Book("Man's Search for Meaning", "Viktor Frankl", 1946);
         String validReturn = library.returnBook(book);
         System.out.println(library);
         System.out.println(validReturn);



    }
}
