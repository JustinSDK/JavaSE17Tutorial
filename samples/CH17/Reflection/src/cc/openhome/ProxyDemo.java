package cc.openhome;
public class ProxyDemo {
    public static void main(String[] args) { 
        var helloProxy = (Hello) LoggingProxy.bind(new HelloSpeaker()); 
        helloProxy.hello("Justin");
    }
} 
