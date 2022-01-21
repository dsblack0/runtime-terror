package com.example.sping_portfolio.rachelCollegeBoardFRQs;

import java.util.Random;

public class PasswordGenerator {
    private Integer count=0;
    private String password;
    private String prefix;
    private Integer digits;

    public PasswordGenerator(Integer d, String p){ //overloaded constructor
        this.digits = d;
        this.prefix = p;
    }
    public String pwGen() {
        password = prefix + ".";
        Random rand = new Random();
        for (int i=0; i<digits; i++){
            int n = rand.nextInt(10);
            password += n;
        }
        System.out.println(password);
        count++;
        return password;
    }
    public Integer pwCount() {
        //count++;
        System.out.println("Count: " + count);
        return count;
    }
    public String passwordFinal() {
        System.out.println("Your password is: " + password + "; " + count + " passwords have been generated.");
        return password;
    }

    public static void main(String[] args) {
        PasswordGenerator pw1 = new PasswordGenerator(4,"chs");
        pw1.pwCount();
        pw1.pwGen();
        pw1.pwGen();
        pw1.pwCount();
        pw1.passwordFinal();
    }
}
