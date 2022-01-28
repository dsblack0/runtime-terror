package com.example.sping_portfolio.rachelCollegeBoardFRQs;

import java.util.ArrayList;
import java.util.Arrays;

public class UserName {
    // The list of possible user names, based on a user’s first and last names and initialized by the constructor.
    private ArrayList<String> possibleNames;
    /** Constructs a UserName object as described in part (a).
     * Precondition: firstName and lastName have length greater than 0
     * and contain only uppercase and lowercase letters.
     */

    public String firstName;
    public String lastName;
    public String generatedUserNames = "";

    public UserName(String first, String last){
        firstName = first;
        lastName = last;
        if(this.isValidName(first) && this.isValidName(last)){
            possibleNames = new ArrayList<String>();
            for(int i=1;i<first.length()+1;i++){
                possibleNames.add(last+first.substring(0,i));
            }
        }else{
            System.out.println("firstName and lastName must contain letters only.");
        }
    }

    public boolean isValidName(String n) {
        boolean validity = true;
        if ( n.length() <= 0 ) {
            validity = false;
        }
        for (int i = 0; i < n.length(); i++){
            if ((Character.isLetter(n.charAt(i)) == false)) {
                validity = false;
            }
        }
        return validity;
    }

    /** Returns true if arr contains name, and false otherwise. */
    public boolean isUsed(String name, String[] arr){
        ArrayList<String> previousUName = new ArrayList<>(Arrays.asList(arr));
        boolean status = previousUName.contains(name);
        return status;
    }

    /** Removes strings from possibleNames that are found in usedNames as described in part (b).
     */
    public void setAvailableUserNames(String[] usedNames){
        for (int i=0; i<possibleNames.size(); i++){
            if(isUsed(possibleNames.get(i), usedNames)) {
                possibleNames.remove(i);
                i--;
            }
        }
        System.out.println(possibleNames);
    }

    public String generatedNames() {
        for (int i=0;i<possibleNames.size();i++){
            generatedUserNames += possibleNames.get(i) + ", ";
        }
        System.out.println("Possible Usernames are: " + possibleNames);
        System.out.println("generated names are: " + generatedUserNames);
        //return "possible usernames: " possibleNames;
        return generatedUserNames;
    }

    public static void main(String[] args) {
        UserName person1 = new UserName("john", "smith");
        String[] used = {"smithj", "jsmith"};
        person1.setAvailableUserNames(used);
        person1.generatedNames();

    }
}
