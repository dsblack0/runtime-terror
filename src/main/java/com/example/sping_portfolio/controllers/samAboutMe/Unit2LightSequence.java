package com.example.sping_portfolio.controllers.samAboutMe;

public class Unit2LightSequence {
    String resultSeq;

    public Unit2LightSequence(String seq) {

        resultSeq = seq;
    }

    public String insertSegment(String oldSeq, String segment, int ind) {
        resultSeq = oldSeq.substring(0, ind + 1) + segment + oldSeq.substring(ind + 1);
        return resultSeq;
    }

    public void changeSequence(String seq) {

        resultSeq = seq;
    }

    public void display() {
        System.out.println(resultSeq);
    }

    public String getSeq() {

        return resultSeq;
    }

    public static String changeSegment(String oldSeq, String segment) {
        int index = oldSeq.indexOf(segment);
        String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index + segment.length());
        return newSeq;
    }

    public static double mathSqrt(double a, double b) {
        double c = Math.sqrt(a * a + b * b);
        return c;
    }
}
