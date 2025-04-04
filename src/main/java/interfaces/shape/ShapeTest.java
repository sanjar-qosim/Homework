package interfaces.shape;

public class ShapeTest {

    public static void main(String[] args) {

        Shape [] shapes = {new Circle(5)};

        for (Shape tmp : shapes) {
            System.out.println(tmp.getArea());
            System.out.println(tmp.getPerimeter());
        }
    }
}
