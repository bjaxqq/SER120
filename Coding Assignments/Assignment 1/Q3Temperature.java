package Coding Assignments.Assignment 1;

// creating Temperature class
public class Q3Temperature {
    // creating temperature member variable
    private double temperature;
    
    public Temperature() {
        this.temperature = 0;
    }
    
    public Temperature(double temperature) {
        this.temperature = temperature;
    }
    
    // setters and getters for Temp
    public void setTemp(double temperature) {
        this.temperature = temperature;
    }
    public double getTemp() {
        return this.temperature;
    }
    
    // status for Ethyl freezing or boiling
    public boolean ethylFreezeStatus() {
        return (this.temperature <= -173);
    }
    public boolean ethylBoilStatus() {
        return (this.temperature >= 172);
    }
    
    // status for Oxygen freezing or boiling
    public boolean oxygenFreezeStatus() {
        return (this.temperature <= -362);
    }
    public boolean oxygenBoilStatus() {
        return (this.temperature >= -306);
    }
    
    // status for Water freezing or boiling
    public boolean waterFreezeStatus() {
        return (this.temperature <= 32);
    }
    public boolean waterBoilStatus() {
        return (this.temperature >= 212);
    }
}