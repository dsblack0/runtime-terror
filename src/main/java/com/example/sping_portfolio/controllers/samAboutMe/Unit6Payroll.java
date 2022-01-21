package com.example.sping_portfolio.controllers.samAboutMe;

public class Unit6Payroll {
    private int[] itemsSold; // number of items sold by each employee
    private double wage; // wages to be computed in part (b)

    public Unit6Payroll() {
        itemsSold = new int[] {48, 50, 37, 62, 38, 70, 55, 37, 64, 60};
    }

    public Unit6Payroll(int[] is) {
        itemsSold = is;
    }

    public double computeBonusThreshold() {
        int total = itemsSold[0];
        int min = itemsSold[0];
        int max = itemsSold[0];
        for (int i=1; i<itemsSold.length; i++) {
            total += itemsSold[i];
            if (itemsSold[i] > max) {
                max = itemsSold[i];
            }
            if (itemsSold[i] < min) {
                min = itemsSold[i];
            }
        }
        double bonusThreshold = (total - max - min) / (itemsSold.length - 2.0);

        return bonusThreshold;
    }

    public double computeWages(double fixedWage, double perItemWage, int index) {
            wage = fixedWage + (itemsSold[index] * perItemWage);
            if (itemsSold[index] > computeBonusThreshold()) {
                wage = wage * 1.1;
            }
        return wage;
    }

    public static void main(String[] args) {
        Unit6Payroll employee = new Unit6Payroll();
        System.out.println(employee.computeBonusThreshold());
        System.out.println(employee.computeWages(10.0, 1.5,9));
    }

}
