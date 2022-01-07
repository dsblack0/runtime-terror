package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.kaavyaCollegeBoardFRQs.CoinCountFRQ4;
import com.example.sping_portfolio.kaavyaCollegeBoardFRQs.DinnerFRQ3;
import com.example.sping_portfolio.kaavyaCollegeBoardFRQs.LightSequence;
import com.example.sping_portfolio.kaavyaCollegeBoardFRQs.LongestStreakFRQ4;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class kaavyaAboutMe {
    @GetMapping("/kaavyaAbout")
    public String kaavyaAbout(@RequestParam(name ="seq", required = false, defaultValue = "1100000111") String seq,
                              @RequestParam(name="segment", required = false, defaultValue = "11") String segment,
                              @RequestParam(name="segment2", required = false, defaultValue = "11") String segment2,
                              @RequestParam(name="ind", required = false, defaultValue = "4") int ind,
                              @RequestParam(name="a", required = false, defaultValue = "3.0") double a,
                              @RequestParam(name="b", required = false, defaultValue = "4.0") double b,
                              @RequestParam(name="rsvp", required = false, defaultValue = "no") String rsvp,
                              @RequestParam(name="selection", required = false, defaultValue = "1") int selection,
                              @RequestParam(name="rsvp1", required = false, defaultValue = "no") String rsvp1,
                              @RequestParam(name="selection1", required = false, defaultValue = "1") int selection1,
                              @RequestParam(name="rsvp2", required = false, defaultValue = "no") String rsvp2,
                              @RequestParam(name="selection2", required = false, defaultValue = "1") int selection2,
                              @RequestParam(name="response", required = false, defaultValue = "attending") String response,
                              @RequestParam(name="str", required = false, defaultValue = "CCAAAAATTT!") String str,
                              @RequestParam(name="startingCoins", required = false, defaultValue = "10") int startingCoins,
                              @RequestParam(name="maxRounds", required = false, defaultValue = "5") int maxRounds,
                              Model model) {

        LightSequence frq2 = new LightSequence();
        model.addAttribute("newSeq", frq2.oldToNew(seq, segment));
        model.addAttribute("insertSeq", frq2.insertSegment(segment2, ind));
        model.addAttribute("straightDist", frq2.distance(a, b));

        //Converting "yes" and "no" to true and false for attending
        DinnerFRQ3 frq3_1 = new DinnerFRQ3();
        model.addAttribute("response", frq3_1.printAttending(frq3_1.rsvpBoolean(rsvp)));
        model.addAttribute("selection", frq3_1.printSelection(selection));
        model.addAttribute("option1", frq3_1.dinnerSelection1(frq3_1.rsvpBoolean(rsvp1),selection1));
        model.addAttribute("option2", frq3_1.dinnerSelection2(frq3_1.rsvpBoolean(rsvp2), selection2));
        model.addAttribute("compareOptions",frq3_1.compareOptions());

        LongestStreakFRQ4 frq4_1 = new LongestStreakFRQ4();
        model.addAttribute("output", frq4_1.longestStreak(str));
        CoinCountFRQ4 frq4_2 = new CoinCountFRQ4();
        model.addAttribute("outcome", frq4_2.playGame(startingCoins, maxRounds));

        return "Pages/aboutMePages/kaavyaAbout"; }
}
