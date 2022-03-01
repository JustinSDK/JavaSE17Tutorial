package cc.openhome;

import java.io.*;

public class CharUtil2 {
    public static void dump(Reader src, Writer dest) throws IOException {
        try(src; dest) {
            var data = new char[1024];
            var length = 0;
            while((length = src.read(data)) != -1) {
            	dest.write(data, 0, length);
            }
        }
    }
    
    public static void dump(InputStream src, OutputStream dest, 
                             String charset) throws IOException {
        dump(
            new InputStreamReader(src, charset), 
            new OutputStreamWriter(dest, charset)
        );
    }

    // 採用預設編碼
    public static void dump(InputStream src, OutputStream dest) 
                           throws IOException {
        dump(src, dest, System.getProperty("file.encoding"));
    }
}
