package com.rd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

    public static void insertData() {
        String insertSQL = "INSERT INTO personnel (first_name, last_name, position, salary) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            pstmt.setString(1, "John");
            pstmt.setString(2, "Doe");
            pstmt.setString(3, "Developer");
            pstmt.setDouble(4, 60000);
            pstmt.executeUpdate();

            pstmt.setString(1, "Jane");
            pstmt.setString(2, "Smith");
            pstmt.setString(3, "Designer");
            pstmt.setDouble(4, 55000);
            pstmt.executeUpdate();

            pstmt.setString(1, "Emily");
            pstmt.setString(2, "Johnson");
            pstmt.setString(3, "Manager");
            pstmt.setDouble(4, 75000);
            pstmt.executeUpdate();

            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
