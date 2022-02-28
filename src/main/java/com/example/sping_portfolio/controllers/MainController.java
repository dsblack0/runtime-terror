package com.example.sping_portfolio.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Objects;
/**
@Controller
public class MainController {
    //Team About Us
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
    }**/
  /**
    //Club Reviews
    @GetMapping ("/reviewsPage")
    public String reviewsPage(@RequestParam(name="clubName", required = false, defaultValue = "") String clubName,
                              @RequestParam(name="reviewText",required = false, defaultValue = "") String reviewText,
                              @RequestParam(name="reviewerName", required = false, defaultValue = "") String reviewerName, Model model) {

        reviewsPage review5 = new reviewsPage();
        review5.reviewCreate(clubName, reviewText, reviewerName);

        reviewsPage review1 = new reviewsPage();
        review1.reviewCreate("Robotics", "This is some random default review text that is ment mainly to just test this out because I don't know what to set", "");
        reviewsPage review2 = new reviewsPage();
        review2.reviewCreate("Speech & Debate", "This is some random default review text that is ment mainly to just test this out because I don't know what to set", "a person");
        reviewsPage review3 = new reviewsPage();
        review3.reviewCreate("Math Club", "This is some random default review text that is ment mainly to just test this out because I don't know what to set", "");
        reviewsPage review4 = new reviewsPage();
        review4.reviewCreate("Key Club", "This is some random default review text that is ment mainly to just test this out because I don't know what to set", "");

        ArrayList<reviewsPage> reviews = new ArrayList<>();
        reviews.add(review1);
        reviews.add(review2);
        reviews.add(review3);
        reviews.add(review4);

        // If not club name is inputted, the review won't be created
        if(!Objects.equals(clubName, "")) {
            reviews.add(review5);
        }

        model.addAttribute("reviews", reviews);

        return "reviewsPage";**/
  
    /**@GetMapping("/")
    // Home Page
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

**/