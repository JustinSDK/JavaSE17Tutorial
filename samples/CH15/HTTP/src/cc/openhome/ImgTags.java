package cc.openhome;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.regex.Pattern;

public class ImgTags {
    public static void main(String[] args) {
    	var regex = Pattern.compile("(?s)<img.+?src=\"(.+?)\".*?>");
    	
    	var request = HttpRequest
    		           .newBuilder()
    		           .uri(URI.create(args[0]))
                       .build();
    	
        HttpClient.newHttpClient()
             .sendAsync(request, BodyHandlers.ofString())
             .thenApply(resp -> resp.body())
             .thenAccept(html -> {
                   var matcher = regex.matcher(html);
                   while(matcher.find()) {
                   	System.out.println(matcher.group());
                   }
             })
             .join();
    }
}
