package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class kaavyaAboutMe {
    @GetMapping("/kaavyaAbout")
    public String kaavyaAbout() { return "Pages/aboutMePages/kaavyaAbout"; }
}
