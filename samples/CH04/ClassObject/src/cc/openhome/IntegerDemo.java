package cc.openhome;

public class IntegerDemo {
    public static void main(String[] args) {
        int data1 = 10;
        int data2 = 20;
        
        var wrapper1 = Integer.valueOf(data1);
        var wrapper2 = Integer.valueOf(data2);
        
        System.out.println(data1 / 3);
        System.out.println(wrapper1.doubleValue() / 3);
        System.out.println(wrapper1.compareTo(wrapper2));
    }
}
