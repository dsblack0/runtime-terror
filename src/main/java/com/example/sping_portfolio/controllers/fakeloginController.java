package com.example.sping_portfolio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class fakeloginController {
    @GetMapping("/fakelogin")
    public String fakelogin() {
        return "fakelogin";
    }
}
