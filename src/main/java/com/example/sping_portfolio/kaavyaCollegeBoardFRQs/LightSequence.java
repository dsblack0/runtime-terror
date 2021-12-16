package com.example.sping_portfolio.kaavyaCollegeBoardFRQs;

import java.sql.Array;

public class LightSequence {
    // attributes not shown
    private String seq;
    /** The parameter seq is the initial sequence used for
     * the light display
     */

    public LightSequence(String seq) {
        this.seq = seq;
    }

    /** Inserts the string segment in the current sequence,
     * starting at the index ind. Returns the new sequence.
     */
    public String insertSegment(String segment, int ind) {
        this.seq = seq.substring(0,ind) + segment + seq.substring(4);
        return seq;
    }

    /** Updates the sequence to the value in seq
     */

    public void changeSequence(String seq) {
        this.seq = seq;
    }

    /** Uses the current sequence to turn the light on and off
     * for the show
     */

    public void display() {
        System.out.println(seq);
    }

    public void oldToNew (String oldSeq, String segment) {
        String newSeq;
        int index = oldSeq.indexOf(segment);
        newSeq = oldSeq.substring(0, index) + oldSeq.substring((segment.length() + index)-1);
    }

    public void distance (double a, double b){
        double vertical = a;
        double horizontal = b;
        double straightDist = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println(straightDist);
    }

    //will have to move into controller
    public void gradShow (){
        LightSequence gradShow = new LightSequence("0101 0101 0101");
        gradShow.display();
        gradShow.changeSequence("0011 0011 0011");
        gradShow.insertSegment("1111 1111", 4);
    }
}
