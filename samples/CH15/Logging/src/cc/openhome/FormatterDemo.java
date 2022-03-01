package cc.openhome;

import java.time.Instant;
import java.util.logging.*;

public class FormatterDemo {
    public static void main(String[] args) {
        var logger = Logger.getLogger(FormatterDemo.class.getName());
        logger.setLevel(Level.CONFIG);
        var handler = new ConsoleHandler();
        handler.setLevel(Level.CONFIG);
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return """
                   日誌來自 %s %s    
                       層級：%s
                       訊息：%s
                       時間：%s
                       """.formatted(
                           record.getSourceClassName(), record.getSourceMethodName(),
                           record.getLevel(),
                           record.getMessage(),
                           Instant.ofEpochMilli(record.getMillis())
                      );
            }
        });
        logger.addHandler(handler);
        logger.config("自訂 Formatter 訊息");
    }
}
