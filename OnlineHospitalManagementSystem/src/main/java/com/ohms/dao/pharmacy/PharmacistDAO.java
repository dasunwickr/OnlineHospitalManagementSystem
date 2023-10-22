package com.ohms.dao.pharmacy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ohms.util.MySQLConnection;

public class PharmacistDAO {


	public PharmacistDAO() {
		super();
	}

	
	
	public boolean isValidPharmacist(String username, String password) {
        String sql = "SELECT 1 FROM User u "
                + "INNER JOIN Pharmacist p ON u.id = p.PharmacistID "
                + "WHERE u.username = ? AND u.password = ?";
        Connection connection = MySQLConnection.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, username);
            statement.setString(2, password);

            try (ResultSet result = statement.executeQuery()) {
                return result.next(); // If a row is returned, the credentials are valid
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // Invalid credentials
    }

}
