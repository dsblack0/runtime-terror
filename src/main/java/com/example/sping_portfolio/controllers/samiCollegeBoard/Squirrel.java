package com.example.sping_portfolio.controllers.samiCollegeBoard;

import java.util.ArrayList;
class Squirrel {
    // instance variables
    private int instance;
    private int random;
    private static int index=0;
    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Squirrel() {
        int range = (36 - 3) + 1;
        random = (int)(Math.random() * range) + 3;
        //random number max-min+1
        instance = index;
        index++;

    }

    // It contains a getter for the Random Number
    public int getSquirrel() {
        return random;
    }

    // It contains a getter for Index, or the order it was initialized
    public int getIndex() {
        return instance;
    }

    // Write a tester method
    public static void main(String[] args) {

        // Create an ArrayList of Type Number, my ArrayList is called squirrels
        ArrayList<Squirrel> newsquirrels = new ArrayList<Squirrel>();
        // Initialize 10 squirrels of class type Number
        for (int i = 0; i < 1000; i++) {
            newsquirrels.add(new Squirrel());
        }


        // Bubble Sort
        for (int i =0; i<newsquirrels.size(); i++) {
            for(int j=i+1; j<newsquirrels.size(); j++){
                // test squirrel count for high low
                if(newsquirrels.get(i).getSquirrel() > newsquirrels.get(j).getSquirrel() ) {
                    // swapping squirrels
                    Squirrel sorting = newsquirrels.get(i);
                    newsquirrels.set(i, newsquirrels.get(j));
                    newsquirrels.set(j, sorting);
                }
            }
        }


        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
        for (Squirrel i : newsquirrels) {
            System.out.println("Squirrels: " + i.getSquirrel() + " Day: " + i.getIndex());
        }
    }

}
