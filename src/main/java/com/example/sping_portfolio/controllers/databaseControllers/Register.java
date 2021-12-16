
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
public class Register {
    @GetMapping("/register")
    public String register(@RequestParam(name = "firstname", required = false) String firstname, @RequestParam(name = "password", required = false) String password, Model model) {
        System.out.println("firstname from form " + firstname);
        System.out.println("password from form " + password);
        inputFirstnamePassword(firstname, password);

        return "databasePages/register"; // returns HTML VIEW (greeting)
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

            System.out.println("Register: Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public static void inputFirstnamePassword(String firstname, String password) {
        String sql = "INSERT INTO rc_table(FIRSTNAME,PASSWORD) VALUES(?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, firstname);
            pstmt.setString(2, password);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Console UI is run out of the same Controller
    public static void main(String[] args) {
        inputFirstnamePassword("RACHEL","PASSWORD");
    }
/*
    // Check username and password
    public static boolean inputFirstnamePassword(String firstname, String password) {
        String sql = "INSERT INTO rc_table VALUES(?,?); ";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, firstname);
            pstmt.setString(2, password);

            // update
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println(firstname + " with password " + password + " registration successful");
                return true;
            } else {
                System.out.println(firstname + " with password " + password + " registration failed");
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

 */

}




