package Coding Assignments.Assignment 4;

public abstract class Q3Quadrilateral {
    private Point topLeft;
    private Point topRight;
    private Point bottomLeft;
    private Point bottomRight;

    // constructor for Quadrilateral
    public Q3Quadrilateral(Q3Point topLeft, Q3Point topRight, Q3Point bottomLeft, Q3Point bottomRight) {
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    // getter for topLeft
    public Q3Point getTopLeft() {
        return topLeft;
    }
    
    // setter for topLeft
    public void setTopLeft(Q3Point topLeft) {
        this.topLeft = topLeft;
    }

    // getter for topRight
    public Q3Point getTopRight() {
        return topRight;
    }
    
    // setter for topRight
    public void setTopRight(Q3Point topRight) {
        this.topRight = topRight;
    }

    // getter for bottomLeft
    public Q3Point getBottomLeft() {
        return bottomLeft;
    }

    // setter for bottomLeft
    public void setBottomLeft(Q3Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    // getter for bottomRight
    public Q3Point getBottomRight() {
        return bottomRight;
    }

    // setter for bottomRight
    public void setBottomRight(Q3Point bottomRight) {
        this.bottomRight = bottomRight;
    }
    
    // Abstract method to calculate the area of the Quadrilateral
    public abstract double getArea();
    
    // overriding toString method
    @Override
    public String toString() {
        return "Quadrilateral{" + "topLeft=" + topLeft + ", topRight=" + topRight + ", bottomLeft=" + bottomLeft + ", bottomRight=" + bottomRight + '}';
    }
}