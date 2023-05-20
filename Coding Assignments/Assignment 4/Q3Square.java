package Coding Assignments.Assignment 4;

public class Q3Square extends Q3Rectangle {
    // constructor for Square
    public Q3Square(Q3Point p1, Q3Point p2, Q3Point p3, Q3Point p4) {
        super(p1, p2, p3, p4);
    }

    // override toString method
    @Override
    public String toString() {
        return "Square: " + super.toString();
    }
}