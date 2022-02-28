package com.example.sping_portfolio.controllers.database.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {
    public static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException
    {
        String dbDriver = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql:// localhost:3306/";
        String dbName = "db_clubs";
        String dbUsername = "root";
        String dbPassword = "";
        Connection connection = DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword);
        return connection;
    }
}