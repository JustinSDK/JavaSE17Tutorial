package cc.openhome;

import java.sql.*;
import java.util.*;

public class MessageDAO {
    private String url;
    private String username;
    private String password;

    public MessageDAO(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public void add(Message message) {
        try(var conn = DriverManager.getConnection(url, username, password);
            var statement = conn.createStatement()) {
            var sql = String.format(
         "INSERT INTO messages(name, email, msg) VALUES ('%s', '%s', '%s')",  
                  message.name(), message.email(), message.msg());
            statement.executeUpdate(sql);
        } catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Message> get() {
        var messages = new ArrayList<Message>();
        try(var conn = DriverManager.getConnection(url, username, password);
            var statement = conn.createStatement()) {
            var result = statement.executeQuery("SELECT * FROM messages");
            while(result.next()) {
                var message = toMessage(result);
                messages.add(message);
            }
        } catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
        return messages;
    }

    private Message toMessage(ResultSet result) throws SQLException {
        return new Message(
            result.getString(2),
            result.getString(3),
            result.getString(4)
        );
    }
}
