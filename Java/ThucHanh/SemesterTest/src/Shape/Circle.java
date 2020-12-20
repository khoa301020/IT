package Shape;

public class Circle extends Shape {

    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    final double pi = Math.PI;

    public Circle() {
        this(1,"none");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double area() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public void ToString() {
        System.out.println("----------Circle----------");
        System.out.println("Area: "+area());
        System.out.println("Color: "+color);
    }
}