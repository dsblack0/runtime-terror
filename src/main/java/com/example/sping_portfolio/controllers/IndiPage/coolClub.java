package com.example.sping_portfolio.controllers.IndiPage;
/**

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.sql.*;

import java.text.ParseException;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class coolClub {
    @GetMapping("/admin")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String login(@RequestParam(name="clubname", required = false, defaultValue = "") String clubname,
                        @RequestParam(name="president", required = false, defaultValue = "") String clubpresident,
                        @RequestParam(name="membercount", required = false, defaultValue = "0") int membercount,
                        @RequestParam(name="aboutclub", required = false, defaultValue = "") String aboutclub,

                        @RequestParam(name="clublinks", required = false, defaultValue = "") String clublinks, Model model) throws IOException, InterruptedException, ParseException {
        if (clubname != "" && clubpresident != "" && membercount != 0 && aboutclub!=""&&clublinks!=""){


            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ap_cs","root","password");

                PreparedStatement ps1 = con.prepareStatement("SELECT president FROM clubs WHERE president=? AND aboutclub=? AND clublinks=? AND clubname=? LIMIT 1");
                ps1.executeUpdate();

                ps1.setString(1, clubpresident);
                ps1.setString(2, aboutclub);
                ps1.setString(3, clublinks);
                ps1.setString(4, clubname);
                ResultSet rs = ps1.executeQuery();
                while (rs.next()) {
                    model.addAttribute("president", rs.getString(2));
                }
                ps1.close();

                PreparedStatement ps2 = con.prepareStatement("SELECT aboutclub FROM clubs WHERE president=? AND aboutclub=? AND clublinks=? AND clubname=? LIMIT 1");
                ps2.executeUpdate();

                ps2.setString(1, clubpresident);
                ps2.setString(2, aboutclub);
                ps2.setString(3, clublinks);
                ps2.setString(4, clubname);
                ResultSet rs2 = ps2.executeQuery();
                while (rs.next()) {
                    model.addAttribute("aboutclub", rs.getString(4));
                }
                ps2.close();

                PreparedStatement ps3 = con.prepareStatement("SELECT clublinks FROM clubs WHERE president=? AND aboutclub=? AND clublinks=? AND clubname=? LIMIT 1");
                ps3.executeUpdate();

                ps3.setString(1, clubpresident);
                ps3.setString(2, aboutclub);
                ps3.setString(3, clublinks);
                ps3.setString(4, clubname);
                ResultSet rs3 = ps3.executeQuery();
                while (rs3.next()) {
                    model.addAttribute("clublinks", rs3.getString(5));
                }
                ps3.close();

                PreparedStatement ps4 = con.prepareStatement("SELECT clubname FROM clubs WHERE president=? AND aboutclub=? AND clublinks=? AND clubname=? LIMIT 1");
                ps4.executeUpdate();

                ps4.setString(1, clubpresident);
                ps4.setString(2, aboutclub);
                ps4.setString(3, clublinks);
                ps4.setString(4, clubname);
                ResultSet rs4 = ps4.executeQuery();
                while (rs.next()) {
                    model.addAttribute("clubname", rs4.getString(6));
                }
                ps4.close();



                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


        return "indiClubPage/coolClub"; // returns HTML VIEW (greeting)
    }
}
 **/