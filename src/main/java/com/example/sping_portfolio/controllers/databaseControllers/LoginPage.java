
package com.example.sping_portfolio.controllers.databaseControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class LoginPage {
    @GetMapping("/login")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String login(@RequestParam(name="firstname", required=false) String firstname, @RequestParam(name="password", required=false) String password, Model model) {
        System.out.println("firstname from form " + firstname);
        System.out.println("password from form " + password);
        if(checkFirstnamePassword(firstname, password)) {
            model.addAttribute("loginStatus", "Login Success");
            return "databasePages/loginHome"; // returns HTML VIEW (greeting)


        } else {
            model.addAttribute("loginStatus", "Login Fail");
        }
        return "databasePages/login"; // returns HTML VIEW (greeting)
    }

    /**
     * Connect to database
     */
    public static Connection connect() throws SQLException {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:src/main/resources/static/database/mydatabase.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Login: Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    // Check username and password
    public static boolean checkFirstnamePassword(String firstname, String password) {
        String sql = "SELECT * FROM rc_table WHERE "
                + "FIRSTNAME = ? AND "
                + "PASSWORD = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, firstname);
            pstmt.setString(2, password);

            // update
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println(firstname + " with password " + password + " login successful");
                return true;
            } else {
                System.out.println(firstname + " with password " + password + " login fail");
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }


    // Console UI is run out of the same Controller
    public static void main(String[] args) {
        checkFirstnamePassword("RACHEL","PASSWORD");
        checkFirstnamePassword("RACH","PASS");
    }
}