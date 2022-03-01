package cc.openhome;

import static java.lang.System.out;
import java.util.List;

public class StackTraceDemo2 {   
    public static void main(String[] args) throws InterruptedException {
        var t = new Thread(() -> c());
        t.start();
        t.join(); // 這是為了能循序顯示個別的堆疊追蹤
        
        c();
    }

    static void c() {
        b();
    }

    static void b() {
        a();
    }

    static void a() {
        var currentThread = Thread.currentThread();
        var stackTrace = currentThread.getStackTrace();
        
        out.printf("Stack trace of thread %s:%n", currentThread.getName());
        List.of(stackTrace).forEach(out::println);
    }
}
