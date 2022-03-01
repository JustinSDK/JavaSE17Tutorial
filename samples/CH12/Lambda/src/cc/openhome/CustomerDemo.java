package cc.openhome;

import static java.lang.System.out;
import java.util.*;
import static java.util.Comparator.comparing;

public class CustomerDemo {
    public static void main(String[] args) {
        var customers = Arrays.asList(
                new Customer("Justin", "Lin", 804),
                new Customer("Monica", "Huang", 804),
                new Customer("Irene", "Lin", 804)
        );

        var byLastName = comparing(Customer::lastName);

        customers.sort(
             byLastName
                .thenComparing(Customer::firstName)
                .thenComparing(Customer::zipCode)
        );

        customers.forEach(out::println);
    }
}

record Customer(String firstName, String lastName, Integer zipCode) {}
