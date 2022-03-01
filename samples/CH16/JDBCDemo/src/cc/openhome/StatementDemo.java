package cc.openhome;

import java.sql.DriverManager;
import java.sql.SQLException;

public class StatementDemo {
    public static void main(String[] args) {
        var url = "jdbc:h2:tcp://localhost/c:/workspace/JDBCDemo/demo";
        var user = "caterpillar";
        var password = "12345678";
        
        try(var conn = DriverManager.getConnection(url, user, password);
            var statement = conn.createStatement()) {
            statement.executeUpdate(
                """                        
                CREATE TABLE messages (
                    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                    name CHAR(20) NOT NULL,
                    email CHAR(40),
                    msg VARCHAR(256) NOT NULL
                );
                """
            );
            System.out.println("建立 messages 表格了");
        } catch(SQLException ex) {
            throw new RuntimeException(ex);
        }        
    }
}
