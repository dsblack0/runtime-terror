package com.example.sping_portfolio.controllers.samAboutMe;

import java.util.ArrayList;

public class Unit6StringSelect {
    private String [] words;
    private String ending;
    private String resultWords;

    public Unit6StringSelect() {
        words = new String[] {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
        ending = "ing";
    }

    public Unit6StringSelect(String[] w, String e) {
        words = w;
        ending = e;
    }

    public String selectWords() {
        for(String ingWord : words)
        {
            if (ingWord.endsWith(ending)) {
                resultWords += ingWord + ", ";
            }
        }
        return resultWords;
    }

    public static void main(String[] args) {
        Unit6StringSelect list = new Unit6StringSelect();
        System.out.println(list.selectWords());
    }

}
