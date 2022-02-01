package com.example.sping_portfolio.controllers.samAboutMe;

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

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

@Controller
public class samAboutMe {
    /*Unit5PwGenerator unit5 = null;
    public JSONObject getBody() throws JSONException {
        JSONObject body = new JSONObject();
        body.put("password", unit5.pwGen());
        body.put("passCount", unit5.pwCount());

        return body;
    }
    public void stringEvent(JSONObject jo) throws JSONException {
        String action = (String) jo.get("action");
        switch (action) {
            case "password":  // get password
                String prefix = (String) jo.get("prefix");
                int length = Integer.parseInt((String) jo.get("length"));
                this.unit5 = new Unit5PwGenerator(length, prefix);
                this.unit5.pwGen();
                break;

            case "count": //get password count
                this.unit5.pwCount();
                break;

            default:
        }
    }*/

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
                           @RequestParam(name="prefix", required = false, defaultValue = "A") String prefix,
                           @RequestParam(name="length", required = false, defaultValue = "6") String length,
                           @RequestParam(name="hostName", required = false, defaultValue = "Sam") String hostName,
                           @RequestParam(name="inviteName", required = false, defaultValue = "Sally") String inviteName,
                           @RequestParam(name="address", required = false, defaultValue = "12345 Random St") String address,
                           @RequestParam(name="wordsList", required = false, defaultValue = "ten,fading,post,card,thunder,hinge,trailing,batting") String wordsList,
                           @RequestParam(name="wordsEnding", required = false, defaultValue = "ing") String wordsEnding,
                           @RequestParam(name="itemsSold", required = false, defaultValue = "48,50,37,62,38,70,55,37,64,60") String itemsSold,
                           @RequestParam(name="employeeIndex", required = false, defaultValue = "9") String employeeIndex,
                           @RequestParam(name="fixedWage", required = false, defaultValue = "10.0") String fixedWage,
                           @RequestParam(name="perItemWage", required = false, defaultValue = "1.5") String perItemWage,
                           @RequestParam(name="firstName", required = false, defaultValue = "john") String firstName,
                           @RequestParam(name="lastName", required = false, defaultValue = "smith") String lastName,
                           @RequestParam(name="firstName2", required = false, defaultValue = "johnson") String firstName2,
                           @RequestParam(name="lastName2", required = false, defaultValue = "smith") String lastName2,
                           // @RequestParam(name="unit5", required = false, defaultValue = "") String unit5,
                           Model model)
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
        streak.longestStreak(originalString);
        String resultStreak = streak.streakInfo();

        //Unit 5 FRQ
        Unit5Invitation invite1 = new Unit5Invitation();
        invite1.setInvite(hostName, address, inviteName);
        String invite = invite1.getInvite();


        Unit5PwGenerator password = new Unit5PwGenerator(Integer.parseInt(length), prefix);
        password.setPwGen();
        String pwd = password.getPwd();

        //Unit 6
        String[] wordsArray = wordsList.split(",");
        Unit6StringSelect list1 = new Unit6StringSelect(wordsArray, wordsEnding);
        String resultWords = list1.selectWords();

        String[] itemArray = itemsSold.split(",");
        int[] itemsSoldArr = new int[itemArray.length];
        for (int i=0; i < itemArray.length; i++) {
            itemsSoldArr[i] = Integer.parseInt(itemArray[i]);
        }
        Unit6Payroll pay = new Unit6Payroll(itemsSoldArr);
        double wageDouble = pay.computeWages(Double.parseDouble(fixedWage), Double.parseDouble(perItemWage), Integer.parseInt(employeeIndex));
        String wage = String.valueOf(wageDouble);
        String bonusThreshold = String.valueOf(pay.computeBonusThreshold());

        //Unit 7
        Unit7UserName username = new Unit7UserName();
        username.setUserName(firstName, lastName);
        username.setAvailableUsers();
        ArrayList<String> possibleNames1 = username.getPossibleNames();
        username.setUsedNames();
        ArrayList<String> possibleNames2 = username.setAvailableUsers2(firstName2, lastName2);

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
        model.addAttribute("resultStreak", resultStreak);
        model.addAttribute("invite", invite);
        model.addAttribute("resultWords", resultWords);
        model.addAttribute("wage", wage);
        model.addAttribute("bonusThreshold", bonusThreshold);
      //  model.addAttribute("unit5", unit5);
       model.addAttribute("pwd", pwd);
        model.addAttribute("possibleNames1", possibleNames1);
        model.addAttribute("possibleNames2", possibleNames2);

        return "Pages/aboutMePages/samAbout";
    }
   /* @RequestMapping(value = "/samAbout", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> stringsNew(RequestEntity<Object> request) throws JSONException {
        // extract json from RequestEntity
        JSONObject jo = new JSONObject((Map) Objects.requireNonNull(request.getBody()));

        // create JSON object of string sequence resulting database and metadata
        JSONObject body = this.getBody();

        // send ResponseEntity body and status message
        return new ResponseEntity<>(body, HttpStatus.OK);
    }*/


}
