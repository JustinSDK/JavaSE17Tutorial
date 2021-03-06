package cc.openhome;

import java.util.Arrays;
import java.util.Comparator;

public class Group<T> {
    public T[] things;

    public Group(T... things) {
        this.things = things;
    }

    public void sort(Comparator<? super T> comparator) {
        Arrays.sort(things, comparator);
    }
}
