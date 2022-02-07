package com.example.sping_portfolio.rachelCollegeBoardFRQs.Unit9;

public class PictureBook extends Book{

    private String illustrator;

    public PictureBook(String t, String a, String i) {
        super(t, a);
        illustrator=i;
    }

    public String printBookInfo() {
        super.printBookInfo();
        System.out.println(" and illustrated by " + illustrator);
        return super.printBookInfo() + " and illustrated by " + illustrator;
    }
}
