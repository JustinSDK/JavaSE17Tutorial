package cc.openhome;

import java.util.*;

record Customer(String id, String name, int age) {}

public class Sort {
    public static void main(String[] args) {
        List accounts = Arrays.asList(
                new Customer("X1234", "Justin", 46),
                new Customer("X5678", "Monica", 43),
                new Customer("X2468", "Irene", 13)
        );
        Collections.sort(accounts);
        System.out.println(accounts);
    }
}
