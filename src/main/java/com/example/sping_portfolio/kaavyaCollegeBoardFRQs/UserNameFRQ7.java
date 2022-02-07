package com.example.sping_portfolio.kaavyaCollegeBoardFRQs;

import java.util.ArrayList;

public class UserNameFRQ7 {

    // The list of possible user names, based on a user’s first and last names and initialized by the constructor.
    private ArrayList<String> possibleNames;
    private String [] usedNames = { "wickc", "smithk", "leek", "jainr", "martinl"};
    private boolean response;

    public UserNameFRQ7() {
        possibleNames = null;
        this.response = false;
    }

    /** Constructs a UserName object as described in part (a).
     * Precondition: firstName and lastName have length greater than 0
     * and contain only uppercase and lowercase letters.
     */

    public ArrayList<String> userNames(String firstName, String lastName) {
        possibleNames = new ArrayList<String>();
        for (int x=0; x < lastName.length(); x++){
            possibleNames.add(x, lastName + firstName.substring(0, x));
        }
        return possibleNames;
    }

    /** Returns true if arr contains name, and false otherwise. */
    public boolean isUsed(String name, String[] arr) {
        String user = name;
        String [] usedNames = arr;
        for (String used: usedNames){
            if (user.equals(used)){
                response = true;
            }
            else {
                response = false;
            }
        }
        return response;
    }

    /** Removes strings from possibleNames that are found in usedNames as described in part (b).
     */
    public ArrayList<String> setAvailableUserNames() {
        for (String user : possibleNames){
            if (isUsed(user, usedNames) == true){
                possibleNames.remove(user);
            }
        }
        return possibleNames;
    }
}
