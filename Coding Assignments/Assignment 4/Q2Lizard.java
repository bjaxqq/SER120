package Coding Assignments.Assignment 4;

// inherits Repitle class
public class Q2Lizard extends Q2Reptile {
    // creates lizard length variable
    private int lizardLength;
    // creates lizard location variable
    private String lizardLocation;

    // constructor for Lizard
    public Lizard (double brainSize, double eggSize, int lizardLength, String lizardLocation) {
        // calls superclass constructor
        super(brainSize, eggSize);
        this.lizardLength = lizardLength;
        this.lizardLocation = lizardLocation;
    }

    // overrides String class
    @Override
    public String toString() {
        return super.toString() + "\nlizard length: " + this.lizardLength + "\nlizard location: " + this.lizardLocation;
    }
}