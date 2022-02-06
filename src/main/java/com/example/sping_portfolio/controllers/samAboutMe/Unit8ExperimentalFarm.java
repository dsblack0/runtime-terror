package com.example.sping_portfolio.controllers.samAboutMe;

public class Unit8ExperimentalFarm {
    private Unit8Plot[][] farmPlots;

    public Unit8ExperimentalFarm() {
        Unit8Plot p1 = new Unit8Plot("corn",20);
        Unit8Plot p2 = new Unit8Plot("corn", 30);
        Unit8Plot p3 = new Unit8Plot("peas",10);
        Unit8Plot p4 = new Unit8Plot("peas", 30);
        Unit8Plot p5 = new Unit8Plot("corn",40);
        Unit8Plot p6 = new Unit8Plot("corn", 62);
        Unit8Plot p7 = new Unit8Plot("wheat",10);
        Unit8Plot p8 = new Unit8Plot("corn", 50);
        Unit8Plot p9 = new Unit8Plot("rice",30);
        Unit8Plot p10 = new Unit8Plot("corn",55);
        Unit8Plot p11 = new Unit8Plot("corn", 30);
        Unit8Plot p12 = new Unit8Plot("peas",30);

        this.farmPlots = new Unit8Plot[][]{{p1,p2,p3}, {p4,p5,p6}, {p7,p8,p9}, {p10,p11,p12}};
    }

   public String getHighestYield(String cr) {
       String plotLocation = null;
        int highestYeild = farmPlots[0][0].getCropYield();
        int r = 0;
        int c = 0;

        for (int row=0; row < farmPlots.length; row++) {
            for (int col=0; col < farmPlots[0].length; col++) {
                String currentType = farmPlots[row][col].getCropType();
                int currentYield = farmPlots[row][col].getCropYield();
                if (currentType.equals(cr) && currentYield > highestYeild) {
                    highestYeild = currentYield;
                    r = row + 1;
                    c = col + 1;
                  // plotLocation = farmPlots[row+1][col+1];
                }
            }
        }
       return "row: " + r + " & col: " + c;
    }

    public boolean sameCrop(int col) {
        boolean sameCrop = true;
        for (int row=0; row < farmPlots.length-1; row++) {
            String currentType = farmPlots[row][col].getCropType();
            String nextType = farmPlots[row+1][col].getCropType();
            if(!currentType.equals(nextType)) {
                sameCrop = false;
            }
        }
        return sameCrop;
     }

     public static void main(String[] args) {
         Unit8ExperimentalFarm f = new Unit8ExperimentalFarm();
         String highestYield = f.getHighestYield("peas");
         System.out.println(highestYield);
         System.out.println(f.sameCrop(2));
     }
}
