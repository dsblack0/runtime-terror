package com.example.sping_portfolio.controllers.samAboutMe.Unit9Book;

import java.util.ArrayList;

public class Unit9PictureBook extends Unit9Book {
    private String illustrator;

    public Unit9PictureBook(String ti, String au, String il) {
        super(ti, au);
        illustrator = il;
    }

    public String toString() {
        return super.toString() + " and illustrated by " + illustrator;
    }

    public static void main(String[] args) {
    }
}
