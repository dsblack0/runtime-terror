package com.example.sping_portfolio.rachelCollegeBoardFRQs;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;

public class longestStreak {
    private String input;

    private int longestCount;
    private char longestChar;
    private int currentCount;
    private char currentChar;

    public longestStreak(String s) { //overloaded constructor
        input = s;
        currentCount=0;
        longestChar='A';
        currentChar='A';
    }

    public Integer findStreak() {
        //convert to ArrayList
        String str = input;
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }
        System.out.println(chars);

        //find longest streak
        for (int i = 0; i < chars.size()-1; i++) {
            if (chars.get(i) == chars.get(i+1)){
                currentCount++;
                currentChar = chars.get(i);
                System.out.println(currentCount);
            }
            else {
                currentCount=1;
            }
            if (currentCount > longestCount) {
                longestCount = currentCount;
                longestChar = currentChar;
            }
        }
        return longestCount;
    }

    public String longestStreakStats() {
        System.out.println("The longest streak is " + longestCount + " characters long. The character in this streak is " + longestChar);
        return "The longest streak is " + longestCount + " characters long. The character in this streak is " + longestChar;
    }

    public static void main(String[] args) {
        longestStreak streak1 = new longestStreak("AAAABBKKKKDDDDDBBBBBBBBB");
        streak1.findStreak();
        streak1.longestStreakStats();
    }


}
