package com.example.sping_portfolio.kaavyaCollegeBoardFRQs;

import java.lang.reflect.Array;

public class PayrollFRQ6 {

    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)
    private int most;
    private int least;
    private double fixedWage;
    private double perItemWage;

    /** Returns the bonus threshold as described in part (a).
     */
    public double computeBonusThreshold() {
        int sum = 0;
        double average = 0.0;
        for (int x = 0; x < itemsSold.length; x++){
            sum += (itemsSold[x] - mostItems() - leastItems());
        }
        average = ((double)sum / (itemsSold.length - 2));
        return average;
    }

    /** Computes employee wages as described in part (b)
     * and stores them in wages.
     * The parameter fixedWage represents the fixed amount each employee
     * is paid per day.
     * The parameter perItemWage represents the amount each employee
     * is paid per item sold.
     */

    public double[] computeWages(double fixedWage, double perItemWage, int [] itemsSold) {
        this.itemsSold = itemsSold;
        double wage;
        int counter = 0;
        this.fixedWage = fixedWage;
        this.perItemWage = perItemWage;
        wages = new double[itemsSold.length];
        double threshold = computeBonusThreshold();
        for (int item: itemsSold) {
            if (item > threshold){
                wage = ((fixedWage + perItemWage) * item) * 1.1;
                wages[counter] = wage;
            }
            else {
                wage = (fixedWage + perItemWage) * item;
                wages[counter] = wage;
            }
           counter++;
        }
        return wages;
    }

    public int mostItems () {
        for (int x = 0; x < itemsSold.length - 1; x++){
            if (itemsSold[x] > itemsSold[x+1]){
                most = itemsSold[x];
            }
        }
        return most;
    }

    public int leastItems () {
        for (int x = 0; x < itemsSold.length - 1; x++){
            if (itemsSold[x] < itemsSold[x+1]){
                least = itemsSold[x];
            }
        }
        return least;
    }

}
