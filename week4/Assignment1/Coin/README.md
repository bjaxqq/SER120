# Coin

### Instructions
Write a class named Coin. The Coin class should have the following member variable:
    
    i. A string named sideUp. The sideUp member variable will hold either “heads” or “tails” indicating the side of the coin that is facing up.

The Coin class should have the following member functions:

    i. A default constructor that randomly determines the side of the coin that is facing up (“heads” or “tails”) and initializes the sideUp member variable accordingly.
    ii. A void member function named toss that simulates the tossing of the coin.

When the toss member function is called, it randomly determines the side of the coin that is facing up (“heads” or “tails”) and sets the sideUp member variable accordingly.

    i. A member function named getSideUp that returns the value of the sideUp member variable.

Write a driver program (main function) that demonstrates the Coin class. The program should create an instance of the class and display the side that is initially facing up. Then, use a loop to toss the coin 20 times. Each time the coin is tossed, display the side that is facing up. The program should keep count of the number of times heads is facing up and the number of times tails is facing up, and display those values after the loop finishes.