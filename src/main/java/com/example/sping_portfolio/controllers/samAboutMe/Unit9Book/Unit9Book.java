package com.example.sping_portfolio.controllers.samAboutMe.Unit9Book;

import java.util.ArrayList;

public class Unit9Book {
    private String title;
    private String author;

    public Unit9Book(String t, String a) {
        title = t;
        author = a;
    }

    public String toString() {
        return title + ", written by " + author;
    }

    public static void main(String[] args) {
        Unit9PictureBook myBook = new Unit9PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
        System.out.println(myBook.toString());
        ArrayList<Unit9Book> myLibrary = new ArrayList<>();
        Unit9Book book1 = new Unit9Book("Frankenstein", "Marry Shelley");
        Unit9PictureBook book2 = new Unit9PictureBook("The Wonderful Wizard of Oz",  "L. Frank Baum", "W.W. Denslow");
        myLibrary.add(book1);
        myLibrary.add(book2);
        System.out.println(myLibrary);
        Unit9BookListing listing1 = new Unit9BookListing(book1, 10.99);
        System.out.println(listing1.toString());
        Unit9BookListing listing2 = new Unit9BookListing(book2, 12.99);
        System.out.println(listing2.toString());
    }
}
