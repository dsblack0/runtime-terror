package com.example.sping_portfolio.controllers.samAboutMe;

import java.util.Random;

public class    Unit5PwGenerator {
    private static int passCount = 0;
    private static String pwd = "";
    private String prefix = "";
    private int length;

    public Unit5PwGenerator() {
        this.prefix = "A";
        this.length = 5;
    }

    public Unit5PwGenerator(int length, String prefix) {
        this.prefix = prefix;
        this.length = length;
    }

    public int getPwCount () {
        return passCount;
    }

    public void setPwGen() {
        passCount += 1;
        pwd = this.prefix + ".";
        for (int i = 1; i <= this.length; i++) {
            int randomNum = new Random().nextInt(10);
            pwd += randomNum;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public static void main(String[] args) {
        Unit5PwGenerator pw1 = new Unit5PwGenerator(4, "chs");
        System.out.println(pw1.getPwCount());
        pw1.setPwGen();
        System.out.println(pw1.getPwd());
        System.out.println(pw1.getPwCount());
        System.out.println(pw1.getPwCount());
        Unit5PwGenerator pw2 = new Unit5PwGenerator();
        System.out.println(pw2.getPwCount());
        pw2.setPwGen();
        System.out.println(pw2.getPwd());
        System.out.println(pw2.getPwCount());
        System.out.println(pw1.getPwCount());
    }

}
