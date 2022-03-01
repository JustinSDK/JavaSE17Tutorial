package cc.openhome;

import java.io.*;

public class Exercise2 {
    public static void dump(Reader src, Writer dest) throws IOException {
        try(src; dest) {
            var data = new char[1024];
            var length = 0;
            while((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }

    public static void main(String[] args) {
        try {
            var srcEncoding = args[0];
            var srcName = args[1];
            var destName = args[2];
            dump(new InputStreamReader(new FileInputStream(srcName), srcEncoding),
                 new OutputStreamWriter(new FileOutputStream(destName), "UTF-8"));
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("要指定引數：srcEncoding srcName destName");
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
