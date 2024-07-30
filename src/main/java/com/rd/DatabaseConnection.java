package com.rd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Veritabanı bağlantı bilgileri
    private static final String URL = "jdbc:postgresql://localhost:5432/mydatabase";
    private static final String USER = "postgres";
    private static final String PASSWORD = "mysecretpassword";

    // Veritabanı bağlantısını döndürmek için bir metot
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // PostgreSQL JDBC driver'ı yükleme
            Class.forName("org.postgresql.Driver");
            // Bağlantıyı oluşturma
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
        return conn;
    }
}
