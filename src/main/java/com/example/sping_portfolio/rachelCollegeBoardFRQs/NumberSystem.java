package com.example.sping_portfolio.rachelCollegeBoardFRQs;

public class NumberSystem {

    /** Precondition: a and b are positive integers.
     * Returns the greatest common factor of a and b, as described in part (a).
     */

    public static int gcf(int a, int b){
        int num1 = a;
        int num2 = b;
        int gcf=1;

        if(num2==0){
            //System.out.println("gcf is: " + num1);
            gcf=num1;
            //return num1;
        }
        else{
            gcf = gcf(num2,num1%num2);
            //System.out.println("gcf is: " + gcf);
            //return gcf(num2, num1%num2);
        }
        System.out.println("gcf is: " + gcf);
        return gcf;
    }

    /** Precondition: numerator and denominator are positive integers.
     * Reduces the fraction numerator / denominator
     * and prints the result, as described in part (b).
     */

    public static void reduceFraction(int numerator, int denominator){
        int num = numerator;
        int den = denominator;
        String reduced = "0";

        if (num%den==0){
            reduced=num + "/" + den;
            System.out.println(num + "/" + den + "reduces to " + reduced);
        }
        else{
            int gcf = gcf(num,den);
            reduced = (num/gcf) + "/" + (den/gcf);
            System.out.println(num + "/" + den + "reduces to " + reduced);
        }

    }

    public static void main(String[] args) {
        reduceFraction(30,3);
        reduceFraction(8,20);
        reduceFraction(24,9);
        reduceFraction(7,3);
        reduceFraction(10,6);
    }
}
