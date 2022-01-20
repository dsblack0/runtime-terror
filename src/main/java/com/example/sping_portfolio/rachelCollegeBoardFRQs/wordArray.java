package com.example.sping_portfolio.rachelCollegeBoardFRQs;

import java.util.ArrayList;

/**
 * An array of String objects, words, has been properly declared and initialized.
 * Each element of words contains a String consisting of at least 3 lowercase
 * letters (a–z).
 *
 * Write a code segment that uses an enhanced for loop to print all elements of
 * words that end with "ing". As an example, if words contains
 * {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"},
 * then the following output should be produced by the code segment.
 *
 * fading
 *
 * trailing
 *
 * batting
 */

public class wordArray {

    ArrayList<String> inputArray = new ArrayList<String>();
    ArrayList<String> outputArray = new ArrayList<String>();
    String word;
    String resultingWords;
    String result = "";

    private String wordA;
    private String wordB;
    private String wordC;
    private String wordD;
    private String wordE;

    public wordArray(String a, String b, String c, String d, String e) {
        wordA = a;
        wordB = b;
        wordC = c;
        wordD = d;
        wordE = e;

        inputArray.add(a);
        inputArray.add(b);
        inputArray.add(c);
        inputArray.add(d);
        inputArray.add(e);
    }



    public String checkArray() {
        for (String word : inputArray) {
            System.out.println(word);
        }
        return word;
    }

    public String checkSuffix() {
        for (String word : inputArray) {
            if(word.endsWith("ing")){
                outputArray.add(word);
                //System.out.println(outputArray);
            }
        }
        return word;
    }

    public String outputSuffixWords() {
        //System.out.println(outputArray);

        String listString = String.join(", ", outputArray);
        System.out.println(listString);
        result = listString;

        return listString;
    }

    public String generatedSuffixList() {
        System.out.println("Words ending with suffix -ing: " + result);
        return "Words ending with suffix -ing: " + result;
    }

    public static void main(String[] args) {

        wordArray array1 = new wordArray("ten", "fading", "posting", "card", "thundering");
        //array1.checkArray();
        array1.checkSuffix();
        array1.outputSuffixWords();
        array1.generatedSuffixList();

    }

}
