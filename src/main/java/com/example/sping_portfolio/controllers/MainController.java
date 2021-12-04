package com.example.sping_portfolio.controllers;

import jdk.dynalink.beans.StaticClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.StringJoiner;

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
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("name", name); // MODEL is passed to html
        return "greetRachel"; // returns HTML VIEW (greeting)
    }



    @GetMapping("/samiAbout")
    public String samiAbout() { return "Pages/aboutMePages/samiAbout"; }

    @GetMapping("/kaavyaAbout")
    public String kaavyaAbout() { return "Pages/aboutMePages/kaavyaAbout"; }

}
