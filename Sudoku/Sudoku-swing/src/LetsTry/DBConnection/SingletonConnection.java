package LetsTry.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {

    private static Connection conn;

    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "root");

            System.out.println("Connected!");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error:" + e.getMessage());
        }
    }

    public static  Connection getCon(){
        return conn;
    }
}
