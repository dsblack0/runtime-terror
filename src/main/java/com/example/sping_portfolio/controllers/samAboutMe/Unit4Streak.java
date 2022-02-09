package com.example.sping_portfolio.controllers.samAboutMe;

public class Unit4Streak {
    static char streakCharacter = ' ';
    static int length = 0;
    static int startingIndex;
    static int endingIndex;

    public Unit4Streak(String name) {
    }

    public static char longestStreak(String str) {
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
                endingIndex = i;
            }
            character = str.charAt(i);
        }
        System.out.println(largestStreak);

        streakCharacter = largestStreak.charAt(0);
        startingIndex = str.indexOf(largestStreak);
        length = largestStreak.length();
        return streakCharacter;
    }

    public static String streakInfo() {
        return "Char: " + streakCharacter + length + " Start: " + startingIndex + " End: " + endingIndex;
    }

    public static int displayLength() {
        return length;
    }

    public static void main(String[] args) {
        Unit4Streak streak = new Unit4Streak("streak1");
        streak.longestStreak("CAAAAAATT!");
        System.out.println(streak.streakInfo());
    }
}
