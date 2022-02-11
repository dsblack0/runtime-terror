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

    @GetMapping ("/reviewsPage")
    public String reviewsPage(@RequestParam(name="clubName", required = false, defaultValue = "Club Name") String clubName,
                              @RequestParam(name="reviewText",required = false, defaultValue = "review text") String reviewText,
                              @RequestParam(name="reviewerName", required = false, defaultValue = "") String reviewerName, Model model) {

        reviewsPage review1 = new reviewsPage();
        review1.reviewCreate(clubName, reviewText, reviewerName);
        ArrayList<reviewsPage> reviews = new ArrayList<>();
        reviews.add(review1);

        model.addAttribute("reviews", reviews);

        return "reviewsPage";
    }
}

