package com.example.sping_portfolio.kaavyaCollegeBoardFRQs.FRQ8;

public class Plot {

    private String cropType;
    private int cropYield;

    public Plot(String crop, int yield) {
        cropType = crop;
        cropYield = yield;
    }

    public String getCropType() {
        return cropType;
    }

    public int getCropYield() {
        return cropYield;
    }

}
