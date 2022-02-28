package com.example.sping_portfolio.controllers.adritaCollegeboardFRQs;

import java.util.ArrayList;
import java.util.Random;

public class Number {

    int squirrels;
    int index;

    public Number(){
        this.squirrels = ((int) (Math.random() * (36-3)) + 10);
        this.index = index + 1;
    }

    public int getRandom(int squirrels){
        this.squirrels = squirrels;
        return squirrels;
    }

    public int getIndex(int index){
        this.index = index;
        return index;
    }
    public static void main (String[] args){
        ArrayList<Number> squirrels = new ArrayList<Number>();

    }
}
