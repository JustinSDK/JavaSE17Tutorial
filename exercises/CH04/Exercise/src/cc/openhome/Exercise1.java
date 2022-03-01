package cc.openhome;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.print("求幾個費式數？");
                
        var fibonacci = new int[new Scanner(System.in).nextInt()]; 
        fibonacci[1] = 1; 

        for(var i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; 
        }
        
        for(var f : fibonacci) {
            System.out.printf("%d ", f); 
        }
        System.out.println();
    }    
}
