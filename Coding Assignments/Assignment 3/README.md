# Assignment 3

Note: Please refer to the grading rubric in the Syllabus. 

Do not forget to adequately comment and use “this” reference. Follow the styling guidelines. 

### Q1

##### Instructions
A right triangle can have sides whose lengths are all integers. The set of three integer values for the lengths of the sides of a right triangle is called a Pythagorean triple. The lengths of the three sides must satisfy the relationship
that the sum of the squares of two of the sides is equal to the square of the hypotenuse. Write an application that displays a table of the Pythagorean triples for side1, side2 and the hypotenuse, all no larger than 500. You’d need to use “field-width specifiers” to print the output that is formatted to look like a table. Use a triple-nested for loop that tries all possibilities. This method is an example of “brute-force” computing. You’ll learn in more advanced computer science courses that for many interesting problems there’s no known algorithmic approach other than using sheer brute force.

Include Test-run Screenshots and source code.

### Q2

##### Instructions
Create a class TicTacToe that will enable you to write a program to play Tic-Tac-Toe. The class contains a private 3-by-3 two-dimensional integer array where 1 represents X, 0 represents available/empty, -1 represents O. The constructor should initialize the board elements to empty. Allow two human players. Wherever the first player moves, place a 1 in the specified square, and place a -1 wherever the second player moves. Each move must be to an empty square. After each move, determine whether the game has been won and whether it’s a draw. If it is a win, then print which player won and if it’s a draw then reinitialize the array to empty and restart the game: this could be done using a sentinel controlled loop. You are provided with a class `<TicTacToePrinter>` which contains a method `<printBoard(int array[][])>` that takes an argument of your array and prints the board. Use this method to print the board after every move.

Include Test-run Screenshots, source code and UML diagram of your class.

### Q3

##### Instructions
Write a method that reverses the order of elements in an `ArrayList<E>` without creating a new ArrayList. **You may only use the methods remove, add, and size.** (For this problem you could use `ArrayList<Integer>` or `ArrayList<String>`). Demonstrate the working of your method by calling it from the main a few times.

Include Test-run Screenshots and source code.

### Q4

##### Instructions
Write a segment of code that will declare an array of doubles that can hold ‘N’ elements. N must be a properly declared ‘int’ constant. Then, initialize the array so that each element of the array contains the square root of its position. Use the method: static double sqrt (double) from java.lang.Math to compute the square roots. You must also make sure that the program handles the exceptions as well. (Hint: Show the use of try-catch too)

Include Test-run Screenshots and source code.

### Q5

##### Instructions
Using 2 examples each for Inheritance, Aggregation and Composition, discuss the appropriate situations for Using Inheritance vs. Using Composition vs. Using Aggregation. Your examples must be distinct and based on the real world. You can find motivation by thinking “if you were implementing an idea as a class, which one of the above would you use and why”. Remember that a class is just an imitation of real-world objects. Submit your discussion, no code required but you are encouraged to use pseudo-code to support your examples. (In 500 words max).