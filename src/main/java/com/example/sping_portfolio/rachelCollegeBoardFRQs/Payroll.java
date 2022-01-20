package com.example.sping_portfolio.rachelCollegeBoardFRQs;

import javax.persistence.criteria.CriteriaBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Payroll {
    ArrayList<Integer> itemsSold = new ArrayList<Integer>(); //number of items sold by each employee
    ArrayList<Double> wages = new ArrayList<Double>(); //wages to be computed in part (b)
    Double fixedWage = 10.00;
    Integer maxSold = itemsSold.get(0);
    Integer minSold = itemsSold.get(0);
    Integer employee0Sold;
    Integer employee1Sold;
    Integer employee2Sold;
    Integer employee3Sold;
    Integer employee4Sold;
    Integer employee5Sold;

    public Payroll(Integer e0, Integer e1, Integer e2, Integer e3, Integer e4, Integer e5) {
        employee0Sold = e0;
        employee1Sold = e1;
        employee2Sold = e2;
        employee3Sold = e3;
        employee4Sold = e4;
        employee5Sold = e5;

        itemsSold.add(e0);
        itemsSold.add(e1);
        itemsSold.add(e2);
        itemsSold.add(e3);
        itemsSold.add(e4);
        itemsSold.add(e5);
    }

    /** returns the bonus threshold as described in part (a)*/
    public double computeBonusThreshold() {
        for (Integer n : itemsSold) {
            if (n > maxSold) {
                n = maxSold;
            }
            if (n < minSold) {
                n = minSold;
            }
        }
        System.out.println("The minimum is: " + minSold);
        System.out.println("The maximum is " + maxSold);

        itemsSold.remove(minSold);
        itemsSold.remove(maxSold);

        return itemsSold;
    }

    /**computes employee wages as described in part (b)
     * and stores them in wages.
     * The parameter fixedWage represents the fixed amount of each employee
     * is paid per day.
     * The parameter perItemWage represents the amount each employee
     * is paid per item sold.
     */
     public void computeWages(double fixedWage, double perItemWage) {

     }


}
