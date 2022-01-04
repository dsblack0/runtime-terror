package com.example.sping_portfolio.kaavyaCollegeBoardFRQs;

import java.util.ArrayList;
import java.util.List;

public class LongestStreakFRQ4 {

    ArrayList<String> substrings = new ArrayList<>();
    private String curr;
    private String next;
    private String element;
    private String longest;
    private String mostCommon;
    private int count;
    private String output;

    public String longestStreak (String str){
        mostCommon = longestSegment(str).substring(0,1);
        count = longestSegment(str).length();
        output = mostCommon + " " + count;
        System.out.println("Most consecutive char: " + output);
        return output;
    }

    public String longestSegment (String str){
        element = "";
        for (int index = 0; index < str.length() - 1; index++){
            curr = str.substring(index, index + 1);
            next = str.substring(index + 1, index + 2);
            if (curr.equals(next)){
                element += next;
            }
            else {
                element += curr;
                substrings.add(element);
                element = "";
            }
            System.out.println("element: " + element);
        }
        longest = substrings.get(0);
        for (int i = 1; i < substrings.size(); i++){
            String thisSegment = substrings.get(i);
            if (longest.length() < thisSegment.length()){
                longest = thisSegment;
            }
        }
        return longest;
    }
}
