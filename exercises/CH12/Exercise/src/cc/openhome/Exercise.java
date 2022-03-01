package cc.openhome;

import static java.lang.System.out;

public class Exercise {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        for(var i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        
        numbers.filter(n -> n > 5).forEach(out::println);
        numbers.map(n -> n * 2).forEach(out::println);
        out.println(numbers.reduce((total, n) -> total + n).orElse(0));
        out.println(new ArrayList<Integer>().reduce((total, n) -> total + n).orElse(0));
    }
}
