package cc.openhome;

public class Level2 {
    public static void main(String[] args) {
        var score = 88;
        var quotient = score / 10;
        var level = '\0';
        
        switch(quotient) { 
            case 10: 
            case 9: 
                level = 'A';
                break; 
            case 8: 
                level = 'B';
                break; 
            case 7: 
                level = 'C';
                break; 
            case 6: 
                level = 'D';
                break; 
            default: 
                level = 'E';
        }
        System.out.printf("±o¤Àµ¥¯Å¡G%c%n", level);
    }
}
