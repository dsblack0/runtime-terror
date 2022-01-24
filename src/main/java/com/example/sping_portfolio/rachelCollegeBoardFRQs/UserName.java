package com.example.sping_portfolio.rachelCollegeBoardFRQs;

import java.util.ArrayList;

public class UserName {
    // The list of possible user names, based on a user’s first and last names and initialized by the constructor.
    private ArrayList<String> possibleNames;
    /** Constructs a UserName object as described in part (a).
     * Precondition: firstName and lastName have length greater than 0
     * and contain only uppercase and lowercase letters.
     */

    private String first;
    private String last;

    public UserName(String firstName, String lastName){
        first = firstName;
        last = lastName;
        //possibleNames = last + first;
    }

    /** Returns true if arr contains name, and false otherwise. */
    public boolean isUsed(String name, String[] arr){
        return true;
    }

    /** Removes strings from possibleNames that are found in usedNames as described in part (b).
     */
    public void setAvailableUserNames(String[] usedNames){

    }
}
