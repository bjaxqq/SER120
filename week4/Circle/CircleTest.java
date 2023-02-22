// creating main function
public static void main(String[] args) {
    // calling the default constructor from Circle
    Circle circ1 = new Circle();
    // calling the overloaded constructor from Circle
    Circle circ2 = new Circle(5.0);

    System.out.println("Area of Circle 1: " + circ1.getArea());
    // displaying area for circ2
    System.out.println("Area of Circle 2: " + circ2.getArea());

    // Creating an array of 5 circle objects from default constructor
    Circle[] c1 = new Circle[5];
    for (int i = 0; i < c1.length; i++) {
        c1[i] = new Circle();
        System.out.println("The area of Circle " + (i+1) + ": " + c1[i].getArea());
    }

    // Creating an array of 5 circle objects with initialized radii
    double[] radI = {12, 7, 9, 14, 18}; // takes given radii
    Circle[] c2 = new Circle[5];
    for (int i = 0; i < c2.length; i++) {
        c2[i] = new Circle(radI[i]);
        System.out.println("The area of Circle " + (i+1) + ": " + c2[i].getArea());
    }
}