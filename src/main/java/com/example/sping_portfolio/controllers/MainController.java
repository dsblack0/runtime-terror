package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/adritaAbout")
    public String adritaAbout() {
        return "/aboutMePages/adritaAbout";
    }

    @GetMapping("/samAbout")
    public String samAbout() {
        return "/aboutMePages/samAbout";
    }

}
