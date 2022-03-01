package cc.openhome;

import java.lang.module.Configuration;
import java.lang.module.ModuleFinder;
import java.nio.file.Paths;
import java.util.Set;

public class ModuleLayerDemo {

    public static void main(String[] args) throws Exception {
        ModuleFinder finder = ModuleFinder.of(Paths.get("C:\\workspace\\One\\dist"));

        ModuleLayer boot = ModuleLayer.boot();
        Configuration cf = boot.configuration()
                .resolve(finder, ModuleFinder.of(), Set.of("one"));

        ClassLoader scl = ClassLoader.getSystemClassLoader();
        ModuleLayer layer = boot.defineModulesWithOneLoader(cf, scl);

        Class<?> c = layer.findLoader("one")
                          .loadClass("cc.openhome.one.OneClass");
    }
}
