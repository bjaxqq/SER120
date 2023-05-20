package Coding Assignments.Assignment 4;

public class Q3Parallelogram extends Q3Trapezoid {
    // constructor for Parallelogram
    public Q3Parallelogram(Q3Point topLeft, Q3Point topRight, Q3Point bottomLeft, Q3Point bottomRight) {
        super(topLeft, topRight, bottomLeft, bottomRight, getHeight(topLeft, bottomLeft, bottomRight));
    }

    // calculating the height
    private static double getHeight(Q3Point topLeft, Q3Point bottomLeft, Q3Point bottomRight) {
        return Math.abs(topLeft.getY() - bottomLeft.getY());
    }

    // override toString method
    @Override
    public String toString() {
        return "Parallelogram: " + super.toString() + "\nheight: " + getHeight(getTopLeft(), getBottomLeft(), getBottomRight());
    }
}