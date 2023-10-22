package com.ohms.dao.pharmacy;  // Replace with your appropriate package

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ohms.model.pharmacy.Pharmacist;  // Replace with your actual model class

public class PharmacistDAO {
    private Connection connection;  // You should have a database connection here

    public PharmacistDAO(Connection connection) {
        this.connection = connection;
    }

    public Pharmacist getPharmacistByUsername(String username) {
        Pharmacist pharmacist = null;
        String query = "SELECT username, password FROM users WHERE username = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                String dbUsername = resultSet.getString("username");
                String dbPassword = resultSet.getString("password");
                pharmacist = new Pharmacist(dbUsername, dbPassword);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return pharmacist;
    }
}
