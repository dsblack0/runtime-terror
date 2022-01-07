package com.example.sping_portfolio.kaavyaCollegeBoardFRQs;

import java.sql.Array;

public class LightSequence {
    // attributes not shown
    private String sequence;
    /** The parameter seq is the initial sequence used for
     * the light display
     */

    /** Inserts the string segment in the current sequence,
     * starting at the index ind. Returns the new sequence.
     */
    public String insertSegment(String segment2, int ind) {
        String insertSeq = sequence.substring(0,ind) + segment2 + sequence.substring(4);
        return insertSeq;
    }

    /** Updates the sequence to the value in seq
     */

    public String changeSequence(String seq) {
        sequence = seq;
        return sequence;
    }

    /** Uses the current sequence to turn the light on and off
     * for the show
     */

    public void display() {
        System.out.println(sequence);
    }

    public String oldToNew (String seq, String segment) {
        sequence = seq;
        String newSeq;
        int index = seq.indexOf(segment);
        newSeq = seq.substring(0, index) + seq.substring((segment.length() + index));
        return newSeq;
    }

    public double distance (double a, double b){
        double vertical = a;
        double horizontal = b;
        double straightDist = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return straightDist;
    }

    //will have to move into controller
    public void gradShow (){
        LightSequence gradShow = new LightSequence();
        gradShow.display();
        gradShow.changeSequence("0011 0011 0011");
        gradShow.insertSegment("1111 1111", 4);
    }
}
