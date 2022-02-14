package com.example.sping_portfolio.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Objects;

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
        if(!Objects.equals(clubName, "")) {
            reviews.add(review5);
        }

        model.addAttribute("reviews", reviews);

        return "reviewsPage";
    }
}

