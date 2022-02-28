package com.example.sping_portfolio.kaavyaCollegeBoardFRQs;

import java.util.ArrayList;

public class HauntedHouse {
    static double ratio;
    private String costume;
    private int candy;
    private int diceRoll;

    public HauntedHouse (String costume, double ratio) {
        setCostume(costume);
        this.costume = getCostume();
        setRatio(ratio);
        this.ratio = getRatio();
    }

    public double getRatio () {
        return ratio;
    }

    public String getCostume() {
        return costume;
    }

    public int getCandy () {
        return candy;
    }

    public int getDiceRoll () {
        return diceRoll;
    }

    public void setRatio (double ratio){
        this.ratio = ratio;
    }

    public void setCostume (String costume) {
        this.costume = costume;
    }

    public void setCandy (int candy) {
        this.candy = candy;
    }

    public void setDiceRoll (int diceRoll) {
        this.diceRoll = diceRoll;
    }

    public int candyAmt (String costume) {
        setCandy(costume.length());
        candy = getCandy();
        setDiceRoll((int)Math.random() * 6);
        diceRoll = getDiceRoll();
        candy = (int)Math.abs((candy * ratio) - diceRoll);
        System.out.println(candy);
        return candy;
    }

    public void costumeList (String costume) {
        ArrayList<String> costumeList = new ArrayList<String>();
        costumeList.add(costume);
        //for (elements : costumeList) {

        //}
    }
}
