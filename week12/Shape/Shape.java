package week12.Shape;

// Base/Super class for Circle, Rectangle, and Triangle
public class Shape {
    // Creating the height and width variables
    private double height;
    private double width;

    // Constructor for Shape with height and width
    public Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // Getter method for height
    public double getHeight() {
        return height;
    }

    // Setter method for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Setter method for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Default for area
    public double getArea() {
        return 0;
    }

    // Default for perimeter
    public double getPerimeter() {
        return 0;
    }
}
