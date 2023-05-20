package Coding Assignments.Assignment 4;

public class Q3Rectangle extends Q3Parallelogram {
    // constructor for Rectangle
    public Q3Rectangle(Q3Point topLeft, Q3Point topRight, Q3Point bottomLeft, Q3Point bottomRight) {
    super(topLeft, topRight, bottomLeft, bottomRight);
    }

    // override getArea method
    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }

    // gets width
    public double getWidth() {
        return Math.abs(getTopLeft().getX() - getTopRight().getX());
    }

    // gets height
    public double getHeight() {
        return Math.abs(getTopLeft().getY() - getBottomLeft().getY());
    }

    // override toString method
    @Override
    public String toString() {
        return "Rectangle: " + super.toString() + "\nwidth: " + getWidth() + "\nheight: " + getHeight();
    }
}