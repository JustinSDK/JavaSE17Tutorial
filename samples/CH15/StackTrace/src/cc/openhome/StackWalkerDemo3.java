package cc.openhome;

import static java.lang.StackWalker.Option.*;
import static java.lang.System.out;
import java.util.List;

public class StackWalkerDemo3 {   
    public static void main(String[] args) throws Exception {
        StackWalkerDemo3.class.getDeclaredMethod("c").invoke(null);
    }

    static void c() {
        b();
    }

    static void b() {
        a();
    }

    static void a() {
        var stackWalkers = List.of(
            StackWalker.getInstance(),
            StackWalker.getInstance(SHOW_REFLECT_FRAMES),
            StackWalker.getInstance(SHOW_HIDDEN_FRAMES)
        );
                
        stackWalkers.forEach(
            stackWalker -> {
                out.println();
                stackWalker.forEach(out::println);
            }
        );
    }
}
