package Coding Assignments.Assignment 4;

public class Q3Point {
	// x,y coordinates for a point
	private int x;
	private int y;
	
	// Constructors
	public Q3Point() {
		x = 0;
		y = 0;
	}

	public Q3Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "x is: " + x + ", y is: " + y;
	}
}