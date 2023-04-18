package week12.Shape;

public class Triangle extends Shape {
    public Triangle(double height, double base) {
        super(height, base);
    }

    public double getArea() {
        return super.getHeight() * super.getWidth() / 2;
    }

    public double getPerimeter() {
        double hypotenuse = Math.sqrt(super.getHeight() * super.getHeight() + super.getWidth() * super.getWidth());
        return super.getHeight() + super.getWidth() + hypotenuse;
    }
}