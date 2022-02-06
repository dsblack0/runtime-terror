package com.example.sping_portfolio.kaavyaCollegeBoardFRQs.FRQ9;

public class BookListing {

    private Book bookObj;
    private double cost;
    private String description;

    public String printDescription (Book bookObj, double cost){
        this.bookObj = bookObj;
        this.cost = cost;
        description = bookObj.printBookInfo() + ", $" + cost;
        return description;
    }

}
