package cc.openhome;

import static java.lang.System.out;

public class Exercise {

    public static void main(String[] args) throws Exception {
        var dataSource = new SimpleConnectionPoolDataSource();
        var jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(
            """
            CREATE TABLE messages (
                id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                name CHAR(20) NOT NULL,
                email CHAR(40),
                msg VARCHAR(256) NOT NULL
            );
            """
        );
        
        jdbcTemplate.update(
                "INSERT INTO messages(name, email, msg) VALUES (?,?,?)",
                "測試員", "tester@openhome.cc", "這是一個測試留言");
        
        jdbcTemplate.queryForList("SELECT * FROM messages")
                    .forEach(message -> {
                        out.printf("%d\t%s\t%s\t%s%n", 
                                message.get("ID"), 
                                message.get("NAME"), 
                                message.get("EMAIL"), 
                                message.get("MSG"));
                    });
    }
}
