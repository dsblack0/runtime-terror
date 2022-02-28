package com.example.sping_portfolio.controllers.samAboutMe;

import java.util.ArrayList;
import java.util.Arrays;

// Write a Class Number
public class Number {
    private int numSquirrels;
    private static int index=0;
    private int day;

    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number() {
        numSquirrels = (int) (Math.random()*34)+3;
        day = index;
        index++;
    }

    public int getNumSquirrels() {
        return numSquirrels;
    }

    public int getIndex() {
        return day;
    }
    // It contains a getter for Index, or the order it was initialized


    // Write a tester method
    public static void main(String[] args) {

        ArrayList<Number> squirrelsList = new ArrayList<>();
        // Create an ArrayList of Type Number, my ArrayList is called squirrels

        // Initialize 10 squirrels of class type Number

        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops
        for (int i=0; i<10; i++) {
            Number squirrel = new Number();
            squirrelsList.add(i, squirrel);
        }

        for (int i=0; i<squirrelsList.size(); i++) {
            Number currentSq = squirrelsList.get(i);
            int previousIn = i -1;
            while (previousIn >=0 && currentSq.getNumSquirrels() < (squirrelsList.get(previousIn).getNumSquirrels())) {
                squirrelsList.set(previousIn + 1, squirrelsList.get(previousIn));
                previousIn--;
            }
            squirrelsList.set(previousIn +1, currentSq);
        }

        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
        for (Number eachSquirrel : squirrelsList) {
            String squirrelText = "Squirrel: " + eachSquirrel.getNumSquirrels() + " Day: " + eachSquirrel.getIndex();
            System.out.println(squirrelText);
        }
    }

}
