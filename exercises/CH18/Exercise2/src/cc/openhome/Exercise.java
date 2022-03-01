package cc.openhome;

public class Exercise {

    public static void main(String[] args) throws Exception {
        var queue = new ClientQueue();
        var installer = new ClientListenerInstaller(queue);
        installer.install(ClientLogger.class);
        
        var c1 = new Client("127.0.0.1", "caterpillar");
        var c2 = new Client("192.168.0.2", "justin");
        queue.add(c1);
        queue.add(c2);
        queue.remove(c1);
        queue.remove(c2);
    }
}
