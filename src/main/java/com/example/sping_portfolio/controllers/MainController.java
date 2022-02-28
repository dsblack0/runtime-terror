package com.example.sping_portfolio.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Objects;

@Controller
public class MainController {
    //Team About Us
    @GetMapping ("/teamAbout")
    public String teamAbout(@RequestParam(name="inputx", required = false, defaultValue = "0") String inputx,
                            @RequestParam(name="inputy", required = false, defaultValue = "0") String inputy,
                            @RequestParam(name="length", required = false, defaultValue = "4") String length,
                            Model model) {
        int inpx = Integer.parseInt(inputx);
        int inpy = Integer.parseInt(inputy);
        int slength = Integer.parseInt(length);

        model.addAttribute("slength", slength);
        model.addAttribute("inpx", inpx);
        model.addAttribute("inpy", inpy);

        return "Pages/aboutMePages/teamAbout";
    }
  
    //Club Reviews
    @GetMapping ("/reviewsPage")
    public String reviewsPage(@RequestParam(name="clubName", required = false, defaultValue = "") String clubName,
                              @RequestParam(name="reviewText",required = false, defaultValue = "") String reviewText,
                              @RequestParam(name="reviewerName", required = false, defaultValue = "") String reviewerName, Model model) {

        reviewsPage review5 = new reviewsPage();
        review5.reviewCreate(clubName, reviewText, reviewerName);

        reviewsPage review1 = new reviewsPage();
        review1.reviewCreate("Robotics", "This is some random default review text that is ment mainly to just test this out because I don't know what to set", "");
        reviewsPage review2 = new reviewsPage();
        review2.reviewCreate("Speech & Debate", "This is some random default review text that is ment mainly to just test this out because I don't know what to set", "a person");
        reviewsPage review3 = new reviewsPage();
        review3.reviewCreate("Math Club", "This is some random default review text that is ment mainly to just test this out because I don't know what to set", "");
        reviewsPage review4 = new reviewsPage();
        review4.reviewCreate("Key Club", "This is some random default review text that is ment mainly to just test this out because I don't know what to set", "");

        ArrayList<reviewsPage> reviews = new ArrayList<>();
        reviews.add(review1);
        reviews.add(review2);
        reviews.add(review3);
        reviews.add(review4);

        // If not club name is inputted, the review won't be created
        if (!Objects.equals(clubName, "")) {
            reviews.add(review5);
        }

        model.addAttribute("reviews", reviews);

        return "reviewsPage";
    }
    @GetMapping("/")
    // Home Page
    public String index(Model model) {

        Clubs club1 = new Clubs();//creating an object of Student
        Clubs club2 = new Clubs();
        Clubs club3 = new Clubs();
        Clubs club4 = new Clubs();//creating an object of Student
        Clubs club5 = new Clubs();
        Clubs club6 = new Clubs();
        Clubs club7 = new Clubs();//creating an object of Student
        Clubs club8 = new Clubs();
        Clubs club9 = new Clubs();
        Clubs club10 = new Clubs();
        Clubs club11 = new Clubs();
        Clubs club12 = new Clubs();
        Clubs club13 = new Clubs();
        Clubs club14 = new Clubs();
        Clubs club15 = new Clubs();
        Clubs club16 = new Clubs();
        Clubs club17 = new Clubs();
        Clubs club18 = new Clubs();
        Clubs club19 = new Clubs();
        Clubs club20 = new Clubs();
        Clubs club21 = new Clubs();
        Clubs club22 = new Clubs();
        Clubs club23 = new Clubs();
        Clubs club24 = new Clubs();
        Clubs club25 = new Clubs();
        Clubs club26 = new Clubs();



        club1.clubCreate("Speech & Debate", "To recite speeches and practice debates on current events; compete at tournaments", "Mondays & Wednesdays 3:30-4:30");
        club2.clubCreate("Team OPTIX Robotics", "To build a robot for the FRC regional competition in March. Also to fun and market the robot.", "Mondays & Wednesdays & Tuesday & Thursday");
        club3.clubCreate("WHAT Center", "Peer writing tutors for Del Norte High School.", "Mondays & Wednesdays & Thursdays");
        club4.clubCreate("Quiz Bowl", "Prepare academic trivia competitions: encourage participation, breadth and depth of academic knowledge.", "Thursdays");
        club5.clubCreate("Academic League", "To cultivate a desire for learning through team based trivia competitions.", "Mondays & Wednesdays");
        club6.clubCreate("Best Buddies", "Create friendships among disabled & ablebodied student.", "Mondays & Wednesdays");
        club7.clubCreate("All Girls STEM Society", "Create workshops to inspire young girls to pursue STEM.", "Mondays & Wednesdays");
        club8.clubCreate("American Red Cross Club", "To provide volunteer opportunities and help others in need", "Mondays Lunch (biweekly)");
        club9.clubCreate("Bishops and Knights", "To get other people involved in Chess and Compete in chess Tournaments\n", "Mondays & Wednesdays");
        club10.clubCreate("Chemistry Tutoring Club", "To provide one-on-one chemistry tutoring from Chem 1 to AP Chem", "Mondays/Tuesdays/Wednesdays/Thursdays/Fridays (by appointment)");
        club11.clubCreate("DECA", "To prepare emerging leaders and entrepreneurs in marketing, finance, hospitality and business management in high schools and the globe\n", "Tuesday Lunch");
        club12.clubCreate("HOSA", "Helps students explore the medical field and participate in community device projects", "Wednesdays Lunch + Tutorial");
        club13.clubCreate("Key Club", "A club that promotes volunteering and fundraising for the communities.", "Tuesdays Lunch (monthly)");
        club14.clubCreate("LINK CREW", "To create a welcoming environment for freshman Nighthawks", "Fridays Homeroom");
        club15.clubCreate("Mock Trial", "To help students understand the legal system, develop speaking skills, and compete in annual competitions ", "Wednesdays 7-8pm");
        club16.clubCreate("Model United Nations", "To raise awareness of global affairs and help students improve their speaking and collaborative skills", "Tuesdays Lunch");
        club17.clubCreate("Mountain Biking", "MTB Discussion, provide an opportunity to high school and middle school boys and girls of all abilities and enjoy the outdoors", "Tuesdays & Thursdays & Saturdays");
        club18.clubCreate("National Honors Society", "A National Volunteer Organization for high school students who got out into the community with 4 pillars in mind: Scholarships, leadership service and character", "Tuesdays/Wednesdays/Thursdays Lunch (monthly)");
        club19.clubCreate("Peer Counseling", "To counsel fellow students through tutoring and mentoring, as well as organizing events", "Fridays Homeroom");
        club20.clubCreate("Rocketry Club", "To foster interest in aerospace and mechanical engineering. We will launch rockets and encourage members to join TARC and Stellar Xplorers\n", "Fridays Lunch (biweekly)");
        club21.clubCreate("Science Olympiad", "To improve the quality of science education, increase interest in science among students of all grade levels, races and genders, create a technologicallyliterate workforce and provide recognition for outstanding achievement by students ", "Mondays/Tuesdays/Wednesdays/Thursdays/Fridays (varies by event)");
        club22.clubCreate("SD STEM Startups", "We strive to build a community of dedicated product developers, designers, and entrepreneurs to create software startups that solve real-world problems.", "Thursdays");
        club23.clubCreate("The Featheralist", "To create magazines for politics, world affairs, and the humanities", "Mondays/Tuesdays/Wednesdays/Thursdays/Fridays (varies by need)");
        club24.clubCreate("The Talon", "A student-run forum dedicated to providing information to public through ethical, truthful and professional journalism", "Thursdays 3:15");
        club25.clubCreate("Tri-Music Honor Society", "Provide volunteer hours for people in the music program (music related)", "Mondays Lunch");
        club26.clubCreate("Sock Puppet Club", "Gather those passionate about the art of sock puppets and create and share ", "First Tuesday of Each Month");


        ArrayList<Clubs> list = new ArrayList<>();
        list.add(club1);
        list.add(club2);
        list.add(club3);
        list.add(club4);
        list.add(club5);
        list.add(club6);
        list.add(club7);
        list.add(club8);
        list.add(club9);
        list.add(club10);
        list.add(club11);
        list.add(club12);
        list.add(club13);
        list.add(club14);
        list.add(club15);
        list.add(club16);
        list.add(club17);
        list.add(club18);
        list.add(club19);
        list.add(club20);
        list.add(club21);
        list.add(club22);
        list.add(club23);
        list.add(club24);
        list.add(club25);
        list.add(club26);

        ArrayList<Clubs> monday = new ArrayList<>();
        ArrayList<Clubs> tuesday = new ArrayList<>();
        ArrayList<Clubs> wednesday = new ArrayList<>();
        ArrayList<Clubs> thursday = new ArrayList<>();
        ArrayList<Clubs> friday = new ArrayList<>();
        for (int i=0; i<26; i++) {
            if (list.get(i).getDates().contains("Monday")) {
                monday.add(list.get(i));
            }
            if (list.get(i).getDates().contains("Tuesday")) {
                tuesday.add(list.get(i));
            }
            if (list.get(i).getDates().contains("Wednesday")) {
                wednesday.add(list.get(i));
            }
            if (list.get(i).getDates().contains("Thursday")) {
                thursday.add(list.get(i));
            }
            if (list.get(i).getDates().contains("Friday")) {
                friday.add(list.get(i));
            }
        }
        model.addAttribute("monday", monday);
        model.addAttribute("tuesday", tuesday);
        model.addAttribute("wednesday", wednesday);
        model.addAttribute("thursday", thursday);
        model.addAttribute("fridat", friday);

        return "index"; // returns HTML VIEW (greeting)
    }
}

