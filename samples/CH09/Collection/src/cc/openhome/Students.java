package cc.openhome;

import java.util.*;

class Student {
    private final String name;
    private final String number;
    Student(String name, String number) {
        this.name = name;
        this.number = number;
    }
    
    String name() {
    	return this.name;
    }
    
    String number() {
    	return this.number();
    }
    
    @Override
    public String toString()  {
        return "(%s, %s)".formatted(name, number);
    }
}

public class Students {
    public static void main(String[] args) {
        var students = new HashSet();
        students.add(new Student("Justin", "B835031"));
        students.add(new Student("Monica", "B835032"));
        students.add(new Student("Justin", "B835031"));
        System.out.println(students);
    }
}