package com.example.sping_portfolio.controllers.samAboutMe;

import java.util.Random;

public class Unit5PwGenerator {
    private static int passCount = 0;
    private String prefix = "";
    private int length;

    public Unit5PwGenerator(int length) {
        this.prefix = "A";
        this.length = length;
    }

    public Unit5PwGenerator(int length, String prefix) {
        this.prefix = prefix;
        this.length = length;
    }

    public int pwCount () {
        return passCount;
    }

    public String pwGen() {
        passCount += 1;
        String pwd = this.prefix + ".";
        for (int i = 1; i <= this.length; i++) {
            int randomNum = new Random().nextInt(10);
            pwd += randomNum;
        }
        return pwd;
    }

    public static void main(String[] args) {
        Unit5PwGenerator pw1 = new Unit5PwGenerator(4, "chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        Unit5PwGenerator pw2 = new Unit5PwGenerator(5);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwCount());
    }

}
