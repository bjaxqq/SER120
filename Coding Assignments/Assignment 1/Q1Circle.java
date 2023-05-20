package Coding Assignments.Assignment 1;

// creating Circle class
public class Q1Circle {
    // radius variable
    private double radius;
     // setting "PI" to the value of pi (3.14)
    private static final double PI = 3.14;

    // default constructor
    public Circle() {
        radius = 0.0;
    }

    // overloaded constructor
    public Circle(double r) {
        radius = r;
    }

    // setters and getters for radius
    public void setRadius(double r) {
        this.radius = r;
    }
    public double getRadius() {
        return this.radius;
    }

    // returns area of the circle
    public double getArea() {
        return PI * radius * radius;
    }
}