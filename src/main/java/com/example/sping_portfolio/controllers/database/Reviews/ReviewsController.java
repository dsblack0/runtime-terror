/* package com.example.sping_portfolio.controllers.database.Reviews;

import com.example.sping_portfolio.controllers.database.Reviews.Reviews;
import com.example.sping_portfolio.controllers.database.Reviews.ReviewsSqlRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;
import java.text.SimpleDateFormat;

import java.util.*;

@Controller
public class ReviewsController implements WebMvcConfigurer {
    @Autowired
    private ReviewsSqlRepository repository;

    @GetMapping("/reviewsPage")
    public String review(Model model){
        List<Reviews> reviews = repository.listAll();
        model.addAttribute("reviews", reviews);
        return "reviewsPage";
    }
    public String reviewAdd(Reviews review) {
        return "reviewsPage";
    }

    @PostMapping("/reviewsPage")
    public String reviewSave(@Valid Reviews review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return  "reviewsPage";
        }
        repository.save(review);
        return "reviewsPage";
    }
} */
