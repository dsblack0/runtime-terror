package com.example.sping_portfolio.controllers.samAboutMe;

import java.util.Random;

public class TPT5 {
    private static int passCount = 0;
    private String prefix = "";
    private int length;
    private boolean tooLong;
    private String pwd;

    public TPT5(int length, String prefix) {
        this.prefix = prefix;
        this.length = length;
    }

    public int getPassCount () {

        return passCount;
    }

    public int getLength() {
        return length;
    }

    public boolean getLengthCheck() {
        return tooLong;
    }

    public String pwGen() {
        passCount += 1;
        pwd = this.prefix + ".";
        for (int i = 1; i <= this.length; i++) {
            int randomNum = new Random().nextInt(10);
            pwd += randomNum;
        }

        tooLong = false;
        if (pwd.length() >= 9) {
            tooLong = true;
        }
        return pwd;
    }

    public String toString() {
        return "Password: "+pwd+" Password length: "+length+" Password is too long: "+tooLong+" Number of passwords generated: "+passCount;
    }

    public static void main(String[] args) {
        TPT5 pw1 = new TPT5(10, "chs");
        pw1.pwGen();
        System.out.println(pw1);
        TPT5 pw2 = new TPT5(5, "A");
        pw2.pwGen();
        System.out.println(pw2);
    }

}
