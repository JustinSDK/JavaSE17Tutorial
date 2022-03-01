package cc.openhome;

import static java.lang.System.out;

public class ModuleInfo {
    public static void main(String[] args) throws Exception {
        var clz = Class.forName(args[0]);
        
        Module current = ModuleInfo.class.getModule();
        Module module = clz.getModule();
        
        out.printf("%s 模組%s讀取 %s 類別所在之 %s 模組%n",
                current.getName(), 
                current.canRead(module) ? "可" : "不可", 
                args[0],
                module.getName());
        
        out.println("exports 的套件：");
        module.getPackages().stream()
                .filter(module::isExported)
                .forEachOrdered(out::println);
    }
}
