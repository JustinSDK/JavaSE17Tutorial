package cc.openhome;

import java.io.*;
import java.net.URI;
import java.net.http.*;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.*;
import static java.nio.file.StandardCopyOption.*;

public class Download {
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
    
    public static void main(String[] args) throws Exception {
        Files.copy(openStream(args[0]), Paths.get(args[1]), REPLACE_EXISTING);
    }
}
