package com.example.sping_portfolio.rachelCollegeBoardFRQs;

public class unit4frq1 {

    public static void main(String[] args) {
        System.out.println(longestStreak("aaaaadslkfjslknaaaaaaaaaaa"));
    }

    private static int longestStreak(String str) {
        int maxStreak = 0;
        int currentStreak = 1;
        char prev = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == prev) {
                currentStreak++;
            } else {
                maxStreak = Math.max(maxStreak, currentStreak);
                currentStreak = 1;
            }
            prev = currentChar;
        }
        return Math.max(maxStreak, currentStreak);
    }


}
