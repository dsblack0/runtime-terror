package com.example.sping_portfolio.rachelCollegeBoardFRQs;

import java.util.Arrays;
import java.util.Objects;

public class ExperimentalFarm {
    private Plot[][] farmPlots;


    public ExperimentalFarm(Plot[][] p){
        farmPlots=p;
    }

    /** Returns the plot with the highest yield for a given crop type, as
     * described in part (a). */
    public Plot getHighestYield(String c) {
        Plot plot = null;
        int greatest = farmPlots[0][0].getCropYield();
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(farmPlots[i][j].getCropType().equalsIgnoreCase(c) && farmPlots[i][j].getCropYield()>greatest){
                    greatest=farmPlots[i][j].getCropYield();
                    plot=farmPlots[i][j];
                }
            }
        }
        if(plot != null){
            System.out.println("Hightest Yield is " + plot);
            return plot;
        }
        else {
            return null;
        }

    }

    /** Returns true if all plots in a given column in the two-dimensional
     * array farmPlots contain the same type of crop, or false otherwise, as
     * described in part (b). */
    public boolean sameCrop(int col) {
        boolean status=true;
        String crop = farmPlots[0][col].getCropType();

        for(int i=0;i<4;i++){
            if(!farmPlots[i][col].getCropType().equalsIgnoreCase(crop)){
                status=false;
                break;
            }
        }
        System.out.println("The crops in the column are all the same type: " + status);
        return status;

    }
/*
    public String farm(String type){
        
        return output;
    }
*/
    public static void main(String[] args) {
        Plot p1 = new Plot("corn",20);
        Plot p2 = new Plot("corn", 30);
        Plot p3 = new Plot("peas", 10);
        Plot p4 = new Plot("peas", 30);
        Plot p5 = new Plot("corn",40);
        Plot p6 = new Plot("corn",62);
        Plot p7 = new Plot("wheat",10);
        Plot p8 = new Plot("corn",50);
        Plot p9 = new Plot("rice",30);
        Plot p10 = new Plot("corn", 55);
        Plot p11 = new Plot("corn",30);
        Plot p12 = new Plot("peas", 30);
        Plot[][] plots = {{p1,p2,p3},{p4,p5,p6},{p7,p8,p9},{p10,p11,p12}};
        ExperimentalFarm f = new ExperimentalFarm(plots);
        System.out.println(Arrays.deepToString(plots));
        f.getHighestYield("corn"); //returns farmPlots[1][2]
        f.getHighestYield("peas"); //returns farmPlots[1][0] or farmPlots[3][2]
        f.getHighestYield("bananas"); //returns null
    }
}
