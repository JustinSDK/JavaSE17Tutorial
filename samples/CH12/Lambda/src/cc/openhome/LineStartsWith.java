package cc.openhome;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LineStartsWith {
    public static void main(String[] args) throws IOException {
        var fileName = args[0];
        var prefix = args[1];
        var maybeMatched = Files.lines(Paths.get(fileName))
                               .filter(line -> line.startsWith(prefix))
                               .findFirst();
        System.out.println(maybeMatched.orElse("no matched line"));
    }
}