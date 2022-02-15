package com.example.sping_portfolio.controllers.samAboutMe;

import java.util.ArrayList;
import java.util.Arrays;

// Write a Class Number
public class Number {
    private int numSquirrels;
    private static int index;

    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number() {
        index += 1;
        numSquirrels = (int) (Math.random()*11+4);
    }

    public int getNumSquirrels() {
        return numSquirrels;
    }

    public int getIndex() {
        return index;
    }
    // It contains a getter for Index, or the order it was initialized


    // Write a tester method
    public static void main(String[] args) {

        ArrayList<Number> squirrels = new ArrayList<>();
        // Create an ArrayList of Type Number, my ArrayList is called squirrels

        // Initialize 10 squirrels of class type Number
        Number squirrel1 = new Number();
        Number squirrel2 = new Number();
        Number squirrel3 = new Number();
        Number squirrel4 = new Number();
        Number squirrel5 = new Number();
        Number squirrel6 = new Number();
        Number squirrel7 = new Number();
        Number squirrel8 = new Number();
        Number squirrel9 = new Number();
        Number squirrel10 = new Number();


        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops
        Number[] array = new Number[]{squirrel1, squirrel2, squirrel3, squirrel4, squirrel5, squirrel6, squirrel7, squirrel8, squirrel9, squirrel10};
        ArrayList<Number> squirrelsList = new ArrayList<>();
        for (int i=0; i< array.length; i++) {
            squirrelsList.add(array[i]);
        }
        Number leastSquirrel;
        for (int i=0; i<squirrelsList.size(); i++) {
            for (int n=0; n<squirrelsList.size(); n++) {
                if (squirrelsList.get(i).getNumSquirrels() < squirrelsList.get(n).getNumSquirrels()) {
                    leastSquirrel = squirrelsList.get(i);
                    squirrels.add(leastSquirrel);
                    squirrelsList.remove(leastSquirrel);
                }
            }
        }
        System.out.println(squirrels.size());

        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
        for (Number eachSquirrel : squirrels) {
            String squirrelText = "Squirrel: " + eachSquirrel.getNumSquirrels() + " Day: " + eachSquirrel.getIndex();
            System.out.println(squirrelText);
        }
    }

}
