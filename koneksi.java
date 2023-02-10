package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    public static Connection mysqlConfig;
    public static Connection tembudDB() throws SQLException{
        try {
            String host = "jdbc:mysql://localhost:3306/db_sitempe";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlConfig = DriverManager.getConnection(host, user, pass);
            System.out.println("koneksi terhubung ke database");
        } catch (Exception e) {
            System.out.println("Koneksi gagal " + e.getMessage());
        }
        return mysqlConfig;
    }
}