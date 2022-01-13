package com.example.sping_portfolio.controllers.samiCollegeBoard;
import java.util.ArrayList;


public class hauntedHouse {
    static double ratio;
    private String costume;
    private int candy;
    private int diceRoll;

    public hauntedHouse(String costume, double ratio){
        setCostume(costume);
        this.costume = costume;
    }


    public double getRatio(){
        return ratio;
    }

    public String getCostume(){
        return costume;

    }

    public int getCandy(){
        return candy;

    }

    public int getDiceRoll(){
        return diceRoll;
    }

    public void setRatio(double ratio){
        this.ratio = ratio;
    }

    public void setCostume(String costume){
        this.costume = costume;
    }

    public void setDiceRoll(int diceRoll){
        this.diceRoll = diceRoll;
    }

    public void setCandy(int candy){
        this.candy = candy;
    }


    public int candyAmt(String costume){
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

    }






}

