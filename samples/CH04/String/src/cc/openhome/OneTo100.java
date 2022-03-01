package cc.openhome;

public class OneTo100 {
    public static void main(String[] args) {
        var oneTo100 = new StringBuilder();
        for (var i = 1; i < 100; i++) {
            oneTo100.append(i).append('+');
        }
        System.out.println(oneTo100.append(100).toString());
    }
}
