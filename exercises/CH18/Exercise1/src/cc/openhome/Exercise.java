package cc.openhome;

public class Exercise {
    static Either<String, Integer> div(Integer a, Integer b) {
        if(b == 0) {
            return new Left<>("除零錯誤 %d / %d".formatted(a, b));
        }
        return new Right<>(a / b);
    }

    public static void main(String[] args) {
        Integer a = Integer.parseInt("10");
        Integer b = Integer.parseInt("0");

        System.out.println(
            div(a, b).map(r -> r * 3.14159)
                     .flatMap(r -> new Right<>(String.valueOf(r)))
                     .orElse(err -> "Infinity")
        );
    }
}
