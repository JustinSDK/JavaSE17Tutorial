package cc.openhome;

import java.io.IOException;
import java.util.logging.*;

public class HandlerDemo {
    public static void main(String[] args) throws IOException {
        var logger = Logger.getLogger(HandlerDemo.class.getName());
        logger.setLevel(Level.CONFIG);
        var handler = new FileHandler("%h/config.log");
        handler.setLevel(Level.CONFIG);
        logger.addHandler(handler);
        logger.config("Logger 組態完成");
    }
}
