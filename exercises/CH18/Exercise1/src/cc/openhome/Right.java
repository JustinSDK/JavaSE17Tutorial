package cc.openhome;

public record Right<E, R>(R value) implements Either<E, R> {
    @Override
    public R right() {
        return value;
    }
}