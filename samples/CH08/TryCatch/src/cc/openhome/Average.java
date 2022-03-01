package cc.openhome;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        var sum = 0.0;
        var count = 0;
        while(true) {
            int number = console.nextInt();
            if(number == 0) {
                break;
            }
            sum += number;
            count++;
        }
        System.out.printf("平均 %.2f%n", sum / count);
    }
}