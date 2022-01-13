package com.example.sping_portfolio.controllers.samAboutMe;
//Jan 13, 2022, Rachel commented line 3 and 4 (import org.json.JSON...) because symbol couldn't be resolved
//import org.json.JSONException;
//import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.ParseException;

import java.util.Map;
import java.util.Objects;

@Controller
public class samAboutMe {
   /* Unit5Invitation string_ops = null;
    public JSONObject getBody() throws JSONException {
        JSONObject body = new JSONObject();
        body.put("title", string_ops.getInvite());
        body.put("data", string_ops.toString());

        return body;
    }
    public void stringEvent(JSONObject jo) throws JSONException {
        String action = (String) jo.get("action");
        switch (action) {
            case "invite":  // new sequence
                String hostName = (String) jo.get("hostName");
                String inviteName = (String) jo.get("inviteName");
                String address = (String) jo.get("address");
                this.string_ops = new Unit5Invitation(hostName, address, inviteName);
                this.string_ops.getInvite();
                break;
            default:
        }
    } */

    @GetMapping("/samAbout")
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
                           @RequestParam(name="Coins", required = false, defaultValue = "10") String Coins,
                           @RequestParam(name="Rounds", required = false, defaultValue = "5") String Rounds,
                           @RequestParam(name="originalString", required = false, defaultValue = "CCAAAAATTT!") String originalString,
                           @RequestParam(name="hostName", required = false, defaultValue = "Sam") String hostName,
                           @RequestParam(name="inviteName", required = false, defaultValue = "Sarah") String inviteName,
                           @RequestParam(name="address", required = false, defaultValue = "1234 Random St") String address,
                           @RequestParam(name="prefix", required = false, defaultValue = "A") String prefix,
                           @RequestParam(name="length", required = false, defaultValue = "6") String length,Model model)
            throws IOException, InterruptedException, ParseException {

        //api
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
        Unit2LightSequence gradshow = new Unit2LightSequence(name);
        String newSeq = Unit2LightSequence.changeSegment(oldSeq, segment);
        String resultSeq = gradshow.insertSegment(oldSeq, instsegment, indx);
        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);
        double c = Unit2LightSequence.mathSqrt(a, b);
        String distance = String.valueOf(c);

        //Unit 3 FRQ
        int selection = Integer.parseInt(foodselection);
        boolean rsvp = Boolean.parseBoolean(rsvpattendance);
        int selection2 = Integer.parseInt(foodselection2);
        boolean rsvp2 = Boolean.parseBoolean(rsvpattendance2);
        Unit3Party person = new Unit3Party(name);
        String option1 = person.Information(rsvp, selection);
        String option2 = person.Information(rsvp2, selection2);
        String compare = "";
        if (option1.equals(option2)) {
            compare = "true";
        } else {
            compare = "false";
        }

        //Unit 4 FRQ
        int startingCoins = Integer.parseInt(Coins);
        int maxRounds = Integer.parseInt(Rounds);
        Unit4CoinGame game = new Unit4CoinGame(startingCoins, maxRounds);
        String p1Move = String.valueOf(game.getPlayer1Move(maxRounds));
        String p2Move = String.valueOf(game.getPlayer2Move(maxRounds));
        String gameResult = game.playGame();

        Unit4Streak streak = new Unit4Streak("streak1");
        char streakChar = streak.longestStreak(originalString);
        int streakLength = streak.displayLength();

        //Unit 5
        Unit5Invitation invite1 = new Unit5Invitation(hostName, address, inviteName);
        String invite = invite1.getInvite();

        Unit5PwGenerator password = new Unit5PwGenerator(Integer.parseInt(length), prefix);
        String pwd = password.pwGen();

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
        model.addAttribute("p1Move", p1Move);
        model.addAttribute("p2Move", p2Move);
        model.addAttribute("gameResult", gameResult);
        model.addAttribute("streakChar", streakChar);
        model.addAttribute("streakLength", streakLength);
      //  model.addAttribute("object", string_ops);
        model.addAttribute("pwd", pwd);
        model.addAttribute("invite", invite);

        return "Pages/aboutMePages/samAbout";
    }
   /* @RequestMapping(value = "/api/Pages.aboutMePages/samAboutMe/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> stringsNew(RequestEntity<Object> request) throws JSONException {
        // extract json from RequestEntity
        JSONObject jo = new JSONObject((Map) Objects.requireNonNull(request.getBody()));

        // process string sequence action(s)
        stringEvent(jo);

        // create JSON object of string sequence resulting database and metadata
        JSONObject body = this.getBody();

        // send ResponseEntity body and status message
        return new ResponseEntity<>(body, HttpStatus.OK);
    } */


}
