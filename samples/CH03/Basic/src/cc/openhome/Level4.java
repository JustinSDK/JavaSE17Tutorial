package cc.openhome;

public class Level4 {
    public static void main(String[] args) {
        var score = 88;
        var quotient = score / 10;
        var level = switch(quotient) { 
            case 10, 9:
                yield 'A';
            case 8:
                yield 'B';
            case 7:
                yield 'C'; 
            case 6:
                yield 'D'; 
            default:
                yield 'E';
        };
        System.out.printf("±o¤Àµ¥¯Å¡G%c%n", level);
    }
}