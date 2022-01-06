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
    String details;
    String date;
    String category;

    public void clubCreate(String t, String d, String e, String dt, String c) {
        title = t;
        description = d;
        details = e;
        date = dt;
        category = c;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public String getDetails() {return details;}

    public String getDate() {return date;}

    public String getCategory() {return category;}

    public ArrayList<Clubs> clubslist(){
        Clubs club1 = new Clubs();//creating an object of Student
        Clubs club2 = new Clubs();
        club1.clubCreate( "Math homework", "DO YOUR MATH!!!!!", "More info on the assignment" , "2022-06-01", "Math");
        club2.clubCreate( "English Homework", "Write a whole essay boyyyyy", "More info on the assignment", "2022-06-01", "English");

        ArrayList<Clubs> list = new ArrayList<>();
        list.add(club1);
        list.add(club2);

        return (list);
    }


    public static void main(String[] args) {
        //Creating an object or instance

    }


    @GetMapping("/index")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String Index(@RequestParam(name="title", required=false, defaultValue="Task title") String title,
                        @RequestParam(name="description", required=false, defaultValue="Task description") String description,
                        @RequestParam(name="details", required = false, defaultValue = "Task details") String details,
                        @RequestParam(name="date", required = false, defaultValue = "0000-00-00") String date,
                        @RequestParam(name="category", required = false, defaultValue = "none") String category,
                        Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        //model.addAttribute("list", taskslist());

        Clubs club10 = new Clubs();
        club10.clubCreate(title, description, details, date, category);

        Clubs clubs1 = new Clubs();//creating an object of Student
        Clubs clubs2 = new Clubs();
        Clubs clubs3 = new Clubs();
        Clubs clubs4 = new Clubs();//creating an object of Student
        Clubs clubs5 = new Clubs();
        Clubs clubs6 = new Clubs();
        Clubs clubs7 = new Clubs();//creating an object of Student
        Clubs clubs8 = new Clubs();
        Clubs clubs9 = new Clubs();

        clubs1.clubCreate("Math homework", "DO YOUR MATH!!!!!", "More info on the assignment", "2022-06-01", "Math");
        clubs2.clubCreate("English Homework", "Write a whole essay", "More info on the assignment", "2022-06-01", "English");
        clubs3.clubCreate("CompSci Homework", "Doing it right now :)", "More info on the assignment", "2022-06-01", "CS");
        clubs1.clubCreate("Math homework", "DO YOUR MATH!!!!!", "More info on the assignment", "2022-06-01", "Math");
        clubs2.clubCreate("English Homework", "Write a whole essay", "More info on the assignment", "2022-06-01", "English");
        clubs3.clubCreate("CompSci Homework", "Doing it right now :)", "More info on the assignment", "2022-06-01", "CS");
        clubs1.clubCreate("Math homework", "DO YOUR MATH!!!!!", "More info on the assignment", "2022-06-01", "Math");
        clubs2.clubCreate("English Homework", "Write a whole essay", "More info on the assignment", "2022-06-01", "English");
        clubs3.clubCreate("CompSci Homework", "Doing it right now :)", "More info on the assignment", "2022-06-01", "CS");


        ArrayList<Clubs> list = new ArrayList<>();
        list.add(clubs1);
        list.add(clubs2);
        list.add(clubs3);
        list.add(clubs4);
        list.add(clubs5);
        list.add(clubs6);
        list.add(clubs7);
        list.add(clubs8);
        list.add(clubs9);
        list.add(club10);
        model.addAttribute("list", list);

        return "index"; // returns HTML VIEW (greeting)

    }


}
