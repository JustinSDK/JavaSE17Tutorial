package cc.openhome;

public class Exercise1 {
    public static void main(String[] args) {
        var m = 1000;
        var n = 495;
        
        while(n != 0) {
            var r = m % n;
            m = n;
            n = r;
        }
        System.out.printf("最大公因數 %d%n", m);
    }
}
