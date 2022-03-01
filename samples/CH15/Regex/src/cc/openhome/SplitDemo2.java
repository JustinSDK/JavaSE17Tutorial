package cc.openhome;

public class SplitDemo2 {
    public static void main(String[] args) {
        for(var str : "Justin dog Monica doggie Irene".split("dog")) {
            System.out.println(str.trim());
        }
    }
}
