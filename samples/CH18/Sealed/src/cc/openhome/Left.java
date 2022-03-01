package cc.openhome;

public record Left<E, R>(E value) implements Either<E, R> {
    @Override
    public E left() {
        return value;
    }
}