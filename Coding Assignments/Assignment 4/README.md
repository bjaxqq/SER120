# Assignment 4

Note: Please refer to the grading rubric in the Syllabus.

Do not forget to adequately comment. Follow the styling guidelines. Copying code from any source or discussing solutions is strictly prohibited, and if caught then it would be considered plagiarism. Refer Syllabus for more details.

### Q1

##### Instructions
Based on your understanding of the material discuss in detail (in your own words): [In 500 words total]
- What do you understand by Inheritance?
- Why declaring data as protected doesn’t serve any meaningful purpose?
- How a method is searched and called in an inheritance hierarchy?
- How does constructor calling work in an inheritance hierarchy?

### Q2

##### Instructions
Derive a class Lizard from Reptile (Reptile & Vertebrate is provided to you) with private data members as int lizardLength, String lizardLocation (lizardLocation values could be tropical, dry, cold etc.). Add a 4-argument constructor in this class to initialize values of brainSize, eggSize, lizardLength & lizardLocation. Override the toString method in this class and make it return all the 4 data members as String. Now create a driver class and a main method to create an object of Lizard by initializing values for member data. Print this object using toString () method. Output shall look like:

    brain size = 0.9
    egg size = 4.0
    lizardLength = 10
    lizardLocation = tropical

Include Test-run Screenshots, source code and UML diagram of your class.

### Q3

##### Instructions
Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square. Use Quadrilateral as the superclass of the hierarchy. Remember that Trapezoid is a Quadrilateral, Parallelogram is a Trapezoid, Rectangle is a Parallelogram and Square is a Rectangle. You are being provided with a Point class, use it to represent the points in each shape. For e.g., the private instance variables of Quadrilateral should be the x-y coordinate pairs for the four endpoints of the Quadrilateral and each x-y pair could be represented using a Point object. Write a program that instantiates objects of all your classes and outputs each objects’ area (except Quadrilateral). Make Quadrilateral an abstract class and getArea() an abstract method.

Quadrilateral:

    Data: Point topLeft, topRight, bottomLeft, bottomRight;
    Methods: Constructors, getters, setters, toString, abstract getArea()

All derived classes:
    
    Methods: Constructors, setters, getters, to String, getArea()
    Include Test-run Screenshots, UML diagrams and source code.

Include Test-run Screenshots, UML diagrams and source code.

### Q4

##### Instructions
Review the code in CardDisplay.java, CardDisplayMouseClicks.java, and CardDisplayTest.java

Run the program and observe the output.

Now, based on your understanding of Java language write an algorithm and summary of how the aforementioned program is working. Do not forget to discuss the flow of the program, method calling and so on. [In 500 words total]