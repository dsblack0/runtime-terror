package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.lang.Math;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.ParseException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

class LightSequence
{
    private String resultSeq;

    public LightSequence(String seq)
    {
        resultSeq = seq;
        System.out.println("LightSequence");
    }

    public String insertSegment(String segment, int ind)
    {
        resultSeq = resultSeq.substring(0,ind+1) + segment + resultSeq.substring(ind+1);
        return resultSeq;
    }

    public void changeSequence(String seq)
    {
        resultSeq = seq;
        System.out.println("changeSequence");
    }

    public String display()
    {
        return resultSeq;
    }

/*    public static String questionE(String oldSeq, String oldSegment, String newSegment)
    {
        String newSeq = oldSeq.replaceFirst(oldSegment, newSegment);
        System.out.println(newSeq);
        return newSeq;
    }
*/

/*    public static void questionF(double a, double b)
    {
        double c = Math.sqrt(a*a + b * b);
        System.out.println(c);
    }
 */

    public static void main(String []args)
    {
        String newSeq;
        com.example.sping_portfolio.rachelCollegeBoardFRQs.LightSequence gradShow = new com.example.sping_portfolio.rachelCollegeBoardFRQs.LightSequence("0101 0101 0101");
        gradShow.display();
        gradShow.changeSequence("0011 0011 0011");
        gradShow.insertSegment("1111 1111", 4);
        gradShow.display();
//        newSeq = questionE("110000011", "11","");
//        newSeq = questionE("0000011", "11","");
//        newSeq = questionE("1100000111","00","");
//        questionF(10.4,21.3);
    }
}

@Controller
public class rachelAboutMe {
    @GetMapping("/rachelAbout")
    public String rachelAbout(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) throws IOException, InterruptedException, ParseException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://numbersapi.p.rapidapi.com/6/21/date?fragment=true&json=true"))
                .header("x-rapidapi-host", "numbersapi.p.rapidapi.com")
                .header("x-rapidapi-key", "9a16ccee4amsh053f92cf2a5be5ep1bc6d6jsna65e7be00215")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        var data = new ObjectMapper().readValue(response.body(), HashMap.class);
        model.addAttribute("data", data);
        model.addAttribute("text", data.get("text"));
        model.addAttribute("year", data.get("year"));
        model.addAttribute("number", data.get("number"));
        model.addAttribute("found", data.get("found"));
        model.addAttribute("type", data.get("date"));
        model.addAttribute("name", name);


        return "Pages/aboutMePages/rachelAbout";

        //LightSequence light = new LightSequence(name);
        //name = light.display();
        //model.addAttribute("name", name);

        //   public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
 //       model.addAttribute("name", name); // MODEL is passed to html
 //       return "Pages/aboutMePages/rachelAbout"; // returns HTML VIEW (greeting)


    }






}