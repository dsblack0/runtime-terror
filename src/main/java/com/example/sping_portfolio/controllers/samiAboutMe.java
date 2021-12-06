package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class samiAboutMe {
    @GetMapping("/samiAbout")
    public String samiAbout() { return "Pages/aboutMePages/samiAbout"; }
}
