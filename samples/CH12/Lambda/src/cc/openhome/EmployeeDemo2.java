package cc.openhome;

import static java.lang.System.out;
import java.util.List;

public class EmployeeDemo2 {
    public static void main(String[] args) {
        var	employees = List.of(
                new Employee2("Justin", 39, Gender2.MALE),
                new Employee2("Monica", 36, Gender2.FEMALE),
                new Employee2("Irene", 6, Gender2.FEMALE)
        );
        
        var sum = employees.stream()
                .filter(employee -> employee.gender() == Gender2.MALE)
                .mapToInt(Employee2::age)
                .reduce((total, age) ->  total + age)
                .getAsInt();

        var males = employees.stream()
                .filter(employee -> employee.gender() == Gender2.MALE)
                .count();
        
        var average = employees.stream()
                .filter(employee -> employee.gender() == Gender2.MALE)
                .mapToInt(Employee2::age)
                .reduce((total, age) ->  total + age)
                .getAsInt() / males;

        var max = employees.stream()
                .filter(employee -> employee.gender() == Gender2.MALE)
                .mapToInt(Employee2::age)
                .reduce(0, (currMax, age) -> age > currMax ? age : currMax);
        
        List.of(sum, average, max).forEach(out::println);
    }
}

enum Gender2 { FEMALE, MALE }

record Employee2(String name, Integer age, Gender2 gender) {}