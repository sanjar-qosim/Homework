package interfaces.shape;

public class Circle implements Shape {

    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
