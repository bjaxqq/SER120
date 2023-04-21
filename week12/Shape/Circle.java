package week12.Shape;

public class Circle extends Shape { // Inheriting from Shape
    private double radius;

    // Constructor for Circle class
    public Circle(double radius) {
        super(2 * radius, 2 * radius); // Setting height and width
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
        super.setHeight(2 * radius); // Update Shape height
        super.setWidth(2 * radius); // Update Shape width
    }

    // Calculating the area
    public double getArea() {
        return 3.14 * radius * radius; // Formula for area
    }

    // Calculating the perimeter
    public double getPerimeter() {
        return 2 * 3.14 * radius; // Formula for perimeter
    }
}