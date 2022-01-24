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

}
