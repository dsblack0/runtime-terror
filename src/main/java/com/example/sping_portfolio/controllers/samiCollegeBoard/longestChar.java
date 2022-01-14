package com.example.sping_portfolio.controllers.samiCollegeBoard;

public class longestChar{
        public static void longestStreak(String str){
            char prevC = '_';
            String largest = "";
            String txt = "";
            for (int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if (c != prevC){
                    txt = "";
                }
                txt += c;
                if (txt.length() > largest.length()){
                    largest = txt;
                }
                prevC = c;
            }
            System.out.println(largest.charAt(0)+" "+largest.length());
        }

        public static void main(String[] args) {
            longestStreak("CCAAAAATTT!");
        }



    }