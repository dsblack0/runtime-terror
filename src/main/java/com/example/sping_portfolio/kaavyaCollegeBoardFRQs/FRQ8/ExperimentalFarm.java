package com.example.sping_portfolio.kaavyaCollegeBoardFRQs.FRQ8;

import java.util.Random;

public class ExperimentalFarm {

    private Plot[][] farmPlots;
    private int yield;
    private Plot highestYield = null;
    private boolean same;
    private Random rand;
    private String[] crops = {"corn", "peas", "beans", "squash", "rice"};

    public ExperimentalFarm() {
        rand = new Random();
        farmPlots = new Plot[5][5];
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++){
                farmPlots[row][col] = new Plot(setCrop(), setYield());
                System.out.println(row + ", " + col + " : " + farmPlots[row][col].getCropType() + "  " + farmPlots[row][col].getCropYield());
            }
        }
        same = false;
        yield = 0;
    }

    public String setCrop(){
        return crops[rand.nextInt(5)];
    }

    public int setYield() {
        return rand.nextInt(100);
    }
    /** Returns the plot with the highest yield for a given crop type, as described in part (a). */
    public Plot getHighestYield(String c) {
        for (int row = 0; row < farmPlots.length; row++){
            for (int col =0; col < farmPlots[0].length; col++) {
                if (farmPlots[row][col].getCropType().equals(c) && (farmPlots[row][col]).getCropYield() > yield) {
                    highestYield = farmPlots[row][col];
                    yield = highestYield.getCropYield();
                }
            }
        }
        return highestYield;
    }

    /** Returns true if all plots in a given column in the two-dimensional array farmPlots
     * contain the same type of crop, or false otherwise, as described in part (b).
     */
    public boolean sameCrop(int col) {
        String firstCrop = farmPlots[0][col].getCropType();
        for (int row = 0; row < farmPlots.length; row++) {
            if ((farmPlots[row][col]).getCropType().equals(firstCrop)) {
                same = true;
            }
            else {
                same = false;
            }
        }
        return same;
    }
}





























