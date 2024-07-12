package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    private static final String URL = "jdbc:postgresql://localhost:5434/mydatabase";
    private static final String USER = "myuser";
    private static final String PASSWORD = "mysecretpassword";

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e){
            e.printStackTrace(); //обычно так не делают, подключают логгер
        }
        return connection;

    }
}
