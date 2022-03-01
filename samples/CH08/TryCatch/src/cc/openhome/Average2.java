package cc.openhome;

import java.util.*;

public class Average2 {
    public static void main(String[] args) {
        try {
            var console = new Scanner(System.in);
            var sum = 0.0;
            var count = 0;
            while (true) {
                var number = console.nextInt();
                if(number == 0) {
                    break;
                }
                sum += number;
                count++;
            }
            System.out.printf("平均 %.2f%n", sum / count);
        } catch (InputMismatchException ex) {
            System.out.println("必須輸入整數");
        }
    }
}