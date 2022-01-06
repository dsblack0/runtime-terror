package com.example.sping_portfolio.controllers.samAboutMe;

public class Unit4Streak {
    char streakCharacter = ' ';
    int length = 0;

    public Unit4Streak(String name) {
    }

    public char longestStreak(String str) {
        char character = '_';
        String largestStreak = "";
        String currentStreak = "";

        for (int i=0; i < str.length(); i++) {
            if (str.charAt(i) != character) {
                currentStreak = "";
            }
            currentStreak += str.charAt(i);
            if (currentStreak.length() > largestStreak.length()) {
                largestStreak = currentStreak;
            }
            character = str.charAt(i);
        }
        streakCharacter = largestStreak.charAt(0);
        length = largestStreak.length();
        return streakCharacter;
    }

    public int displayLength() {
        return length;
    }
}
