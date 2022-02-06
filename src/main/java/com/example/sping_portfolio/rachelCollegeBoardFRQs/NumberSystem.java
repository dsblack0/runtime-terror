package com.example.sping_portfolio.rachelCollegeBoardFRQs;

public class NumberSystem {

    /** Precondition: a and b are positive integers.
     * Returns the greatest common factor of a and b, as described in part (a).
     */

    public String str;

    public int gcf(int a, int b){
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

    public void reduceFraction(int numerator, int denominator){
        int num = numerator;
        int den = denominator;
        String reduced;
        if (num%den==0){
            reduced=Integer.toString(num/den);
            str = num + "/" + den + " reduces to " + reduced;
            System.out.println(num + "/" + den + " reduces to " + reduced);
        }
        else{
            int gcf = gcf(num,den);
            reduced = (num/gcf) + "/" + (den/gcf);
            str = num + "/" + den + " reduces to " + reduced;
            System.out.println("str: " + str);
            System.out.println(num + "/" + den + " reduces to " + reduced);
        }


    }

    public String output(){
        System.out.println(str);
        return str;
    }



    public static void main(String[] args) {

        NumberSystem r1 = new NumberSystem();
        NumberSystem r2 = new NumberSystem();
        NumberSystem r3 = new NumberSystem();
        NumberSystem r4 = new NumberSystem();
        NumberSystem r5 = new NumberSystem();
        r1.reduceFraction(30,3);
        r2.reduceFraction(8,20);
        r3.reduceFraction(24,9);
        r4.reduceFraction(7,3);
        r5.reduceFraction(10,6);

        System.out.println("TEST");
        r1.output();


    }
}
