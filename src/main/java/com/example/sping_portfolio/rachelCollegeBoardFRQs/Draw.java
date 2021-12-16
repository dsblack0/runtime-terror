package com.example.sping_portfolio.rachelCollegeBoardFRQs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Draw {

    @GetMapping("/draw")   // GET request
    public String draw() {
        return "rachelCollegeBoardFRQs/Draw";
    }


}

