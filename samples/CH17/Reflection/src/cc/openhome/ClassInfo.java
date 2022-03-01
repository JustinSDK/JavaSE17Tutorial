package cc.openhome;

import static java.lang.System.out;

public class ClassInfo {
    public static void main(String[] args) {
        Class clz = String.class;
        
        out.printf("類別名稱：%s%n", clz.getName());
        out.printf("是否為介面：%s%n", clz.isInterface());
        out.printf("是否為基本型態：%s%n", clz.isPrimitive());
        out.printf("是否為陣列物件：%s%n", clz.isArray());
        out.printf("父類別名稱：%s%n", clz.getSuperclass().getName());
        out.printf("所在模組：%s%n", clz.getModule().getName());
    }    
}
