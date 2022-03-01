package cc.openhome;

import static java.lang.System.out;
import java.time.*;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        var localTime = LocalTime.of(0, 0, 0);
        var localDate = LocalDate.of(1975, 4, 1);
        var zonedDateTime = ZonedDateTime.of(
                localDate, localTime, ZoneId.of("Asia/Taipei"));
        
        out.println(zonedDateTime);
        out.println(zonedDateTime.toEpochSecond());
        out.println(zonedDateTime.toInstant().toEpochMilli());
    }
}

