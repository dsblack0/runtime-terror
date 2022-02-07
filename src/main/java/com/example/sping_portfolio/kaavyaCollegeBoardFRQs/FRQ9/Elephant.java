package com.example.sping_portfolio.kaavyaCollegeBoardFRQs.FRQ9;

public class Elephant extends Herbivore{

    private double tusk;
    private String name;
    private String result;

    public Elephant(String name, double tusk){
        super("elephant", name);
        this.tusk = tusk;
    }

    public String toString (){
        result = super.toString() + " with tusk " + tusk + " meters long";
        return result;
    }

}
