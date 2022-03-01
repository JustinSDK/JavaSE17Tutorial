package cc.openhome;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.*;
import java.io.*;

public class Pages {
    private String[] urls;
    private String[] fileNames;
    private Executor executor;

    public Pages(String[] urls, String[] fileNames, Executor executor) {
        this.urls = urls;
        this.fileNames = fileNames;
        this.executor = executor;
    }

    public void download() {
        for(var i = 0; i < urls.length; i++) {
            var url = urls[i];
            var fileName = fileNames[i];
            executor.execute(() -> {
                try {
                    dump(openStream(url), new FileOutputStream(fileName));
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            });
        }
    }
    
    private InputStream openStream(String uri) throws Exception {
        return HttpClient
                 .newHttpClient()
                 .send(
                     HttpRequest.newBuilder(URI.create(uri)).build(), 
                     BodyHandlers.ofInputStream()
                 )
                 .body();
    }    

    private void dump(InputStream src, OutputStream dest) throws IOException {
        try(src; dest) { 
            var data = new byte[1024];
            var length = 0;
            while((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }
}
