package cc.openhome;

public class Level5 {
    public static void main(String[] args) {
        final String warning = "（喔喔！不及格了！）";
        
        var score = 59;
        var quotient = score / 10;
        var level = switch(quotient) {
            case 10, 9 -> "A";
            case 8     -> "B";
            case 7     -> "C"; 
            case 6     -> "D"; 
            default    -> {
                String message = "E" + warning;
                yield message ;
            }
        };
        System.out.printf("得分等級：%s%n", level);
    }
}