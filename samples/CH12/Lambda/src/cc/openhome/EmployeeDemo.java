package cc.openhome;

import static java.lang.System.out;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {
        var employees = List.of(
                new Employee("Justin", 39, Gender.MALE),
                new Employee("Monica", 36, Gender.FEMALE),
                new Employee("Irene", 6, Gender.FEMALE)
        );
        
        var sum = employees.stream()
                .filter(employee -> employee.gender() == Gender.MALE)
                .mapToInt(Employee::age)
                .sum();

        var average = employees.stream()
                .filter(employee -> employee.gender() == Gender.MALE)
                .mapToInt(Employee::age)
                .average()
                .getAsDouble();

        var max = employees.stream()
                .filter(employee -> employee.gender() == Gender.MALE)
                .mapToInt(Employee::age)
                .max()
                .getAsInt();
        
        List.of(sum, average, max).forEach(out::println);
    }
}

enum Gender { FEMALE, MALE }

record Employee(String name, Integer age, Gender gender) {}
