package com.ohms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    public static Connection getConnection() {
        Connection connection = null;

        String jdbcURL = "jdbc:mysql://localhost:3306/healthcare_system"; 
        String username = "root"; 
        String password = "1234"; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            connection = DriverManager.getConnection(jdbcURL, username, password);
            if (connection != null) {
                System.out.println("Connected to the database");
            }
        } catch (SQLException e) {
            System.err.println("Error in database connection: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
        }

        return connection;
    }

    public static void main(String[] args) {
    	
        Connection connection = MySQLConnection.getConnection();
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
