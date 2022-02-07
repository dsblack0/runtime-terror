package com.example.sping_portfolio.kaavyaCollegeBoardFRQs;

public class PasswordGeneratorFRQ5 {

    private int digits;
    private String prefix;
    private int count;

    public PasswordGeneratorFRQ5 (int digits, String prefix) {
        this.digits = digits;
        this.prefix = prefix;
    }

    public PasswordGeneratorFRQ5 (int digits) {
        this.digits = digits;
        prefix = "A";
    }

    public String pwGen () {
        String numbers;
        String pw;
        numbers = "";
        for (int index = 0; index < digits; index++ ){
            numbers += (int)(Math.random() * 10);
        }
        pw = prefix + "." + numbers;
        count += 1;
        return pw;
    }

    public int pwCount(){
        return count;
    }
}
