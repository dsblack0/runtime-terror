package com.example.sping_portfolio.rachelCollegeBoardFRQs;

import java.util.ArrayList;

// Write a Class Number
public class Number {
    // instance variables
    private int instance;
    private int random;
    private static int index=0;
    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number() {
        random = (int)(Math.random() * 34) + 3; //random number siz-min+1
        instance = index;
        index++;
    }

    // It contains a getter for the Random Number
    public int getNumber() {
        return random;
    }

    // It contains a getter for Index, or the order it was initialized
    public int getIndex() {
        return instance;
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
        ArrayList<Number> newsquirrels = new ArrayList<Number>();
        newsquirrels.add(s1);
        newsquirrels.add(s2);
        newsquirrels.add(s3);
        newsquirrels.add(s4);
        newsquirrels.add(s5);
        newsquirrels.add(s6);
        newsquirrels.add(s7);
        newsquirrels.add(s8);
        newsquirrels.add(s9);
        newsquirrels.add(s10);

        for (int i =0; i<newsquirrels.size(); i++) {
            for(int j=i+1; j<newsquirrels.size(); j++){
                if(newsquirrels.get(i).getNumber() > newsquirrels.get(j).getNumber() ) {
                    Number sorting = newsquirrels.get(i);
                    newsquirrels.set(i, newsquirrels.get(j));
                    newsquirrels.set(j, sorting);
                }
            }
        }


        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
        for (Number i : newsquirrels) {
            System.out.println("Squirrels: " + i.getNumber() + " Day: " + i.getIndex());
        }
    }

}

