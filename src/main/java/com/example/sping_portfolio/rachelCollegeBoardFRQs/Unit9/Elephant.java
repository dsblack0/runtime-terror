package com.example.sping_portfolio.rachelCollegeBoardFRQs.Unit9;

public class Elephant extends Herbivore{
    public Elephant(String n, double s) {
        super("elephant", n);
        size = s;
    }
    public String toString() {
        System.out.println(super.toString() + " with tusks " + size + " meters long");
        return super.toString() + " with tusks " + size + " meters long";
    }
}
