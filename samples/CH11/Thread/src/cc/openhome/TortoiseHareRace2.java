package cc.openhome;

public class TortoiseHareRace2 {
    public static void main(String[] args) {
        var tortoise = new Tortoise(10);
        var hare = new Hare(10);
        var tortoiseThread = new Thread(tortoise);
        var hareThread = new Thread(hare);
        tortoiseThread.start();
        hareThread.start();
    }
}
