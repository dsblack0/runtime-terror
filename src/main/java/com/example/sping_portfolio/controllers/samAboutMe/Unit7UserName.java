package com.example.sping_portfolio.controllers.samAboutMe;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unit7UserName {
    private ArrayList<String> possibleNames = new ArrayList<>();
    private ArrayList<String> possibleNames2 = new ArrayList<>();
    private String firstName;
    private String lastName;
    private ArrayList<String> usedNames = new ArrayList<>();

    public Unit7UserName() {
        firstName = "john";
        lastName = "smith";
    }

    public void setUserName(String fn, String ln) {
        firstName = fn;
        lastName = ln;

        for (int i=0; i < firstName.length(); i++) {
            possibleNames.add(lastName + firstName.substring(0, i+1));
        }
    }

    public boolean isUsed(String name) {
        boolean result = usedNames.contains(name);
        return result;
    }

    public void setAvailableUsers() {
        for (int i = 0; i < possibleNames.size(); i++) {
            if(isUsed(possibleNames.get(i))) {
                possibleNames.remove(i);
                i--;
            }
        }
    }

    public ArrayList<String> setAvailableUsers2(String fn2, String ln2) {
        firstName = fn2;
        lastName = ln2;

        for (int i=0; i < firstName.length(); i++) {
            possibleNames2.add(lastName + firstName.substring(0, i+1));
        }
        for (int i = 0; i < possibleNames2.size(); i++) {
            if(isUsed(possibleNames2.get(i))) {
                possibleNames2.remove(i);
                i--;
            }
        }
        return possibleNames2;
    }

    public void setUsedNames() {
        usedNames.addAll(possibleNames);
    }

    public ArrayList<String> getPossibleNames() {
        return possibleNames;
    }

    public static void main(String[] args) {
        Unit7UserName username = new Unit7UserName();
        username.setUserName("john", "smith");
        username.setAvailableUsers();
        ArrayList<String> possibleNames1 = username.getPossibleNames();
        username.setUsedNames();
        ArrayList<String> possibleNames2 = username.setAvailableUsers2("johnson", "smith");
        System.out.println(possibleNames1);
        System.out.println(possibleNames2);

    }
}
