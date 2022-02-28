package com.example.sping_portfolio.kaavyaCollegeBoardFRQs.FRQ9;

public class Elephant extends Herbivore{

    private double tusk;

    public Elephant(String name, double tusk){
        super("elephant", name);
        this.tusk = tusk;
    }

    public String toString (){
        return super.toString() + " with tusk " + tusk + " meters long";
    }

}
