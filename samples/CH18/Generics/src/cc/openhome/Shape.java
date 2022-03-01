package cc.openhome;

interface Shape {
    double area();
}

record Circle(double x, double y, double radius) implements Shape {
    @Override
    public double area() {
        return radius * radius * 3.14159;
    }
}

record Square(double x, double y, double length) implements Shape {
    @Override
    public double area() {
        return length * length;
    }
}
