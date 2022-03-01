package cc.openhome;

import java.util.*;

public class Average3 {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        var sum = 0.0;
        var count = 0;
        while(true) {
            try {
                int number = console.nextInt();
                if(number == 0) {
                    break;
                }
                sum += number;
                count++;
            } catch (InputMismatchException ex) {
                System.out.printf("略過非整數輸入：%s%n", console.next());
            }
        }
        System.out.printf("平均 %.2f%n", sum / count);
    }
}