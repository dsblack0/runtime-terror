package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.ParseException;
import java.lang.Math;

class LightSequence
{
    String resultSeq;

    public LightSequence(String seq)
    {
        resultSeq = seq;
    }

    public String insertSegment(String segment, int ind)
    {
        resultSeq = resultSeq.substring(0,ind+1) + segment + resultSeq.substring(ind+1);
        return resultSeq;
    }

    public void changeSequence(String seq)
    {
        resultSeq = seq;
    }

    public void display()
    {
        System.out.println(resultSeq);
    }

    public String getSeq() {
        return resultSeq;
    }

    public static String changeSegment(String oldSeq, String segment)
    {
        int index = oldSeq.indexOf(segment);
        String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index+segment.length());
        System.out.println("changedSegment = " + newSeq);
        return newSeq;
    }

    public static double mathSqrt(double a, double b)
    {
        double c = Math.sqrt(a*a + b * b);
        return c;
    }

    public static void main(String []args)
    {
        String newSeq;
        LightSequence gradShow = new LightSequence("0101 0101 0101");
        gradShow.display();
        gradShow.changeSequence("0011 0011 0011");
        gradShow.display();
        gradShow.insertSegment("1111 1111", 4);
        gradShow.display();
        newSeq = changeSegment("110000011", "11");
        newSeq = changeSegment("0000011", "11");
        newSeq = changeSegment("1100000111","00");
        mathSqrt(5.0,12.0);
    }
}


@Controller
public class samAboutMe {
    @GetMapping("/samAbout")
    public String samAbout(@RequestParam(name="name", required=false, defaultValue = "Human") String name,
                           @RequestParam(name="oldSeq", required=false, defaultValue = "110000011") String oldSeq,
                           @RequestParam(name="segment", required = false, defaultValue = "11") String segment,
                           @RequestParam(name="instsegment", required = false, defaultValue = "1111 1111") String instsegment,
                           @RequestParam(name="ind", required = false, defaultValue = "4") String ind,
                           @RequestParam(name="num1", required = false, defaultValue = "3.0") String num1,
                           @RequestParam(name="num2", required = false, defaultValue = "4.0") String num2,
                           Model model)
            throws IOException, InterruptedException, ParseException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://motivational-quotes1.p.rapidapi.com/motivation"))
                .header("content-type", "application/json")
                .header("x-rapidapi-host", "motivational-quotes1.p.rapidapi.com")
                .header("x-rapidapi-key", "e25c6452c9msh8ae4033709e74bbp16b06cjsnb8c921a2f043")
                .method("POST", HttpRequest.BodyPublishers.ofString("{\"key1\":\"value\",\"key2\":\"value\"}"))
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

        return "/Pages/aboutMePages/samAbout";
    }


}
