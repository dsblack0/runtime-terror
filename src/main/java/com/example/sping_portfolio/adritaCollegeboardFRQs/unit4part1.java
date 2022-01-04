package com.example.sping_portfolio.adritaCollegeboardFRQs;

import java.util.Scanner;

public class unit4part1 {
    public static void Streak(String word){
        int streak_length = 0;
        // int answer = 0;
        char previous = word.charAt(0);
        char streak_letter = previous;
        // int index_final = 0;
        // int index_first = 0;
        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            if(letter == previous){
                streak_length = streak_length + 1;
                streak_letter = word.charAt(i);
            }
            // if(letter != previous){
            //   index_final = i;
            //   index_first = index_final - streak_length;

            // }
            previous = word.charAt(i);
        }
        System.out.println(streak_letter + " " + streak_length);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a word");
        String word = scan.nextLine();
        Streak(word);

    }
}
