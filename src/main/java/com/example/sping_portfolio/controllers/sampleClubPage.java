package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sampleClubPage {
    @GetMapping("/sampleClubPage")
    public String sampleClubPage() {
        return "sampleClubPage"; }
}

