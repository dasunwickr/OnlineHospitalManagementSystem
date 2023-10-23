package com.ohms.dao.pharmacy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ohms.model.pharmacy.Supplier;
import com.ohms.util.MySQLConnection; // Import the MySQLConnection utility

public class SupplierDAO {

    public void insertSupplier(Supplier supplier) {
        String query = "INSERT INTO Supplier (Name, ContactPerson, Email, PhoneNumber, Address) VALUES (?, ?, ?, ?, ?)";
        
        try (
            Connection connection = MySQLConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setString(1, supplier.getName());
            statement.setString(2, supplier.getContactPerson());
            statement.setString(3, supplier.getEmail());
            statement.setString(4, supplier.getPhoneNumber());
            statement.setString(5, supplier.getAddress());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Supplier> getAllSuppliers() {
        List<Supplier> suppliers = new ArrayList<>();
        String query = "SELECT * FROM Supplier";
        
        System.out.println("Done 1");

        try (
            Connection connection = MySQLConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                Supplier supplier = new Supplier();
                supplier.setSupplierID(resultSet.getInt("SupplierID"));
                supplier.setName(resultSet.getString("Name"));
                supplier.setContactPerson(resultSet.getString("ContactPerson"));
                supplier.setEmail(resultSet.getString("Email"));
                supplier.setPhoneNumber(resultSet.getString("PhoneNumber"));
                supplier.setAddress(resultSet.getString("Address"));
                suppliers.add(supplier);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return suppliers;
    }
}
