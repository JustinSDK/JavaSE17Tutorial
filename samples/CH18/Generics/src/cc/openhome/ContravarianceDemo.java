package cc.openhome;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.Comparator;

public class ContravarianceDemo {
    public static void main(String[] args) {
        Comparator<Shape> areaComparator = (s1, s2) -> {
            var diff = s1.area() - s2.area();
            if(diff == 0.0) {
                return 0;
            }
            return diff > 0 ? 1 : -1;
        };
        
        var circles = new Group<Circle>(
                new Circle(0, 0, 10), new Circle(0, 0, 20));
        
        circles.sort(areaComparator);
        Arrays.stream(circles.things).forEach(out::print);
        out.println();
        
        var squares = new Group<Square>(
                new Square(0, 0, 20), new Square(0, 0, 30));
        
        squares.sort(areaComparator);
        Arrays.stream(squares.things).forEach(out::print);
        out.println();
    }
}
