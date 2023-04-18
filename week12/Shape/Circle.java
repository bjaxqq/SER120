package week12.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(2 * radius, 2 * radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        super.setHeight(2 * radius);
        super.setWidth(2 * radius);
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}