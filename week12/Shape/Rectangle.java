package week12.Shape;

public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }

    public double getArea() {
        return super.getHeight() * super.getWidth();
    }

    public double getPerimeter() {
        return 2 * (super.getHeight() + super.getWidth());
    }
}