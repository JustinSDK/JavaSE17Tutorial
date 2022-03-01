package cc.openhome;

import java.io.*;

public class CharUtil {
    public static void dump(Reader src, Writer dest) throws IOException {
        try(src; dest) {
            var data = new char[1024];
            var length = 0;
            while((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }
}
