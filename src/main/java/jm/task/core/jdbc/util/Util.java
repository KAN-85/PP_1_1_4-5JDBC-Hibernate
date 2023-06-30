package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection getConnection() {
        Connection connection;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pp113","root", "root");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
            return connection;
    }
}


 /*public static Connection getConnection() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pp113",
                "root", "root")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println(1);
            return connection;
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
}*/
