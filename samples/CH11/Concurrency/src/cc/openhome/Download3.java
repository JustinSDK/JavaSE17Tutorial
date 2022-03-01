package cc.openhome;

import java.util.concurrent.Executors;

public class Download3 {
    public static void main(String[] args) {
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

        var executorService = Executors.newCachedThreadPool();
        new Pages(urls, fileNames, executorService).download();
        executorService.shutdown();
    }
}
