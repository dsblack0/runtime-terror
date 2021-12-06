package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class adritaAboutMe {
    @GetMapping("/adritaAbout")
    public String adritaAbout() {

        return "/Pages/aboutMePages/adritaAbout";
    }
}
