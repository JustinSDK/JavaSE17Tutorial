package cc.openhome;

import cc.openhome.util.Some;

public class OpensDemo {
    public static void main(String[] args) throws Exception {
        var s = new Some();
        if(args.length != 0 && "opens".equals(args[0])) {
            s.openTo(OpensDemo.class.getModule());
        }
        var f = Some.class.getDeclaredField("some");
        f.setAccessible(true);
        System.out.println(f.get(s));
    }
}
