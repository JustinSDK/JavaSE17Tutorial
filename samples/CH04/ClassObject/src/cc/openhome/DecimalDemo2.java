package cc.openhome;

import java.math.BigDecimal;

public class DecimalDemo2 {
    public static void main(String[] args) {
        var op1 = new BigDecimal("0.1");
        var op2 = new BigDecimal("0.1");
        var op3 = new BigDecimal("0.1");
        var result = new BigDecimal("0.3");
        
        if(op1.add(op2).add(op3).equals(result)) {
            System.out.println("���� 0.3");
        }
        else {
            System.out.println("������ 0.3");
        }
    }
} 
