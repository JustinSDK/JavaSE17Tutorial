package cc.openhome;

import java.io.IOException;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

public class CookieOver18 {
    public static void main(String[] args) throws IOException, InterruptedException {
        var over18 = new HttpCookie("over18", "1");
        over18.setPath("/");

        var cookieManager = new CookieManager();
        cookieManager.getCookieStore()
                     .add(URI.create("https://www.ptt.cc"), over18);

        var gossip = URI.create(
                "https://www.ptt.cc/bbs/Gossiping/index.html");

        var request = 
                HttpRequest
                    .newBuilder(gossip)
                    .build();
        
        System.out.println(
                HttpClient
                    .newBuilder()
                    .cookieHandler(cookieManager)
                    .build()
                    .send(request, BodyHandlers.ofString())
                    .body()
        ); 
    }
}
