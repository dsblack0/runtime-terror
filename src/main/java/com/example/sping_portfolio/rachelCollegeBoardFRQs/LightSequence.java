package com.example.sping_portfolio.rachelCollegeBoardFRQs;

// OBJECTIVE:  Write a statement to create a LightSequence object gradShow that has the initial light sequence "0101 0101 0101".

import groovy.lang.GString;

public class LightSequence
{
// attributes not shown
    public LightSequence gradShow;


    public LightSequence(String seq)
    {
        LightSequence gradShow = new LightSequence("0101 0101 0101");
        gradShow.display();
        gradShow.changeSequence("0011 0011 0011");
    }
    /** Inserts the string segment in the current sequence,

     * starting at the index ind. Returns the new sequence.

     */

    public void insertSegment(String segment, int ind)

    {
        gradShow.insertSegment("1111 1111", 4);
    }



    /** Updates the sequence to the value in seq

     */

    public void changeSequence(String seq)

    { /* implementation not shown */ }



    /** Uses the current sequence to turn the light on and off

     * for the show
     * @param gradShow

     */

    public void display()
    {
        return;
    }

}