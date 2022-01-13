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

    public void clubCreate(String t, String d, String de) {
        title = t;
        description = d;
        dates = de;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public String getDetails() {
        return dates;
    }

    public ArrayList<Clubs> clubslist(){
        Clubs club1 = new Clubs();//creating an object of Student
        Clubs club2 = new Clubs();
        club1.clubCreate("Math homework", "DO YOUR MATH!!!!!", "detail");
        club2.clubCreate("English Homework", "Write a whole essay boyyyyy", "detail");

        ArrayList<Clubs> list = new ArrayList<>();
        list.add(club1);
        list.add(club2);

        return (list);
    }


    public static void main(String[] args) {
        //Creating an object or instance

    }


    @GetMapping("/")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String index(Model model) {

        Clubs club1 = new Clubs();//creating an object of Student
        Clubs club2 = new Clubs();
        Clubs club3 = new Clubs();
        Clubs club4 = new Clubs();//creating an object of Student
        Clubs club5 = new Clubs();
        Clubs club6 = new Clubs();
        Clubs club7 = new Clubs();//creating an object of Student
        Clubs club8 = new Clubs();
        Clubs club9 = new Clubs();

        club1.clubCreate("Math homework", "DO YOUR MATH!!!!!", "detail");
        club2.clubCreate("English Homework", "Write a whole essay", "detail");
        club3.clubCreate("CompSci Homework", "Doing it right now :)", "detail");
        club4.clubCreate("Math homework", "DO YOUR MATH!!!!!", "detail");
        club5.clubCreate("English Homework", "Write a whole essay", "detail");
        club6.clubCreate("CompSci Homework", "Doing it right now :)", "detail");
        club7.clubCreate("Math homework", "DO YOUR MATH!!!!!", "detail");
        club8.clubCreate("English Homework", "Write a whole essay", "detail");
        club9.clubCreate("CompSci Homework", "Doing it right now :)", "detail");

        ArrayList<Clubs> list = new ArrayList<>();
        list.add(club1);
        list.add(club2);
        list.add(club3);
        list.add(club4);
        list.add(club5);
        list.add(club6);
        list.add(club7);
        list.add(club8);
        list.add(club9);
        model.addAttribute("list", list);

        return "index"; // returns HTML VIEW (greeting)

    }


}
