package com.example.sping_portfolio.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.Serializable;
import java.util.ArrayList;

public class reviewsPage implements Serializable {
    String clubName;
    String reviewText;
    String reviewerName;

    public void reviewCreate(String c, String rT, String rN) {
        clubName = c;
        reviewText = rT;
        reviewerName = rN;
    }

    public String getClubName() {
        return clubName;
    }

    public String getReviewText() {
        return reviewText;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public ArrayList<reviewsPage> reviewsList() {
        reviewsPage review1 = new reviewsPage();//creating an object of Student
        review1.reviewCreate("Club Name", "review text", "");

        ArrayList<reviewsPage> reviews = new ArrayList<>();
        reviews.add(review1);

        return (reviews);
    }


    public static void main(String[] args) {
        //Creating an object or instance

    }
}
