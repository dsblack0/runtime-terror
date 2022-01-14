package com.example.sping_portfolio.rachelCollegeBoardFRQs;

public class Dinner {

    private boolean rsvp;
    private int selection;
    private String option1;
    private String option2;
    private String choice;

    public boolean rsvp(boolean rsvp) {
        boolean attendance = false;
        //part a
        if (rsvp == true) {
            attendance = true;
            System.out.println("Attending");
        } else {
            attendance = false;
            System.out.println("Not Attending");
        }
        return attendance;
    }

    public String printSelection(int selection) {
        if (selection == 0) {
            System.out.println("No Selection");
            choice = "No Selection";
        } else if (selection == 1) {
            System.out.println("Beef");
            choice = "Beef";
        } else if (selection == 2) {
            System.out.println("chicken");
            choice = "Chicken";
        } else if (selection == 3) {
            System.out.println("pasta");
            choice = "Pasta";
        } else {
            System.out.println("fish");
            choice = "Fish";
        }
        return choice;
    }

    public String dinnerOption1(boolean rsvp, int selection) {
        if (rsvp == true) {
            option1 = "Thank you for attending. You will be served " + choice;
        } else {
            option1 = "Sorry you can't make it.";
        }
        return option1;
    }

    public String dinnerOption2(boolean rsvp, int selection) {
        if (rsvp == true) {
            this.option2 = "Thank you for attending! You will be served " + choice;
        } else {
            this.option2 = "Sorry you can't make it.";
        }
        return this.option2;
    }

    public String compare() {
        if (option1 == option2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return null;
    }

}


