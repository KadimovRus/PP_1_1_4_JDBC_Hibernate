package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static Connection connection;

    public static Connection getConnection() {

        try {
            String url = "jdbc:mysql://localhost:3307/user_db";
            String login = "root";
            String password = "admin";
            connection = DriverManager.getConnection(url, login, password);
        } catch ( SQLException  e) {
            e.printStackTrace();
            System.out.println("Connect ERROR");
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
