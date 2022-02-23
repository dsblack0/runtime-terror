package com.example.sping_portfolio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.*;

import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class clubPageController {
    @GetMapping("/newFile")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String login(@RequestParam(name="query", required=false) String firstname, Model model) {
        return "indiClubPage/newFile"; // returns HTML VIEW (greeting)
    }

}
