package com.ohms.dao.pharmacy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.ohms.model.pharmacy.*;
import com.ohms.util.MySQLConnection;

public class PharmacistDAO {

    public Pharmacist getPharmacist(String username, String password) {
        Connection connection = MySQLConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Pharmacist pharmacist = null;

        try {
            String sql = "SELECT * FROM user WHERE username=? AND password=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                pharmacist = new Pharmacist();
                pharmacist.setId(resultSet.getInt("id"));
                pharmacist.setUsername(resultSet.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return pharmacist;
    }
}
