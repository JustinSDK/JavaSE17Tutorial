package cc.openhome;

public class Main {

    public static void main(String[] args) {
        Node<Shape> circle = new Node<>(new Circle(0, 0, 10), null);
        Node<? super Square> node1 = circle;
        Node<? super Circle> node2 = circle;

    }

}
