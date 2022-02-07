package com.example.sping_portfolio.controllers.samAboutMe.Unit9Animal;

public class Unit9Elephant extends Unit9Herbivore {
    private double tuskLength;

    public Unit9Elephant(String n, double t) {
        super("elephant", n);
        tuskLength = t;
    }

    public String toString() {
        return super.toString() + " with tusks " + tuskLength + " meters long";
    }
}
