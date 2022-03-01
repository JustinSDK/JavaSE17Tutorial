package cc.openhome;

public class Level3 {
    public static void main(String[] args) {
        var score = 88;
        var quotient = score / 10;
        var level = switch(quotient) { 
            case 10, 9 -> 'A';
            case 8     -> 'B';
            case 7     -> 'C'; 
            case 6     -> 'D'; 
            default    -> 'E';
        };
        System.out.printf("±o¤Àµ¥¯Å¡G%c%n", level);
    }
}