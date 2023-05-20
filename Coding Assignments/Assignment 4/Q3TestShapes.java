package Coding Assignments.Assignment 4;

public class Q3TestShapes {
    public static void main(String[] args) {
        // create points for the shapes
        Q3Point p1 = new Q3Point(10, 0);
        Q3Point p2 = new Q3Point(5, 5);
        Q3Point p3 = new Q3Point(5, 10);
        Q3Point p4 = new Q3Point(5, 0);

        // create objects of all classes
        Q3Trapezoid trapezoid = new Q3Trapezoid(p1, p2, p3, p4, 3);
        Q3Parallelogram parallelogram = new Q3Parallelogram(p1, p2, p3, p4);
        Q3Rectangle rectangle = new Q3Rectangle(p1, p2, p3, p4);
        Q3Square square = new Q3Square(p1, p2, p3, p4);

        // output the area of each object
        System.out.println(trapezoid.toString() + "\nArea: " + trapezoid.getArea() + "\n");
        System.out.println(parallelogram.toString() + "\nArea: " + parallelogram.getArea() + "\n");
        System.out.println(rectangle.toString() + "\nArea: " + rectangle.getArea() + "\n");
        System.out.println(square.toString() + "\nArea: " + square.getArea() + "\n");
    }
}