package cc.openhome;

import java.util.Arrays;

public class ArrayList {
    private Object[] elems;
    private int next;
    
    public ArrayList() {
        this(16);
    }
   
    public ArrayList(int capacity) {
        elems = new Object[capacity];
    }
    
    public void add(Object o) {
        if(next == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[next++] = o;
    }
    
    public Object get(int index) {
        return elems[index];
    }
    
    public int size() {
        return next;
    }

    @Override
    public String toString() {
        var desc = new StringBuilder();
        desc.append("ArrayList{");
        var last = next - 1;
        for(var i = 0; i < last; i++) {
            desc.append(elems[i]).append(", ");
        }
        desc.append(elems[last]).append("}");
        return desc.toString();
    }
}
