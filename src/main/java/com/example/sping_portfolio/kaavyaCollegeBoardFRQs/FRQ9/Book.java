package com.example.sping_portfolio.kaavyaCollegeBoardFRQs.FRQ9;

import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private String info;

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public String printBookInfo() {
        info = title + ", written by " + author;
        return info;
    }

    public static void main(String[] args) {
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Book book1 = new Book ("Frankenstien", "Mary Shelley");
        Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        myLibrary.add(book1);
        myLibrary.add(book2);
    }

}
