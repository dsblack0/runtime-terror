package com.example.sping_portfolio.controllers.samAboutMe;

public class Unit4Streak {
    static char streakCharacter = ' ';
    static int length = 0;

    public Unit4Streak(String name) {
    }

    public static char longestStreak(String str) {
        char character = '_';
        String largestStreak = "";
        String currentStreak = "";
        int endingIndex = 0;
        int startingIndex = 0;

        for (int i=0; i < str.length(); i++) {
            if (str.charAt(i) != character) {
                currentStreak = "";
            }
            currentStreak += str.charAt(i);
            if (currentStreak.length() > largestStreak.length()) {
                largestStreak = currentStreak;
                endingIndex = i;
            }
            character = str.charAt(i);
        }
        System.out.println(largestStreak);

        streakCharacter = largestStreak.charAt(0);
        startingIndex = str.indexOf(largestStreak);
        length = largestStreak.length();
        System.out.println("Char: " + streakCharacter + length + " Start: " + startingIndex + " End: " + endingIndex);
        return streakCharacter;
    }

    public static int displayLength() {
        return length;
    }

    public static void main(String[] args) {
        longestStreak("CCAACAAAATTT!");
    }
}
