package com.example.sping_portfolio.rachelCollegeBoardFRQs;

import javax.persistence.criteria.CriteriaBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Payroll {
    ArrayList<Integer> itemsSold = new ArrayList<Integer>(); //number of items sold by each employee
    ArrayList<Double> wages = new ArrayList<Double>(); //wages to be computed in part (b)
    Double fixedWage = 10.00;
    Double perItemWage = 1.50;
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
    public String removeMinMax() {
        ArrayList<Integer> itemsSoldThreshold = (ArrayList)itemsSold.clone();
        Integer maxSold = itemsSoldThreshold.get(0);
        Integer minSold = itemsSoldThreshold.get(0);
        int n = itemsSoldThreshold.size();

        for (int i = 1; i < n; i++) {
            if (itemsSoldThreshold.get(i) < minSold) {
                minSold = itemsSoldThreshold.get(i);
            }
        }

        // loop to find maximum from ArrayList
        for (int i = 0; i < n; i++) {
            if (itemsSoldThreshold.get(i) > maxSold) {
                maxSold = itemsSoldThreshold.get(i);
            }
        }
        System.out.println("The minimum is: " + minSold);
        System.out.println("The maximum is " + maxSold);

        itemsSoldThreshold.remove(minSold);
        itemsSoldThreshold.remove(maxSold);

        System.out.println(itemsSoldThreshold);

        return "max sold is" + maxSold + ". min sold is" + minSold;
    }

    public double computeBonusThreshold() {
        double itemsSoldSum = 0;
        double bonusThreshold;
        int n = itemsSold.size()-2;
        for (int i = 0; i < n; i++) {
            itemsSoldSum += itemsSold.get(i);
        }
        bonusThreshold = itemsSoldSum/n;

        System.out.println("the bonus threshold is: " + bonusThreshold);

        return bonusThreshold;
    }

    /**computes employee wages as described in part (b)
     * and stores them in wages.
     * The parameter fixedWage represents the fixed amount of each employee
     * is paid per day.
     * The parameter perItemWage represents the amount each employee
     * is paid per item sold.
     */
     public void computeWages(double fixedWage, double perItemWage) {
         double bonusThreshold =computeBonusThreshold();
         for (int i = 0; i < itemsSold.size(); i++) {
            if (itemsSold.get(i) > bonusThreshold){
                double wage = (fixedWage + perItemWage * itemsSold.get(i)) * 1.1;
                System.out.println("Employee " + i + " wage is: " + wage);
                wages.add(i,wage);
            }
            else {
                double wage = (fixedWage + perItemWage * itemsSold.get(i));
                System.out.println("Employee " + i + " wage is: " + wage);
                wages.add(i,wage);
            }
        }
         System.out.println("Employee wages are: " + wages);
     }
     public String generatedWage() {
         System.out.println("Items sold per employee are: " + itemsSold);
         System.out.println("Employee wages are: " + wages);
         return "items sold: " + itemsSold + "; employee wages: " + wages;
     }

    public static void main(String[] args) {
        Payroll payroll1 = new Payroll(10, 20, 30, 40, 50, 60);
        payroll1.removeMinMax();
        payroll1.computeWages(10.00, 1.50);
        payroll1.generatedWage();

    }


}
