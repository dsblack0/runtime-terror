package com.example.sping_portfolio.controllers.samiCollegeBoard;


import org.apache.coyote.Request;
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

//Unit2 FRQ
class LightSequence {
        String resultSeq;

        public LightSequence(String seq) {

                resultSeq = seq;
        }

        public String insertSegment(String oldSeq, String segment, int ind) {
                resultSeq = oldSeq.substring(0, ind + 1) + segment + oldSeq.substring(ind + 1);
                return resultSeq;
        }

        public void changeSequence(String seq) {

                resultSeq = seq;
        }

        public void display() {
                System.out.println(resultSeq);
        }

        public String getSeq() {

                return resultSeq;
        }

        public static String changeSegment(String oldSeq, String segment) {
                int index = oldSeq.indexOf(segment);
                String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index + segment.length());
                System.out.println("changedSegment = " + newSeq);
                return newSeq;
        }

        public static double mathSqrt(double a, double b) {
                double c = Math.sqrt(a * a + b * b);
                return c;
        }
}

//Unit3 FRQ
class Party {
        boolean rsvp;
        int selection;
        String option1;
        String option2;
        String attendance;
        String food;
        String person;
        String compare;


        public Party(String name) {
                person = name;
        }

        public String Attendance(boolean rsvp) {
                if (rsvp) {
                        attendance = "attending";
                        return attendance;
                } else {
                        attendance = "not attending";
                        return attendance;
                }
        }

        public String Food(int selection) {
                if (selection == 1) {
                        food = "beef";
                        return food;
                } else if (selection == 2) {
                        food = "chicken";
                        return food;
                } else if (selection == 3) {
                        food = "pasta";
                        return food;
                } else {
                        food = "fish";
                        return food;
                }
        }

        public String Information(boolean rsvp, int selection) {
                option2 = "Sorry you can't make it.";
                if (!rsvp) {
                        option1 = "Sorry you can't make it.";
                } else {
                        option1 = "Thanks for attending. You will be served ";
                        if (selection == 1) {
                                option1 += "beef.";
                        } else if (selection == 2) {
                                option1 += "chicken.";
                        } else if (selection == 3) {
                                option1 += "pasta.";
                        } else {
                                option1 += "fish.";
                        }
                }
                if (option1.equals(option2)) {
                        compare = "true";
                } else {
                        compare = "false";
                }
                return option1;
        }
        public String compare() {
                return compare;
        }
}

@Controller
public class samiAboutMe {
        @GetMapping("/samiAbout")
        public String samAbout(@RequestParam(name="name", required=false, defaultValue = "Human") String name,
                               @RequestParam(name="oldSeq", required=false, defaultValue = "110000011") String oldSeq,
                               @RequestParam(name="segment", required = false, defaultValue = "11") String segment,
                               @RequestParam(name="instsegment", required = false, defaultValue = "1111 1111") String instsegment,
                               @RequestParam(name="ind", required = false, defaultValue = "4") String ind,
                               @RequestParam(name="num1", required = false, defaultValue = "3.0") String num1,
                               @RequestParam(name="num2", required = false, defaultValue = "4.0") String num2,
                               @RequestParam(name="rsvpattendance", required = false, defaultValue = "false") String rsvpattendance,
                               @RequestParam(name="foodselection", required = false, defaultValue = "5") String foodselection,
                               @RequestParam(name="rsvpattendance2", required = false, defaultValue = "false") String rsvpattendance2,
                               @RequestParam(name="foodselection2", required = false, defaultValue = "5") String foodselection2,
                               @RequestParam(name="startingCoins", required = false, defaultValue = "0") String startingCoins,
                               @RequestParam(name="maxRounds", required = false, defaultValue = "0") String maxRounds,
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

                //Unit 2 FRQ
                int indx = Integer.parseInt(ind);
                LightSequence gradshow = new LightSequence(name);
                String newSeq = LightSequence.changeSegment(oldSeq, segment);
                String resultSeq = gradshow.insertSegment(oldSeq, instsegment, indx);
                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(num2);
                double c = LightSequence.mathSqrt(a, b);
                String distance = String.valueOf(c);

                //Unit 3 FRQ
                int selection = Integer.parseInt(foodselection);
                boolean rsvp = Boolean.parseBoolean(rsvpattendance);
                int selection2 = Integer.parseInt(foodselection2);
                boolean rsvp2 = Boolean.parseBoolean(rsvpattendance2);
                Party person = new Party(name);
                String option1 = person.Information(rsvp, selection);
                String option2 = person.Information(rsvp2, selection2);
                String compare = "";
                if (option1.equals(option2)) {
                        compare = "true";
                } else {
                        compare = "false";
                }


                var quotes = response.body();
                model.addAttribute("quotes", quotes);
                model.addAttribute("name", name);
                model.addAttribute("newSeq", newSeq);
                model.addAttribute("oldSeq", oldSeq);
                model.addAttribute("resultSeq", resultSeq);
                model.addAttribute("num1", num1);
                model.addAttribute("num2", num2);
                model.addAttribute("distance", distance);
                model.addAttribute("option1", option1);
                model.addAttribute("compare", compare);
                model.addAttribute("option2", option2);


                //FRQ 4


                int y = Integer.parseInt(startingCoins);
                int x = Integer.parseInt(maxRounds);
                Coingame frq4 = new Coingame(y, x);
                String result = "";
                result = frq4.playGame(y, x);
                model.addAttribute("result", result);

                return "Pages/aboutMePages/samiAbout";
        }


}
