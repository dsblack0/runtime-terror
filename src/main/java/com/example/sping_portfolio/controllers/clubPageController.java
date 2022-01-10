package com.example.sping_portfolio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class clubPageController {
    @GetMapping("/individualClub")
    public String individualClub() {
        return "individualClub";
    }
}
