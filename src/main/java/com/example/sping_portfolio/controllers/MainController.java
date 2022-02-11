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
    public String reviewsPage(@RequestParam(name="clubName", required = false, defaultValue = "Robotics") String clubName,
                              @RequestParam(name="q1",required = false, defaultValue = "a random answer to question 1") String q1,
                              @RequestParam(name="q2", required = false, defaultValue = "additional interesting information") String q2,
                              @RequestParam(name="reviewerName", required = false, defaultValue = "anonymous") String reviewerName, Model model) {

        reviewsPage review1 = new reviewsPage();
        review1.reviewCreate(clubName, q1, q2, reviewerName);
        ArrayList<ArrayList<String>> list1 = review1.reviewslist();
        ArrayList<String> info = list1.get(0);
        Object[] information = info.toArray();

        model.addAttribute("information", information);

        return "reviewsPage";
    }
}

