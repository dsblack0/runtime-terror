package com.example.sping_portfolio.kaavyaCollegeBoardFRQs.FRQ8;

public class ExperimentalFarm {

    private Plot[][] farmPlots;
    private int yield;
    private Plot highestYield;
    private String firstCrop;
    private boolean same;

    public ExperimentalFarm(Plot[][] p) {
        farmPlots = p;
        yield = 0;
        same = false;
    }

    /** Returns the plot with the highest yield for a given crop type, as described in part (a). */
    public Plot getHighestYield(String c) {
        for (int row = 0; row < farmPlots.length; row++){
            for (int col =0; col < farmPlots[0].length; col++) {
                if ((farmPlots[row][col]).getCropYield() > yield) {
                    highestYield = farmPlots[row][col];
                }
            }
        }
        return highestYield;
    }

    /** Returns true if all plots in a given column in the two-dimensional array farmPlots
     * contain the same type of crop, or false otherwise, as described in part (b).
     */
    public boolean sameCrop(int col) {
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





























