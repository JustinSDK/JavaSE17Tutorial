package cc.openhome;

import static java.lang.System.out;

public class StackWalkerDemo {   
    public static void main(String[] args) {
        c();
    }

    static void c() {
        b();
    }

    static void b() {
        a();
    }

    static void a() {
        out.printf("Stack trace of thread %s:%n", Thread.currentThread().getName());
        var stackWalker = StackWalker.getInstance();
        stackWalker.forEach(out::println);
    }
}
