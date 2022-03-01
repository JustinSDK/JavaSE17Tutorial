package cc.openhome;

import static java.lang.System.out;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        out.println("Main thread 開始...");

        var threadB = new Thread(() -> {
            out.println("Thread B 開始...");
            for(var i = 0; i < 5; i++) {
                out.println("Thread B 執行...");
            }
            out.println("Thread B 將結束...");
        });

        threadB.start();
        threadB.join(); // Thread B 加入 Main thread 流程

        out.println("Main thread將結束...");
    }
}
