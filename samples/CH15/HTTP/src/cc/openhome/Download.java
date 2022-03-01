package cc.openhome;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.net.http.HttpResponse.BodyHandlers;

public class Download {
    public static void main(String[] args) throws IOException, InterruptedException {
    	HttpClient client = HttpClient.newHttpClient();
    	HttpRequest request = 
    			HttpRequest.newBuilder()
    			           .uri(URI.create(args[0]))
    			           .GET()
    	                   .build();
    	HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    	System.out.println(response.statusCode());
    	System.out.println(response.body());
    }
}
