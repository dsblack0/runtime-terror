package com.example.sping_portfolio.rachelCollegeBoardFRQs.Unit9;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public String printBookInfo() {
        System.out.print(title + ", written by " + author);
        return title + ", written by " + author;
    }

    public static void main(String[] args) {
        PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
        myBook.printBookInfo();
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Book book1 = new Book("Frankenstein", "Mary Shelley");
        Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        myLibrary.add(book1);
        myLibrary.add(book2);
        //System.out.println(myLibrary);

        BookListing listing1 = new BookListing(book1,10.99);
        listing1.printDescription();
        BookListing listing2 = new BookListing(book2, 12.99);
        listing2.printDescription();

    }
}

