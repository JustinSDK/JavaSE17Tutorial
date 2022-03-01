package cc.openhome;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;

import java.net.*;
import java.net.http.*;
import java.net.http.HttpResponse.BodyHandlers;

public class NIOUtil {
    public static InputStream openStream(String uri) throws Exception {
        // Java 11 新增的 HttpClient API
        return HttpClient
                 .newHttpClient()
                 .send(
                     HttpRequest.newBuilder(URI.create(uri)).build(), 
                     BodyHandlers.ofInputStream()
                 )
                 .body();
    }	
	
    public static void dump(ReadableByteChannel src, 
                           WritableByteChannel dest) throws IOException {
        var buffer = ByteBuffer.allocate(1024);
        try(src; dest) {
            while(src.read(buffer) != -1) {      
                buffer.flip();
                dest.write(buffer);
                buffer.clear();
            }
        }
    }
    
    // 測試用的 main
    public static void main(String[] args) throws Exception {
        var src = Channels.newChannel(openStream("https://openhome.cc"));
        try(var in = new FileOutputStream("index.html")) {
            NIOUtil.dump(src, in.getChannel());
        }
    }
}
