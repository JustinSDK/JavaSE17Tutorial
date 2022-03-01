package cc.openhome;

import static java.lang.System.out;
import java.sql.*;

public class ConnectionDemo {
    public static void main(String[] args)
                              throws ClassNotFoundException, SQLException {
        var url = "jdbc:h2:tcp://localhost/c:/workspace/JDBCDemo/demo";
        var user = "caterpillar";
        var password = "12345678";

        try(Connection conn = DriverManager.getConnection(url, user, password)) {
            out.printf("已%s資料庫連線%n", 
                    conn.isClosed() ? "關閉" : "開啟");
        } 
    }
}
