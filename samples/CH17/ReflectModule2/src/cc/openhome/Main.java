package cc.openhome;

public class Main {
    public static void main(String[] args) throws ReflectiveOperationException {
        var clz = Class.forName("cc.openhome.reflect.Some");

        var constructor = clz.getDeclaredConstructor(String.class);
        var target = constructor.newInstance("Some object");
        clz.getDeclaredMethod("doSome").invoke(target);
    }
}
