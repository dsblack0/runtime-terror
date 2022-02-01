package com.example.sping_portfolio.controllers.adritaCollegeboardFRQs;

public class unit3 {
    String person;
    boolean rsvp;
    int selection;

    public unit3(String name){
        person = name;
    }
    public String attendance(boolean rsvp){
        if (rsvp == true){
            String attendance = "attending";
            System.out.println(attendance);
            return attendance;
        }
        else {
            String attendance = "not attending";
            System.out.println(attendance);
            return attendance;
        }
    }
    public String food(int selection){
        String food;
        if (selection == 1){
            food = "beef";
            System.out.println(food);
        }
        else if (selection == 2){
            food = "chicken";
            System.out.println(food);
        }
        else if (selection == 3){
            food = "pasta";
            System.out.println(food);
        }
        else{
            food = "fish";
            System.out.println(food);
        }
        return food;
    }
    public String info(boolean rsvp, int selection){
        String option2 = "Sorry you can't make it";
        String option1 = "Thanks for attending.";
        if (rsvp == true){
            if (selection == 1){
                option1 = "Thanks for attending. You will be served beef.";
            }
            else if (selection == 2){
                option1 = "Thanks for attending. You will be served chicken.";
            }
            else if (selection == 3){
                option1 = "Thanks for attending. You will be served pasta.";
            }
            else{
                option1 = "Thanks for attending. You will be served fish.";
            }
        }
        if (rsvp == false){
            option1 = "Sorry you can’t make it.";
        }
        return option1;
    }
}
