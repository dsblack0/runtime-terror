package com.example.sping_portfolio.rachelCollegeBoardFRQs.Unit9;

public class Animal {

    private String type;
    private String species;
    private String name;
    public Double size;

    public Animal(String t, String s, String n) {
        type = t;
        species = s;
        name = n;
    }

    public String toString() {
        String str = "";
        str = name + " the " + species + " is a " + type;
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        Animal lisa = new Animal("carnivore", "lion", "Lisa");
        lisa.toString();
        Herbivore gary = new Herbivore("giraffe", "Gary");
        gary.toString();
        Elephant percy = new Elephant("Percy", 2.0);
        percy.toString();
    }
}
