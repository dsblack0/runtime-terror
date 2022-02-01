package com.example.sping_portfolio.controllers;
//import lombok.Getter;
import com.example.sping_portfolio.controllers.samAboutMe.Unit5Invitation;
import com.example.sping_portfolio.rachelCollegeBoardFRQs.*;
import org.apache.tomcat.util.codec.binary.Base64;
import org.hibernate.annotations.Parameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.ParseException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.lang.Math;


@Controller
public class rachelAboutMe {

    @GetMapping("/rachelAbout")

    public String rachelAbout(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                              @RequestParam(name="oldSeq", required=false, defaultValue = "110000011") String oldSeq,
                              @RequestParam(name="segment", required = false, defaultValue = "11") String segment,
                              @RequestParam(name="instsegment", required = false, defaultValue = "1111 1111") String instsegment,
                              @RequestParam(name="ind", required = false, defaultValue = "4") String ind,
                              @RequestParam(name="num1", required = false, defaultValue = "3.0") String num1,
                              @RequestParam(name="num2", required = false, defaultValue = "4.0") String num2,
                              @RequestParam(name="rsvp", required = false, defaultValue = "False") Boolean rsvp,
                              @RequestParam(name="selection", required = false, defaultValue = "0") Integer selection,
                              @RequestParam(name="slength", required = false, defaultValue = "4") Integer slength,
                              @RequestParam(name="startx", required = false, defaultValue = "1") Integer startx,
                              @RequestParam(name="starty", required = false, defaultValue = "1") Integer starty,
                              @RequestParam(name="streakstr", required = false, defaultValue = "test") String streakstr,
                              @RequestParam(name="startingCoins", required = false, defaultValue = "1") Integer startingCoins,
                              @RequestParam(name="maxRounds", required = false, defaultValue = "1") Integer maxRounds,
                              @RequestParam(name="input", required = false, defaultValue = "CCAAAAATTT!") String s,
                              @RequestParam(name="host", required = false, defaultValue = "host") String host,
                              @RequestParam(name="guest", required = false, defaultValue = "guest") String guest,
                              @RequestParam(name="address", required = false, defaultValue = "12345 Address Street") String address,
                              @RequestParam(name="stringA", required = false, defaultValue = "testing") String stringA,
                              @RequestParam(name="stringB", required = false, defaultValue = "testing") String stringB,
                              @RequestParam(name="stringC", required = false, defaultValue = "testing") String stringC,
                              @RequestParam(name="stringD", required = false, defaultValue = "testing") String stringD,
                              @RequestParam(name="stringE", required = false, defaultValue = "testing") String stringE,
                              @RequestParam(name="prefix", required = false, defaultValue = "A") String prefix,
                              @RequestParam(name="digits", required = false, defaultValue = "1") Integer digits,
                              @RequestParam(name="employee0Sold", required = false, defaultValue = "0") Integer employee0Sold,
                              @RequestParam(name="employee1Sold", required = false, defaultValue = "0") Integer employee1Sold,
                              @RequestParam(name="employee2Sold", required = false, defaultValue = "0") Integer employee2Sold,
                              @RequestParam(name="employee3Sold", required = false, defaultValue = "0") Integer employee3Sold,
                              @RequestParam(name="employee4Sold", required = false, defaultValue = "0") Integer employee4Sold,
                              @RequestParam(name="employee5Sold", required = false, defaultValue = "0") Integer employee5Sold,
                              @RequestParam(name="fixedWage", required = false, defaultValue = "10.00") Double fixedWage,
                              @RequestParam(name="perItemWage", required = false, defaultValue = "1.50") Double perItemWage,
                              @RequestParam(name="first", required = false, defaultValue = "first") String first,
                              @RequestParam(name="last", required = false, defaultValue = "last") String last,

                              Model model) throws IOException, InterruptedException, ParseException {
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://numbersapi.p.rapidapi.com/6/21/date?fragment=true&json=true"))
                .header("x-rapidapi-host", "numbersapi.p.rapidapi.com")
                .header("x-rapidapi-key", "9a16ccee4amsh053f92cf2a5be5ep1bc6d6jsna65e7be00215")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        //remove segment
        String newSeq = "";
        int index = oldSeq.indexOf(segment);
        newSeq = oldSeq.substring(0, index) + oldSeq.substring(index+segment.length());

        //insert segment
        String originalSeq = "0011 0011 0011";
        String resultSeq = "";
        int indx = Integer.parseInt(ind);
        resultSeq = originalSeq.substring(0,indx+1) + instsegment + originalSeq.substring(indx+1);

        //math sqrt
        String distance = "";
        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);
        double c = Math.sqrt(a*a + b * b);
        distance = String.valueOf(c);

