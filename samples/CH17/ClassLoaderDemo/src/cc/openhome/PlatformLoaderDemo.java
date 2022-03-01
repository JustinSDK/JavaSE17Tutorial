package cc.openhome;

public class PlatformLoaderDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader platform = PlatformLoaderDemo.class
                                    .getClassLoader().getParent();
        System.out.println(platform);
        
        var clz = platform.loadClass("cc.openhome.Some");
        System.out.println(clz.getClassLoader());
    }
}
