package com.example.sping_portfolio.kaavyaCollegeBoardFRQs.FRQ9;

public class Herbivore extends Animal{

    private String species;
    private String name;
    private String result;

    public Herbivore(String species, String name){
        super("herbivore", species, name);
    }

    public String toString(){
        result = super.toString();
        return result;
    }

}
