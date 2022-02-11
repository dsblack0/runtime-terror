package com.example.sping_portfolio.controllers;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class reviewsPage {
        static String clubName;
        static String q1;
        static String q2;
        static String reviewerName;
        static ArrayList<String> review = new ArrayList<>();
        static ArrayList<ArrayList<String>> list = new ArrayList<>();

        public ArrayList<String> reviewCreate(String cN, String q, String qq, String rN) {
            clubName = cN;
            q1 = q;
            q2 = qq;
            reviewerName = rN;

            review.add(clubName);
            review.add(q1);
            review.add(q2);
            review.add(reviewerName);

            return review;
        }

        public ArrayList<ArrayList<String>> reviewslist() {
            list.add(review);

            return list;
        }

        public static void main(String[] args) {
            reviewsPage review2 = new reviewsPage();
            review2.reviewCreate("club name", "answer1", "answer2", "reviewer name");
            ArrayList<ArrayList<String>> list1 = review2.reviewslist();
            System.out.println(list1.get(0));
        }
    }
