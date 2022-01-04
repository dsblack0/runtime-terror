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

        //Print statements for TPT Hackathon
        System.out.println("Most Common Char: " + mostCommon);
        System.out.println("Starting index: " + startIndex(str) + ", Ending index: " + endIndex(str));
        System.out.println("substring length: " + longest.length());

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

    //Created for TPT Hackathon
    public int startIndex (String str){
        int start = str.indexOf(longest);
        return start;
    }
    public int endIndex (String str){
        int end = str.indexOf(longest) + longest.length() - 1;
        return end;
    }
}
