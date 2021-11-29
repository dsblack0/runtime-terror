package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/adritaAbout")
    public String adritaAbout() {
        return "/Pages/aboutMePages/adritaAbout";
    }

    @GetMapping("/samAbout")
    public String samAbout() {
        return "/Pages/aboutMePages/samAbout";
    }

    @GetMapping("/rachelAbout")
    public String rachelAbout() { return "Pages/aboutMePages/rachelAbout";}

    @GetMapping("/samiAbout")
    public String samiAbout() { return "Pages/aboutMePages/samiAbout"; }

    @GetMapping("/kaavyaAbout")
    public String kaavyaAbout() { return "Pages/aboutMePages/kaavyaAbout"; }

}
