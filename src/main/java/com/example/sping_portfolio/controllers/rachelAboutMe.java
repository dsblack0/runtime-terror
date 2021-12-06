package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class rachelAboutMe {
    @GetMapping("/rachelAbout")
    public String rachelAbout() { return "Pages/aboutMePages/rachelAbout";}
}
