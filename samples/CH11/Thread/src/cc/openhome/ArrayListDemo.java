package cc.openhome;

public class ArrayListDemo {

    public static void main(String[] args) {
        var list = new ArrayList();
        var thread1 = new Thread(() -> {
            while(true) {
                list.add(1);
            }
        });

        var thread2 = new Thread(() -> {
            while(true) {
                list.add(2);
            }
        });

        thread1.start();
        thread2.start();
    }
}
