package com.example.sping_portfolio.rachelCollegeBoardFRQs;

import java.lang.Math;

public class LightSequence
    //.
{
    private String resultSeq;

    public LightSequence(String seq)
    {
        resultSeq = seq;
        System.out.println("LightSequence");
    }

    public String insertSegment(String segment, int ind)
    {
        resultSeq = resultSeq.substring(0,ind+1) + segment + resultSeq.substring(ind+1);
        return resultSeq;
    }

    public void changeSequence(String seq)
    {
        resultSeq = seq;
        System.out.println("changeSequence");
    }

    public void display()
    {
        System.out.println(resultSeq);
    }

    public static String questionE(String oldSeq, String oldSegment, String newSegment)
    {
        String newSeq = oldSeq.replaceFirst(oldSegment, newSegment);
        System.out.println(newSeq);
        return newSeq;
    }


    public static void questionF(double a, double b)
    {
        double c = Math.sqrt(a*a + b * b);
        System.out.println(c);
    }


    public static void main(String []args)
    {
        String newSeq;
        LightSequence gradShow = new LightSequence("0101 0101 0101");
        gradShow.display();
        gradShow.changeSequence("0011 0011 0011");
        gradShow.insertSegment("1111 1111", 4);
        gradShow.display();
        newSeq = questionE("110000011", "11","");
        newSeq = questionE("0000011", "11","");
        newSeq = questionE("1100000111","00","");
        questionF(10.4,21.3);
    }
}