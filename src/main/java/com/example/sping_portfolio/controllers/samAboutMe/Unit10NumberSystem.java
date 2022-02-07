package com.example.sping_portfolio.controllers.samAboutMe;

public class Unit10NumberSystem {
    private static String fraction;

    public static int gcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return gcf(b, a%b);
        }
    }

    public static String reduceFraction(int numerator, int denominator) {
        int gcf = gcf(numerator, denominator);
        if (numerator%denominator == 0) {
            int frac = numerator/denominator;
            fraction = String.valueOf(frac);
        } else {
            int num = numerator / gcf;
            int den = denominator / gcf;
            fraction = num + "/" + den;
        }
        return fraction;
    }

    public static void main(String[] args) {
        Unit10NumberSystem set1 = new Unit10NumberSystem();
        System.out.println(gcf(7, 0));
        System.out.println(reduceFraction(7, 3));
    }
}
