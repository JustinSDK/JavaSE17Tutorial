package cc.openhome;

public class EitherDemo {
    static Either<String, Integer> div(Integer a, Integer b) {
        if(b == 0) {
            return new Left<>("除零錯誤 %d / %d".formatted(a, b));
        }
        return new Right<>(a / b);
    }

    public static void main(String[] args) {
        Integer a = Integer.parseInt("10");
        Integer b = Integer.parseInt("0");
        
        Either<String, Integer> either = div(a, b);
        // 檢查傳回結果
        if(either instanceof Left) {          // 如果有錯誤
            System.err.println(either.left());
        }
        else if(either instanceof Right) {    // 若是正確值
            System.out.printf("%d / %d = %d%n", a, b, either.right());
        }
    }

}
