package com.rd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {

    public static void deleteData(String firstName) {
        String deleteSQL = "DELETE FROM personnel WHERE first_name = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {

            pstmt.setString(1, firstName);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Data deleted successfully. Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
