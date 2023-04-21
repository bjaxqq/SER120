package week12.Shape;

public class Triangle extends Shape { // Inheriting from Shape
    // Constructor for Triangle
    public Triangle(double height, double base) {
        super(height, base);
    }

    // Calculating the area
    public double getArea() {
        return super.getHeight() * super.getWidth() / 2;
    }

    // Calculating the perimeter
    // Creates a hypotenuse to solve for a right triangle
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(super.getHeight() * super.getHeight() + super.getWidth() * super.getWidth());
        return super.getHeight() + super.getWidth() + hypotenuse;
    }
}