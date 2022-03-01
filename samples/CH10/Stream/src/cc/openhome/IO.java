package cc.openhome;

import java.io.*;

public class IO {
    public static void dump(InputStream src, OutputStream dest)
                               throws IOException {
        try (src; dest) {
            var data = new byte[1024];
            var length = 0;
            while((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }
}