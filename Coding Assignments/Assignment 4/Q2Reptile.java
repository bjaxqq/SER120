package Coding Assignments.Assignment 4;

public class Q2Reptile extends Q2Vertebrate {
	private double eggSize;
	
	public Q2Reptile(double brainSize, double eggSize) {
		super(brainSize);
		this.eggSize = eggSize;
	}
	
	public String toString() {
		return super.toString() + "\negg size: " + this.eggSize;
	}
	
	public static void main(String a[]) {
		Reptile r = new Reptile(.7,2.5);
		System.out.println(r);
	}
}