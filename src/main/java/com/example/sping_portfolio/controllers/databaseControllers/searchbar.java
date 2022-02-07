
package com.example.sping_portfolio.controllers.databaseControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.*;

import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class searchbar {
    @GetMapping("/searchbar")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String login(@RequestParam(name="query", required=false) String firstname, Model model) {
        return "databasePages/searchbar"; // returns HTML VIEW (greeting)
    }

}