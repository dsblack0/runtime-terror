package com.example.sping_portfolio.kaavyaCollegeBoardFRQs;


import java.util.ArrayList;

// Write a Class Number
public class Number {

    // instance variables
    int classSize;
    int index;

    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number() {
        classSize = (int)((Math.random() * 33) + 3);
        index = 0;
    }

    // It contains a getter for the Random Number
    public int getClassSize() {
        return classSize;
    }

    // It contains a getter for Index, or the order it was initialized
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    // Write a tester method
    public static void main(String[] args) {

        // Create an ArrayList of Type Number, my ArrayList is called squirrels
        ArrayList<Number> squirrels = new ArrayList<Number>();

        // Initialize 10 squirrels of class type Number
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops
        for (int i = 0; i < 10; i++){
            Number newSquirrel = new Number();
            int squirrelSize = newSquirrel.getClassSize();
            int newSquirrelIndex = i;
            for (int n = 0; n < squirrels.size(); n++) {
                if (squirrelSize < (squirrels.get(n)).getClassSize()) {
                    newSquirrelIndex = n;
                    break;
                }
            }
            squirrels.add(newSquirrelIndex, newSquirrel);
            newSquirrel.setIndex(i);
        }

        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
        for (Number squirrel: squirrels) {
            System.out.println("Squirrels: " + squirrel.getClassSize() + " Day: " + squirrel.getIndex());
        }
    }
}
