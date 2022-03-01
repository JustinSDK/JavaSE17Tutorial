package cc.openhome;

public class CovarianceDemo {
    public static void main(String[] args) {
        var c1 = new Node<>(new Circle(0, 0, 10), null);
        var c2 = new Node<>(new Circle(0, 0, 20), c1);
        var c3 = new Node<>(new Circle(0, 0, 30), c2);
        
        var s1 = new Node<>(new Square(0, 0, 15), null);
        var s2 = new Node<>(new Square(0, 0, 30), s1);

        show(c3);
        show(s2);
    }
    
    public static void show(Node<? extends Shape> n) { 
        Node<? extends Shape> node = n;
        do {
            System.out.println(node.value);
            node = node.next;
        } while(node != null);
    }
} 
