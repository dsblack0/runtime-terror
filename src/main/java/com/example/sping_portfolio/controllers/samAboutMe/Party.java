package com.example.sping_portfolio.controllers.samAboutMe;

public class Party {
    boolean rsvp;
    int selection;
    String option1;
    String option2;
    String attendance;
    String food;
    String person;

    public Party(String name) {
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
        if (!rsvp) {
            option1 = "Sorry you can’t make it.";
        } else {
            option1 = "Thanks for attending. YOu will be served ";
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
        return option1;
    }

    /* public void display() {
        System.out.print(person + " is " + attendance + " and will eat " + food);
    }

        public static void main(String []args) {
        Party person1 = new Party("person1");
        person1.Attendance(true);
        person1.Food(4);
        person1.Information(true, 3);
        person1.display();


    } */
}
