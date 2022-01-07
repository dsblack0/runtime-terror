package com.example.sping_portfolio.rachelCollegeBoardFRQs;

public class longestStreak {

    public static void main(String[] args) {
        System.out.println(longestStreak("aaaaadslkfjslknaaaaaaaaaaa"));
    }

    private static int longestStreak(String str) {
        int maxStreak = 0; //longestCount
        int currentStreak = 1; //currentCount
        char prev = str.charAt(0);
        char currentChar; //currentChar
        int start = 1;


        char longestChar = 0;
        for (int i = 1; i < str.length(); i++) {
            currentChar = str.charAt(i);
            if (currentChar == prev) {
                currentStreak++;
                longestChar = str.charAt(i);
            } else {
                maxStreak = Math.max(maxStreak, currentStreak);
                currentStreak = 1;
            }
            prev = currentChar;
        }

        System.out.println(longestChar);
        System.out.println(Math.max(maxStreak, currentStreak));

        return Math.max(maxStreak, currentStreak);


    }


}
