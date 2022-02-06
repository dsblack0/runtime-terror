package com.example.sping_portfolio.controllers.samAboutMe.Unit9Animal;

public class Unit9Animal {
    private String diet;
    String species;
    private String name;

    public Unit9Animal(String d, String s, String n) {
        diet = d;
        species = s;
        name = n;
    }

    public String toString() {
        return name + " the " + species + " is a " + diet;
    }

    public static void main(String[] args) {
        Unit9Animal lisa = new Unit9Animal("carnivore", "lion", "Lisa");
        System.out.println(lisa);
        Unit9Herbivore gary = new Unit9Herbivore("giraffe", "Gary");
        System.out.println(gary);
        Unit9Elephant percy = new Unit9Elephant("Percy", 2.0);
        System.out.println(percy);
    }
}
