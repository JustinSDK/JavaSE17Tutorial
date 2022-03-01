package cc.openhome;

import static java.lang.System.out;

public class ClassLoaderHierarchy {
    public static void main(String[] args) {
        var clz = ClassLoaderHierarchy.class;
        out.println(clz.getClassLoader());
        out.println(clz.getClassLoader().getParent());
        out.println(clz.getClassLoader().getParent().getParent());
    }
}
