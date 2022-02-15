package com.example.sping_portfolio.rachelCollegeBoardFRQs;

import java.util.ArrayList;

// Write a Class Number
public class Number {
    // instance variables
    double random;
    int index;
    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number() {
        random = (Math.random() * 33) + 3; //random number 3<=x<36
    }

    // It contains a getter for the Random Number
    public int getNumber() {
        getIndex();
        return (int) random;
    }

    // It contains a getter for Index, or the order it was initialized
    public int getIndex() {
        index++;
        return index;
    }

    // Write a tester method
    public static void main(String[] args) {

        // Create an ArrayList of Type Number, my ArrayList is called squirrels
        ArrayList<Number> squirrels = new ArrayList<Number>();
        // Initialize 10 squirrels of class type Number
        Number s1 = new Number();
        Number s2 = new Number();
        Number s3 = new Number();
        Number s4 = new Number();
        Number s5 = new Number();
        Number s6 = new Number();
        Number s7 = new Number();
        Number s8 = new Number();
        Number s9 = new Number();
        Number s10 = new Number();

        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops

        for () {

        }





        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
        for (Number i : squirrels) {
            System.out.println("Squirrels: " + squirrels.get(i) + " Day: " + i);
        }
    }

}
