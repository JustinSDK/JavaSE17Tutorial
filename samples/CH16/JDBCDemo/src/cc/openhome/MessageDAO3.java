package cc.openhome;

import java.sql.*;
import java.util.*;
import javax.sql.DataSource;

public class MessageDAO3 {
    private DataSource dataSource;
    
    public MessageDAO3(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void add(Message message) {
        try(var conn = dataSource.getConnection();
            var statement = conn.prepareStatement(
                  "INSERT INTO messages(name, email, msg) VALUES (?,?,?)")) {
            statement.setString(1, message.name());
            statement.setString(2, message.email());
            statement.setString(3, message.msg());
            statement.executeUpdate();
        } catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Message> get() {
        var messages = new ArrayList<Message>();
        try(var conn = dataSource.getConnection();
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
