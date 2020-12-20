package Shape;

public class Square extends Shape {

    public double edge;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public Square() {
        this(1,"none");
    }

    public Square(double edge, String color) {
        this.edge = edge;
        this.color = color;
    }

    @Override
    public double area() {
        return Math.pow(edge,2);
    }

    @Override
    public void ToString() {
        System.out.println("----------Square----------");
        System.out.println("Area: "+area());
        System.out.println("Color: "+color);
    }

}