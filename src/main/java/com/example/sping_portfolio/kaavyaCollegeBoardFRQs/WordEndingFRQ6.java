package com.example.sping_portfolio.kaavyaCollegeBoardFRQs;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WordEndingFRQ6 {
    ArrayList<String> words = new ArrayList();
    ArrayList<String> ingWords = new ArrayList();

    public ArrayList<String> withIng(ArrayList words){
        this.words = words;
        //for (String element : words) {
            //String last3Chars = element.substring(element.length()-4, element.length()-1);
           // if (last3Chars.equals("ing"){
                //ingWords.add(element);
           // }
        //}
        return ingWords;
    }
}
