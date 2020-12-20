package Shape;

public class TestShape {
    public static void main(String[] args) {
        // Shape.Square test
        Shape shape1 = new Square(5,"red");
        shape1.ToString();

        // Shape.Circle test
        Shape shape2 = new Circle(3,"blue");
        shape2.ToString();
    }
}