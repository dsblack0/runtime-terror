package com.example.sping_portfolio.controllers.database.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// import dbConnect where ever it is
import com.example.sping_portfolio.controllers.database.admin.dbConnect;


// Servlet Name
@WebServlet("/admin")
public class admin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try {
            Connection connection = dbConnect.initializeDatabase();

            // Create SQL query to insert into table tbl_club (Refer to admin.sql)
            PreparedStatement st = connection.prepareStatement("INSERT INTO tbl_club VALUES(0, ?, ?, ?)");

            // Param two
            st.setString(2, request.getParameter("clubname"));

            // Param three
            st.setString(3, request.getParameter("aboutclub"));

            // Param four
            st.setString(4, request.getParameter("clublinks"));

            // Update the DB
            st.executeUpdate();

            // Close all the connections
            st.close();
            connection.close();

            // Get a writer pointer 
            // to display the successful result
            PrintWriter out = response.getWriter();
            out.println("<html><body><b>Successfully Added Club</b></body></html>");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}