package cc.openhome;

import java.util.function.Function;

public sealed interface Either<E, R> permits Left<E, R>, Right<E, R> {
    default E left() {
        throw new IllegalStateException("nothing left");
    }
    default R right() {
        throw new IllegalStateException("nothing right");
    }
}