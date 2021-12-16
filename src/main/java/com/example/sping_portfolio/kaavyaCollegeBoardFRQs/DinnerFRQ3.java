package com.example.sping_portfolio.kaavyaCollegeBoardFRQs;

public class DinnerFRQ3 {
    //private boolean rsvp;
    //private int selection;
    private String option1;
    private String option2;
    private String response;

    public void frq_3 (){
        //this.rsvp = rsvp;
        //this.selection = selection;
        this.option1 = "not specified";
        this.option2 = "not specified";
    }

    public boolean rsvpBoolean (String rsvp){
        boolean attending;
        if (rsvp.equals("no")) {
            attending = false;
        }
        else{
            attending = true;
        }
        return attending;
    }

        public String printAttending (boolean rsvp){
        if (rsvp == true){
            response = "attending";
        }
        else{
            response = "not attending";
        }
        return response;
    }

    public String printSelection (int selection){
        if (selection == 1){
            response = "beef";
        }
        else if (selection == 2){
            response = "chicken";
        }
        else if (selection == 3){
            response = "pasta";
        }
        else{
            response = "fish";
        }
        return response;
    }

    public String dinnerSelection1 (boolean rsvp, int selection) {
        if (rsvp == true){
            this.option1 = "Thanks for " + printAttending(rsvp) + ". You will be served " + printSelection(selection) + ".";
        }
        else {
            this.option1 = "Sorry you can't make it.";
        }
        return this.option1;
    }

    public String dinnerSelection2 (boolean rsvp, int selection) {
        if (rsvp == true){
            this.option2 = "Thanks for " + printAttending(rsvp) + ". You will be served " + printSelection(selection) + ".";
        }
        else {
            this.option2 = "Sorry you can't make it.";
        }
        return this.option2;
    }

    public String compareOptions (){
        if (this.option1.equals(this.option2)){
            response = "true";
        }
        else {
            response = "false";
        }
        return response;
    }
}
