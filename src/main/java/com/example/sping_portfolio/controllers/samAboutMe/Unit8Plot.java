package com.example.sping_portfolio.controllers.samAboutMe;

public class Unit8Plot {
    private String cropType;
    private int cropYield;

    public Unit8Plot(String crop, int yield) {
        this.cropType = crop;
        this.cropYield = yield;
    }

    public String getCropType() {
        return cropType;
    }

    public int getCropYield() {
        return cropYield;
    }
}