        var quotes = response.body();
        model.addAttribute("quotes", quotes);
        model.addAttribute("name", name);
        model.addAttribute("newSeq", newSeq);
        model.addAttribute("originalSeq", originalSeq);
        model.addAttribute("resultSeq", resultSeq);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("distance", distance);

        //unit 3.
        Dinner unit3frq1 = new Dinner();
        model.addAttribute("rsvp", unit3frq1.rsvp(rsvp));
        model.addAttribute("selection", unit3frq1.printSelection(selection));
        model.addAttribute("option1", unit3frq1.dinnerOption1(rsvp, selection));
        model.addAttribute("option2", unit3frq1.dinnerOption2(rsvp, selection));
        model.addAttribute("compare", unit3frq1.compare());

        //unit 4
        CoinGame unit4frq2 = new CoinGame(startingCoins, maxRounds);
        model.addAttribute("result", unit4frq2.playGame(startingCoins, maxRounds));
        longestStreak unit4frq1 = new longestStreak(s);
        unit4frq1.findStreak();
        unit4frq1.longestStreakStats();
        model.addAttribute("finalStreak", unit4frq1.longestStreakStats());


        //unit 5
        Invitation unit5frq1 = new Invitation(host, address, guest);
        String invite = unit5frq1.invited();
        //model.addAttribute("invite", invite);
        model.addAttribute("invite", unit5frq1.invited());
        PasswordGenerator unit5frq2 = new PasswordGenerator(digits, prefix);
        unit5frq2.pwCount();
        unit5frq2.pwGen();
        model.addAttribute("passwordFinal", unit5frq2.passwordFinal());

        //unit 6
        //number 1
        wordArray unit6frq1 = new wordArray(stringA, stringB, stringC, stringD, stringE);
        //array1.checkArray();
        unit6frq1.checkSuffix();
        unit6frq1.outputSuffixWords();
        model.addAttribute("wordArray", unit6frq1.generatedSuffixList());
        //number 2
        Payroll unit6frq2 = new Payroll(employee0Sold, employee1Sold, employee2Sold, employee3Sold, employee4Sold, employee5Sold);
        unit6frq2.removeMinMax();
        unit6frq2.computeWages(fixedWage, perItemWage);
        model.addAttribute("generatedWage", unit6frq2.generatedWage());

        //unit 7
        UserName unit7frq1 = new UserName(first, last);
        String[] used = {"smithj", "jsmith"};
        unit7frq1.setAvailableUserNames(used);
        unit7frq1.generatedNames();
        model.addAttribute("generatedUserNames", unit7frq1.generatedNames());

        //api
        var data = new ObjectMapper().readValue(response.body(), HashMap.class);
        model.addAttribute("data", data);
        model.addAttribute("text", data.get("text"));
        model.addAttribute("year", data.get("year"));
        model.addAttribute("number", data.get("number"));
        model.addAttribute("found", data.get("found"));
        model.addAttribute("type", data.get("date"));
        model.addAttribute("name", name);

        return "Pages/aboutMePages/rachelAbout";

    }
}