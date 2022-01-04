package com.example.sping_portfolio.controllers.samAboutMe;

public class Unit4Streak {
    public static char longestStreak(String str) {
        char character = 0;
        String largestStreak= "";
        String currentStreak= "";

        for (int i=0; i<str.length(); i++) {
            if (character == str.charAt(i)) {
                currentStreak += str.charAt(i);
                System.out.println(currentStreak);
            }
            if (currentStreak.length() > largestStreak.length()) {
                largestStreak = currentStreak;
                System.out.println(largestStreak);
            }
            character = str.charAt(i);
        }
        int length = largestStreak.length();
        return character;

    }

    public static void main(String[] args) {
        System.out.println(longestStreak("CCAAAAATTT"));
    }
}
