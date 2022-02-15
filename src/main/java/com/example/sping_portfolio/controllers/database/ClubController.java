//package com.example.sping_portfolio.controllers.database;
//import com.example.sping_portfolio.controllers.database.Club;
//import com.example.sping_portfolio.controllers.database.ClubSqlRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.http.*;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import javax.validation.Valid;
//import java.text.SimpleDateFormat;
//
//import java.util.*;
//
//@Controller
//public class ClubController implements WebMvcConfigurer {
//    @Autowired
//    private ClubSqlRepository repository;
//
//    @GetMapping("/database")
//    public String club(Model model){
//        List<Club> list = repository.listAll();
//        model.addAttribute("list", "list");
//        return "/database";
//    }
//
//    @GetMapping("/database/clubcreate")
//    public String clubAdd(Club club) {
//        return "/database/clubcreate";
//    }
//    //ask which one of the GetMappings are actually relevant to the base code
//}
