package com.example.sping_portfolio.controllers.samAboutMe;

import java.util.ArrayList;

public class Unit6StringSelect {
    private String [] words;
    private ArrayList<String> ingWords;

    public Unit6StringSelect() {
        words = new String[] {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
        ingWords = new ArrayList<>();
    }

    public ArrayList<String> selectWords() {
        for(String ingWord : words)
        {
            if (ingWord.endsWith("ing")) {
                ingWords.add(ingWord);
            }
        }
        return ingWords;
    }

    public static void main(String[] args) {
        Unit6StringSelect list = new Unit6StringSelect();
        System.out.println(list.selectWords());
    }

}
