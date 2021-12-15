package com.example.sping_portfolio.controllers.samAboutMe;

import java.lang.Math;

public class LightSequence {
    String resultSeq;

    public LightSequence(String seq)
    {
        resultSeq = seq;
    }

    public String insertSegment(String segment, int ind)
    {
        resultSeq = resultSeq.substring(0,ind+1) + segment + resultSeq.substring(ind+1);
        return resultSeq;
    }

    public void changeSequence(String seq)
    {
        resultSeq = seq;
    }

    public void display()
    {
        System.out.println(resultSeq);
    }

    public String getSeq() {
        return resultSeq;
    }

    public static String changeSegment(String oldSeq, String segment)
    {
        int index = oldSeq.indexOf(segment);
        String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index+segment.length());
        System.out.println("changedSegment = " + newSeq);
        return newSeq;
    }

    public static double mathSqrt(double a, double b)
    {
        double c = Math.sqrt(a*a + b * b);
        return c;
    }

    public static void main(String []args)
    {
        String newSeq;
        LightSequence gradShow = new LightSequence("0101 0101 0101");
        gradShow.display();
        gradShow.changeSequence("0011 0011 0011");
        gradShow.display();
        gradShow.insertSegment("1111 1111", 4);
        gradShow.display();
        newSeq = changeSegment("110000011", "11");
        newSeq = changeSegment("0000011", "11");
        newSeq = changeSegment("1100000111","00");
        mathSqrt(5.0,12.0);
    }
}
