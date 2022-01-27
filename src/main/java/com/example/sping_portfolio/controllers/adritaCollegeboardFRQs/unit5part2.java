package com.example.sping_portfolio.controllers.adritaCollegeboardFRQs;

import java.util.Random;

public class unit5part2 {
    int count = 0;
    String prefix;
    int digits;
    public unit5part1(int digits, String prefix){
        this.digits = digits;
        this.prefix = prefix;
    }
    public unit5part1(int digits){
        this.digits = digits;
        prefix = "A";
    }
    public String pwGenerator(){
        count += 1;
        String pwd = this.prefix + ".";
        for (int i = 1; i <= this.length; i++) {
            int randomNum = new Random().nextInt(10);
            pwd += randomNum;
        }
        return pwd;
    }
}
