package com.example.sping_portfolio.rachelCollegeBoardFRQs.Unit9;

public class BookListing{
    private Book myBook;
    private double price;
    public BookListing(Book b, double p){
        myBook = b;
        price = p;
    }
    public String printDescription() {
        myBook.printBookInfo();
        System.out.println(", $" + price);
        return myBook.printBookInfo() + ", $" + price;
    }
}
