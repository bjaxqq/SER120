package week12.Shape;

public class Rectangle extends Shape { // Inheriting from Shape
    // Constructor for Rectangle
    public Rectangle(double height, double width) {
        super(height, width); // Setting height and width
    }

    // Calculating the area
    public double getArea() {
        return super.getHeight() * super.getWidth(); // Formula for area
    }

    // Calculating the perimeter
    public double getPerimeter() {
        return 2 * (super.getHeight() + super.getWidth()); // Forumla for perimeter
    }
}