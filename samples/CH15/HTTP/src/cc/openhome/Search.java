package cc.openhome;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Map;

public class Search {
    public static void main(String[] args) throws IOException, InterruptedException {
        var params = Map.of("q", "Java SE 17§Þ³N¤â¥U", "lr", "lang_zh-TW");
        var uri = URI.create(
            "https://www.google.com/search?" + 
            RequestHelper.queryString(params, "UTF-8")
        );
        
        var request = HttpRequest.newBuilder(uri)
                                 .header("User-Agent", "Mozilla/5.0")
                                 .build();
        
        System.out.println(
            HttpClient
                .newHttpClient()
                .send(request, BodyHandlers.ofString())
                .body()
        );
    }
}
