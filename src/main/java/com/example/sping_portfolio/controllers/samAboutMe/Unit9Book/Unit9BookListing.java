package com.example.sping_portfolio.controllers.samAboutMe.Unit9Book;

public class Unit9BookListing{
    private Unit9Book book;
    private double price;

    public Unit9BookListing(Unit9Book b, double p) {
        book = b;
        price = p;
    }

    public String toString() {
        return book.toString() + ", $" + price;
    }
}
