package cc.openhome;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        
        var sum = 0;
        var number = 0;
        do {
            System.out.print("輸入數字：");
            number = Integer.parseInt(console.nextLine());
            sum += number;
        } while(number != 0);
        System.out.println("總合：" + sum);
    }
}
