package com.example.sping_portfolio.rachelCollegeBoardFRQs;

public class unit3part1 {
    public static void main(String[] args) {
        boolean rsvp = true;
        int selection = 100; //1 is beef, 2 is chicken, 3 is pasta, other is fish
        String option1 = "Thank you for attending. You will be served ";
        String option2 = "Sorry you can't make it";

        //part d
        if(option1 == option2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        //part c
        if(rsvp ==true){
            String choice = "";
            if(selection==0){
                choice = "No Selection.";
            }
            else if(selection == 1){
                choice = "Beef.";
            }
            else if(selection == 2){
                choice = "Chicken.";
            }
            else if(selection == 3){
                choice = "Pasta.";
            }
            else{
                choice = "Fish.";
            }
            System.out.println(option1 + choice);
        }
        else{
            System.out.println(option2);
        }

        //part a
        if(rsvp == true){
            System.out.println("Attending");
        }
        else{
            System.out.println("Not Attending");
        }

        //part b
        if(selection==0){
            System.out.println("No Selection");
        }
        else if(selection == 1){
            System.out.println("Beef");
        }
        else if(selection == 2){
            System.out.println("chicken");
        }
        else if(selection == 3){
            System.out.println("pasta");
        }
        else{
            System.out.println("fish");
        }


    }
}
