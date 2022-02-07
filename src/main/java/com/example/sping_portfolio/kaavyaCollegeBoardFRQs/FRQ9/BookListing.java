package com.example.sping_portfolio.kaavyaCollegeBoardFRQs.FRQ9;

public class BookListing {

    private Book bookObj;
    private double cost;
    private String description;

    public BookListing(Book bookObj, double cost) {
        this.bookObj = bookObj;
        this.cost = cost;
    }

    public Book getBookObj() {
        return bookObj;
    }

    public String printDescription (){
        description = bookObj.printBookInfo() + ", $" + cost;
        return description;
    }

}
