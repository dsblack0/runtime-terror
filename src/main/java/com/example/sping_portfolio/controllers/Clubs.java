package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;
import java.util.ArrayList;

@Controller
public class Clubs implements Serializable {
    String title;
    String description;
    String dates;

    // method to create Clubs Object
    public void clubCreate(String t, String d, String de) {
        title = t;
        description = d;
        dates = de;
    }

    // getters for each of the attributes
    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public String getDates() {
        return dates;
    }

    // Create ArrayList of clubs
    public ArrayList<Clubs> clubslist(){
        Clubs club1 = new Clubs();//creating an object of Student
        Clubs club2 = new Clubs();
        club1.clubCreate("Speech & Debate", "Participate in tournaments.", "Mondays & Wednesdays");
        club2.clubCreate("Speech & Debate", "Participate in tournaments.", "Mondays & Wednesdays");

        ArrayList<Clubs> list = new ArrayList<>();
        list.add(club1);
        list.add(club2);

        return (list);
    }


    public static void main(String[] args) {
        //Creating an object or instance

    }
}
