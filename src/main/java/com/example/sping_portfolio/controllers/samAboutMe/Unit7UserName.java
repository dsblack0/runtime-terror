package com.example.sping_portfolio.controllers.samAboutMe;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unit7UserName {
    private ArrayList<String> possibleNames = new ArrayList<>();
    private String firstName;
    private String lastName;

    public Unit7UserName() {
        firstName = "john";
        lastName = "smith";
    }

    public Unit7UserName(String fn, String ln) {
        firstName = fn;
        lastName = ln;

        for (int i=0; i < firstName.length(); i++) {
            possibleNames.add(lastName + firstName.substring(0, i+1));
        }
    }

    public boolean isUsed(String name, String[] arr) {
        List<String> arrList = new ArrayList<String>(Arrays.asList(arr));
        boolean result = arrList.contains(name);
        return result;
    }

    public void setAvailableUsers(String[] usedNames) {
        for (int i = 0; i < possibleNames.size(); i++) {
            if(isUsed(possibleNames.get(i), usedNames)) {
                possibleNames.remove(i);
                i--;
            }
        }
    }

    public ArrayList<String> getPossibleNames() {
        return possibleNames;
    }

    public static void main(String[] args) {
        Unit7UserName users1 = new Unit7UserName("sally", "brown");
        String[] usedArray = {"browns", "brownsa"};
        users1.setAvailableUsers(usedArray);
        System.out.println(users1.getPossibleNames());
    }
}
