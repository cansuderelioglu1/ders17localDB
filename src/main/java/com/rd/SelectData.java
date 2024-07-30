package com.rd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectData {

    public static void selectData() {
        String selectSQL = "SELECT * FROM personnel";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(selectSQL);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String position = rs.getString("position");
                double salary = rs.getDouble("salary");

                System.out.printf("ID: %d, Name: %s %s, Position: %s, Salary: %.2f%n",
                        id, firstName, lastName, position, salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

