package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String HOST = "jdbc:mysql://localhost:3306/katadb111?useSSL=false&allowMultiQueries=true&serverTimezone=UTC";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(HOST, LOGIN, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}


//public class Util {
//    // реализуйте настройку соеденения с БД https://pastebin.com/rwgPsfgW
//
//    private static final  String URL = "jdbc:mysql://localhost:3306/katadb111";
//    private static final String URLFIXED =
//            "jdbc:mysql://localhost:3306/katadb111?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
//                    "&useLegacyDatetimeCode=false&serverTimezone=UTC";
//    private static final String USERNAME = "root";
//    private static final  String PASSWORD = "root";
//
//    public static void main(String[] args) throws Exception{
//        Connection connection;
//
//        connection = DriverManager.getConnection(URLFIXED, USERNAME, PASSWORD);
//
//        if (!connection.isClosed()) {
//            System.out.println("Соединение с БД Установлено!");
//        }
//        connection.close();
//        if (connection.isClosed()) {
//            System.out.println("Соединение с БД Закрыто!");
//        }
//    }
//}
