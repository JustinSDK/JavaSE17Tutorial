package cc.openhome;

import static java.lang.StackWalker.Option.RETAIN_CLASS_REFERENCE;
import static java.lang.System.out;

public class StackWalkerDemo2 {   
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
        out.printf("Stack trace of thread %s:%n", 
                Thread.currentThread().getName());
        
        var stackWalker = StackWalker.getInstance(RETAIN_CLASS_REFERENCE);
        out.printf("Caller class %s%n", stackWalker.getCallerClass().getName());
        
        stackWalker.forEach(stackFrame -> {
            out.printf("%s.%s%n", 
                    stackFrame.getDeclaringClass(), 
                    stackFrame.getMethodName());
        });
    }
}
