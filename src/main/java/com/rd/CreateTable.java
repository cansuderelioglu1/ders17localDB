package com.rd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {

    public static void createTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS personnel ("
                + "id SERIAL PRIMARY KEY, "
                + "first_name VARCHAR(50), "
                + "last_name VARCHAR(50), "
                + "position VARCHAR(50), "
                + "salary NUMERIC"
                + ")";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(createTableSQL)) {

            pstmt.executeUpdate();
            System.out.println("Table created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
