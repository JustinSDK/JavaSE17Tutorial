package cc.openhome;

import java.util.function.Function;

public sealed interface Either<E, R> permits Left<E, R>, Right<E, R> {
    default E left() {
        throw new IllegalStateException("nothing left");
    }
    default R right() {
        throw new IllegalStateException("nothing right");
    }
      
    default <U> Either<E, U> map(Function<? super R, ? extends U> mapper) {
        if(this instanceof Right) {
            return new Right<>(mapper.apply(this.right()));
        }
        return new Left<>(this.left());
    }
    
    default <U> Either<E, U> flatMap(Function<? super R, Either<E, U>> mapper) {
        if(this instanceof Right) {
            return mapper.apply(this.right());
        }
        return new Left<>(this.left());
    }
    
    default R orElse(Function<? super E, R> mapper) {
        if(this instanceof Right) {
            return this.right();
        }
        return mapper.apply(this.left());
    }
}