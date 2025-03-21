package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/main";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (connection != null) {
                System.out.println("Соединение с БД успешно установлено!");
            }
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Не удалось установить соединение с БД!");
        }
        return null;
    }
}

