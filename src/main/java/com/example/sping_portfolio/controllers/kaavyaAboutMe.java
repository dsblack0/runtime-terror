package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.kaavyaCollegeBoardFRQs.*;
import com.example.sping_portfolio.kaavyaCollegeBoardFRQs.FRQ8.ExperimentalFarm;
import com.example.sping_portfolio.kaavyaCollegeBoardFRQs.FRQ8.Plot;
import com.example.sping_portfolio.kaavyaCollegeBoardFRQs.FRQ9.*;
import com.example.sping_portfolio.kaavyaCollegeBoardFRQs.LightSequence;
import jdk.jfr.Experimental;
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
                              @RequestParam(name="hostName", required = false, defaultValue = "Host") String hostName,
                              @RequestParam(name="address", required = false, defaultValue = "1234 Walnut Street") String address,
                              @RequestParam(name="attendee", required = false, defaultValue = "Cheryl") String attendee,
                              @RequestParam(name="prefix", required = false, defaultValue = "A") String prefix,
                              @RequestParam(name="digits", required = false, defaultValue = "4") int digits,
                              @RequestParam(name="fixedWage", required = false, defaultValue = "10.0")double fixedWage,
                              @RequestParam(name="perItemWage", required = false, defaultValue = "1.5")double perItemWage,
                              @RequestParam(name="itemsSold", required = false, defaultValue = "1")int[] itemsSold,
                              @RequestParam(name="firstName", required = false, defaultValue = "john")String firstName,
                              @RequestParam(name="lastName", required = false, defaultValue = "smith")String lastName,
                              @RequestParam(name="cropType", required = false, defaultValue = "beans")String cropType,
                              @RequestParam(name="rowNum", required = false, defaultValue = "2")int rowNum,
                              @RequestParam(name="title", required = false, defaultValue = "The Wonderful Wizard of Oz")String title,
                              @RequestParam(name="author", required = false, defaultValue = "L. Frank Baum")String author,
                              @RequestParam(name="illustrator", required = false, defaultValue = "")String illustrator,
                              @RequestParam(name="cost", required = false, defaultValue = "2")double cost,
                              @RequestParam(name="species", required = false, defaultValue = "Tiger")String species,
                              @RequestParam(name="animalName", required = false, defaultValue = "Tigger")String animalName,
                              @RequestParam(name="carnivore", required = false, defaultValue = "carnivore")String carnivore,
                              @RequestParam(name="trunkLen", required = false, defaultValue = "4")double trunkLen,
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

        InvitationFRQ5 frq5_1;
        if (hostName.equals("Host")){
            frq5_1 = new InvitationFRQ5(address);
        }
        else {
            frq5_1 = new InvitationFRQ5(hostName, address);
        }
        model.addAttribute("message", frq5_1.invite(attendee));
        PasswordGeneratorFRQ5 frq5_2;
        if (prefix.equals("A")){
            frq5_2 = new PasswordGeneratorFRQ5(digits);
        }
        else {
            frq5_2 = new PasswordGeneratorFRQ5(digits, prefix);
        }
        model.addAttribute("pw", frq5_2.pwGen());
        model.addAttribute("count", frq5_2.pwCount());

        PayrollFRQ6 frq6_2 = new PayrollFRQ6();
        model.addAttribute("wages", frq6_2.computeWages(fixedWage, perItemWage, itemsSold));

        UserNameFRQ7 frq7 = new UserNameFRQ7();
        frq7.userNames(firstName, lastName);
        model.addAttribute("usernames",frq7.setAvailableUserNames());

        ExperimentalFarm farm = new ExperimentalFarm();
        model.addAttribute("highestyield", farm.getHighestYield(cropType));
        model.addAttribute("samecrop", farm.sameCrop(rowNum));

        PictureBook aBook = new PictureBook(title, author, illustrator);
        BookListing bookListing = new BookListing(aBook, cost);
        model.addAttribute("booklisting", bookListing.printDescription());

        Animal animal = null;
        if (species.equals("elephant")){
            animal = new Elephant(animalName, trunkLen);
        }
        else if (!carnivore.equals("carnivore")){
            animal = new Herbivore(species, animalName);
        }
        else {
            animal = new Animal("carnivore", species, animalName);
        }

        model.addAttribute("animalinfo", animal.toString());

        return "Pages/aboutMePages/kaavyaAbout"; }
}
