
package com.example.sping_portfolio.controllers.databaseControllers;

import com.example.sping_portfolio.Main;
import com.example.sping_portfolio.controllers.database.Club.Club;
import com.example.sping_portfolio.controllers.database.Club.ClubController;
import com.example.sping_portfolio.controllers.database.Club.ClubJpaRepository;
import com.example.sping_portfolio.controllers.database.Club.ClubSqlRepository;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.validation.constraints.Null;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

import java.text.ParseException;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class admin {
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
                PreparedStatement ps = con.prepareStatement("INSERT INTO clubs (president, membercount, aboutclub, clublinks, clubname) VALUES(?, ?, ?, ?, ?)");
                ps.setString(1, clubpresident);
                ps.setInt(2,membercount);
                ps.setString(3, aboutclub);
                ps.setString(4, clublinks);
                ps.setString(5, clubname);
                PreparedStatement ps1 = con.prepareStatement("SELECT id FROM clubs WHERE president=? AND aboutclub=? AND clublinks=? AND clubname=? LIMIT 1");
                ps.executeUpdate();

                ps1.setString(1, clubpresident);
                ps1.setString(2, aboutclub);
                ps1.setString(3, clublinks);
                ps1.setString(4, clubname);
                ResultSet rs = ps1.executeQuery();
                while (rs.next()) {
                    model.addAttribute("id", rs.getString(1));
                }
                ps1.close();



                ps.close();
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


        return "databasePages/admin"; // returns HTML VIEW (greeting)
    }
}