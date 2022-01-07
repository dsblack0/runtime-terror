package com.example.sping_portfolio.controllers.samAboutMe;

public class Unit3Party {
    boolean rsvp;
    int selection;
    String option1;
    String option2;
    String attendance;
    String food;
    String person;
    String compare;


    public Unit3Party(String name) {
        person = name;
    }

    public String Attendance(boolean rsvp) {
        if (rsvp) {
            attendance = "attending";
            return attendance;
        } else {
            attendance = "not attending";
            return attendance;
        }
    }

    public String Food(int selection) {
        if (selection == 1) {
            food = "beef";
            return food;
        } else if (selection == 2) {
            food = "chicken";
            return food;
        } else if (selection == 3) {
            food = "pasta";
            return food;
        } else {
            food = "fish";
            return food;
        }
    }

    public String Information(boolean rsvp, int selection) {
        option2 = "Sorry you can't make it.";
        if (!rsvp) {
            option1 = "Sorry you can't make it.";
        } else {
            option1 = "Thanks for attending. You will be served ";
            if (selection == 1) {
                option1 += "beef.";
            } else if (selection == 2) {
                option1 += "chicken.";
            } else if (selection == 3) {
                option1 += "pasta.";
            } else {
                option1 += "fish.";
            }
        }
        if (option1.equals(option2)) {
            compare = "true";
        } else {
            compare = "false";
        }
        return option1;
    }
    public String compare() {
        return compare;
    }
}
