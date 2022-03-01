package cc.openhome;

public class Download2 {
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

        new Pages(urls, fileNames, new ThreadPerTaskExecutor()).download();
    }
}
