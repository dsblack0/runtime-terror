package com.example.sping_portfolio.controllers.samAboutMe;

//import org.json.JSONException;
//import org.json.JSONObject;
import com.example.sping_portfolio.controllers.samAboutMe.Unit9Animal.Unit9Animal;
import com.example.sping_portfolio.controllers.samAboutMe.Unit9Animal.Unit9Elephant;
import com.example.sping_portfolio.controllers.samAboutMe.Unit9Animal.Unit9Herbivore;
import com.example.sping_portfolio.controllers.samAboutMe.Unit9Book.Unit9Book;
import com.example.sping_portfolio.controllers.samAboutMe.Unit9Book.Unit9BookListing;
import com.example.sping_portfolio.controllers.samAboutMe.Unit9Book.Unit9PictureBook;
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
                           @RequestParam(name="cropType", required = false, defaultValue = "corn") String cropType,
                           @RequestParam(name="column", required = false, defaultValue = "0") String column,
                           @RequestParam(name="fraction", required = false, defaultValue = "30/3") String fraction,
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
        String[] unit2 = new String[]{newSeq, oldSeq, resultSeq, num1, num2, distance};

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
        String[] unit3 = new String[]{option1, option2, compare};

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
        String[] unit4 = new String[]{resultStreak, p1Move, p2Move, gameResult};

        //Unit 5 FRQ
        Unit5Invitation invite1 = new Unit5Invitation();
        invite1.setInvite(hostName, address, inviteName);
        String invite = invite1.getInvite();

        Unit5PwGenerator password = new Unit5PwGenerator(Integer.parseInt(length), prefix);
        password.setPwGen();
        String pwd = password.getPwd();
        String[] unit5 = new String[]{invite, pwd};

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
        String[] unit6 = new String[]{resultWords, bonusThreshold, wage};

        //Unit 7
        Unit7UserName username = new Unit7UserName();
        username.setUserName(firstName, lastName);
        username.setAvailableUsers();
        ArrayList<String> possibleNames1 = username.getPossibleNames();
        username.setUsedNames();
        ArrayList<String> possibleNames2 = username.setAvailableUsers2(firstName2, lastName2);
        ArrayList[] unit7 = new ArrayList[]{possibleNames1, possibleNames2};

        //Unit 8
        Unit8ExperimentalFarm plot = new Unit8ExperimentalFarm();
        String highestYield = plot.getHighestYield(cropType);
        String sameCrop = String.valueOf(plot.sameCrop(Integer.parseInt(column)));
        String[] unit8 = new String[]{cropType, highestYield, column, sameCrop};

        //Unit 9
        Unit9Animal lisa = new Unit9Animal("carnivore", "lion", "Lisa");
        Unit9Herbivore gary = new Unit9Herbivore("giraffe", "Gary");
        Unit9Herbivore kate = new Unit9Herbivore("koala", "Kate");
        Unit9Elephant percy = new Unit9Elephant("Percy", 2.0);
        Unit9Elephant elly = new Unit9Elephant("Elly", 3.2);
        Unit9Animal[] unit9a = new Unit9Animal[]{lisa, gary, percy, kate, elly};

        Unit9PictureBook myBook = new Unit9PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
        Unit9Book book1 = new Unit9Book("Frankenstein", "Marry Shelley");
        Unit9PictureBook book2 = new Unit9PictureBook("The Wonderful Wizard of Oz",  "L. Frank Baum", "W.W. Denslow");
        Unit9BookListing listing1 = new Unit9BookListing(book1, 10.99);
        Unit9BookListing listing2 = new Unit9BookListing(book2, 12.99);
        Unit9Book[] unit9b = new Unit9Book[]{myBook, book1, book2};
        Unit9BookListing[] unit9c = new Unit9BookListing[]{listing1, listing2};

        //Unit 10
        String[] numbers = fraction.split("/");
        Unit10NumberSystem fractions = new Unit10NumberSystem();
        String gcf = String.valueOf(fractions.gcf(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1])));
        String reducedFraction = fractions.reduceFraction(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]));
        String[] unit10 = new String[]{gcf, reducedFraction};

        var quotes = response.body();
        model.addAttribute("quotes", quotes);
        model.addAttribute("name", name);
        model.addAttribute("unit2", unit2);
        model.addAttribute("unit3", unit3);
        model.addAttribute("unit4", unit4);
        model.addAttribute("unit5", unit5);
        model.addAttribute("unit6", unit6);
        model.addAttribute("unit7", unit7);
        model.addAttribute("unit8", unit8);
        model.addAttribute("unit9a", unit9a);
        model.addAttribute("unit9b", unit9b);
        model.addAttribute("unit9c", unit9c);
        model.addAttribute("unit10", unit10);

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
