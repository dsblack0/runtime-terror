package com.example.sping_portfolio.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MainController {
    @GetMapping ("/teamAbout")
    public String teamAbout(@RequestParam(name="inputx", required = false, defaultValue = "0") String inputx,
                            @RequestParam(name="inputy", required = false, defaultValue = "0") String inputy,
                            @RequestParam(name="length", required = false, defaultValue = "4") String length,
                            Model model) {
        int inpx = Integer.parseInt(inputx);
        int inpy = Integer.parseInt(inputy);
        int slength = Integer.parseInt(length);

        model.addAttribute("slength", slength);
        model.addAttribute("inpx", inpx);
        model.addAttribute("inpy", inpy);

        return "Pages/aboutMePages/teamAbout";
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

        club1.clubCreate("Speech & Debate", "Participate in tournaments.", "Mondays & Wednesdays");
        club2.clubCreate("Speech & Debate", "Participate in tournaments.", "Mondays & Wednesdays");
        club3.clubCreate("Speech & Debate", "Participate in tournaments.", "Mondays & Wednesdays");
        club4.clubCreate("Speech & Debate", "Participate in tournaments.", "Mondays & Wednesdays");
        club5.clubCreate("Speech & Debate", "Participate in tournaments.", "Mondays & Wednesdays");
        club6.clubCreate("Speech & Debate", "Participate in tournaments.", "Mondays & Wednesdays");
        club7.clubCreate("Speech & Debate", "Participate in tournaments.", "Mondays & Wednesdays");
        club8.clubCreate("Speech & Debate", "Participate in tournaments.", "Mondays & Wednesdays");

        ArrayList<Clubs> list = new ArrayList<>();
        list.add(club1);
        list.add(club2);
        list.add(club3);
        list.add(club4);
        list.add(club5);
        list.add(club6);
        list.add(club7);
        list.add(club8);
        model.addAttribute("list", list);

        return "index"; // returns HTML VIEW (greeting)

    }
}

