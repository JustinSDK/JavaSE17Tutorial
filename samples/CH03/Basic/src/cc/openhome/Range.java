package cc.openhome;

public class Range {
    public static void main(String[] args) {
        // byte�Bshort�Bint�Blong �d��
        System.out.printf("%d ~ %d%n", 
                Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%d ~ %d%n", 
                Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%d ~ %d%n", 
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%d ~ %d%n", 
                Long.MIN_VALUE, Long.MAX_VALUE);
        // float�Bdouble ��׽d��
        System.out.printf("%d ~ %d%n", 
                Float.MIN_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("%d ~ %d%n", 
                Double.MIN_EXPONENT, Double.MAX_EXPONENT);
        // char �i�x�s���X���d��
        System.out.printf("%h ~ %h%n", 
                Character.MIN_VALUE, Character.MAX_VALUE);
        // boolean ����ӭ�
        System.out.printf("%b ~ %b%n", 
                Boolean.TRUE, Boolean.FALSE);
    }    
}
