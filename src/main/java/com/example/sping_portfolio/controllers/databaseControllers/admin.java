package com.example.sping_portfolio.controllers.databaseControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class admin {
    @GetMapping("/admin")
    public String admin(@RequestParam(name = "clubname", required = false, defaultValue = "CLUBNAME") String clubname,
                        @RequestParam(name = "aboutclub", required = false, defaultValue = "ABOUTCLUB") String aboutclub,
                        @RequestParam(name = "clublinks", required = false, defaultValue = "CLUBLINKS") String clublinks
                        )
            {
        return "databasePages/admin"; }
}
