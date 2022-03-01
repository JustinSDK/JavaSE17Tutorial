package cc.openhome;

public class SimpleLinkedList {
    private class Node {
        Node(Object o) {
            this.o = o;
        }
        Object o;
        Node next;
    }
    
    private Node first;

    public void add(Object elem) {
        var node = new Node(elem);        
        if(first == null) {
            first = node;
        }
        else {
            append(node);
        }
    }

    private void append(Node node) {
        var last = first;
        while(last.next != null) {
            last = last.next;
        }
        last.next = node;
    }
    
    public int size() {
        var count = 0;
        var last = first;
        while(last != null) {
            last = last.next;
            count++;
        }
        return count;
    }
    
    public Object get(int index) {
        checkSize(index);
        return findElemOf(index);        
    }

    private void checkSize(int index) throws IndexOutOfBoundsException {
        var size = size();
        if(index >= size) {
            throw new IndexOutOfBoundsException(
            		"Index: %d, Size: %d".formatted(index, size));
        }
    }

    private Object findElemOf(int index) {
        var count = 0;
        var last = first;
        while(count < index) {
            last = last.next;
            count++;
        }
        return last.o;
    }
}