package jagaimogit.todolist.utils;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public static void initialize() {
        String dir = System.getProperty("user.home")+"/.todolist";
        if(!new File(dir).exists()){
            new File(dir).mkdir();
            String url = "jdbc:sqlite:"+dir+"/tasks.db";
            try{
                Connection connection = DriverManager.getConnection(url);
                System.out.println("Initialized DB");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("DB is already initialized");
        }
    }
    public static Connection getConnection() {
        String dir = System.getProperty("user.home")+"/.todolist";
        String url = "jdbc:sqlite:"+dir+"/tasks.db";
        try{
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Loaded DB");
            return connection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
