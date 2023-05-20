package Coding Assignments.Assignment 4;

public class Q3Trapezoid extends Q3Quadrilateral {
    private double h;
    
    // constructor for Trapezoid
    public Q3Trapezoid(Q3Point topLeft, Q3Point topRight, Q3Point bottomLeft, Q3Point bottomRight, double h) {
        super(topLeft, topRight, bottomLeft, bottomRight);
        this.h = h;
    }
    
    // override getArea method
    @Override
    public double getArea() {
        double b1 = Math.abs(getTopLeft().getY() - getTopRight().getY());
        double b2 = Math.abs(getBottomLeft().getY() - getBottomRight().getY());
        return (b1 + b2) * h / 2;
    }
    
    // override toString method
    @Override
    public String toString() {
        return "Trapezoid: " + super.toString() + "\nheight: " + h;
    }
}