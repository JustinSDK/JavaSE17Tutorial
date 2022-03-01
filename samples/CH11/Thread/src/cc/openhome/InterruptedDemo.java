package cc.openhome;

public class InterruptedDemo {

    public static void main(String[] args) {
        var thread = new Thread(() -> {
            try {
                Thread.sleep(99999);
            } catch(InterruptedException ex) {
                System.out.println("我醒了XD");
                throw new RuntimeException(ex);
            }
        });
        thread.start();
        thread.interrupt(); // 主執行緒呼叫thread的interrupt()
    }
}
