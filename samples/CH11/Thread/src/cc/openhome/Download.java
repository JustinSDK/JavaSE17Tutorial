package cc.openhome;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.io.*;

public class Download {
    public static void main(String[] args) throws Exception {
        String[] urls = {
            "https://openhome.cc/Gossip/Encoding/",
            "https://openhome.cc/Gossip/Scala/",
            "https://openhome.cc/Gossip/JavaScript/",
            "https://openhome.cc/Gossip/Python/"
        };
        
        String[] fileNames = {
            "Encoding.html",
            "Scala.html",
            "JavaScript.html",
            "Python.html"
        };

        for(var i = 0; i < urls.length; i++) {
            dump(openStream(urls[i]), new FileOutputStream(fileNames[i]));
        }
    }
    
    static InputStream openStream(String uri) throws Exception {
        return HttpClient
                 .newHttpClient()
                 .send(
                     HttpRequest.newBuilder(URI.create(uri)).build(), 
                     BodyHandlers.ofInputStream()
                 )
                 .body();
    }    
    
    static void dump(InputStream src, OutputStream dest)
                               throws IOException {
        try(src; dest) {
            var data = new byte[1024];
            var length = 0;
            while ((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }
}
