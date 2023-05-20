# Assignment 1

Note: Please refer to the grading rubric in the Syllabus. 

Do not forget to adequately comment and use “this” reference. Follow the styling guidelines. 

### Q1

##### Instructions
Develop a class Circle with a private member variable “radius” as a double. It also has “PI” as a static private constant. Write proper setters and getters for this class. Also write a function “getArea” that would return the area of the circle. The area of Circle is calculated as PI * radius * radius.

- Add a default constructor
- Add an overloaded constructor to initialize radius to a user supplied value
- In your main function, demonstrate how you would you call default constructor and argumented constructor, print the area for each
- In your main function, create an array of 5 Circle objects (it’d call default constructor)
- In your main function, create an array of 5 Circle objects and initialize radius for each as: 12, 7, 9, 14, 18
- In your main function, run a look that displays area for each of the 5 objects you created in “1.v”

Include Screenshots, source code and UML diagram of your class.

### Q2

##### Instructions
Write a class named Employee that has the following member variables:
- name. A string that holds the employee’s name.
- idNumber. An int variable that holds the employee’s ID number.
- department. A string that holds the name of the department where the employee works.
- position. A string that holds the employee’s job title.

The class should have the following constructors:
- A constructor that accepts the following values as arguments and assigns them to the appropriate member variables: employee’s name, employee’s ID number, department, and position.
- A constructor that accepts the following values as arguments and assigns them to the appropriate member variables: employee’s name and ID number. The department and position fields should be assigned an empty string ( "" ).
- A default constructor that assigns empty strings ("") to the name, department, and position member variables, and 0 to the idNumber member variable.

Write appropriate mutator functions that set values in these member variables and accessor functions that return the values in these member variables. Once you have written the class, write a separate driver program (main function) that creates three Employee objects to hold the following data.

| Name | ID Number | Department | Position |
| :--: | :--: | :--: | :--: |
| Susan Meyers | 47899 | Accounting | Vice President |
| Mark Jones | 39119 | IT | Programmer |
| Joy Rogers | 81774 | Manufacturing | Engineer |

The program should store this data in the three objects and then display the data for each employee on the screen.

Include Screenshots, source code and UML diagram of your class.

### Q3

##### Instructions
The following table lists the freezing and boiling points of several substances.

| Substance | Freezing Point | Boiling Point |
| :--: | :--: | :--: |
| Ethyl Alcohol | -173 | 172 |
| Oxygen | -362 | -306 |
| Water | 32 | 212 |

Design a class that stores a temperature in a temperature member variable and has the appropriate accessor and mutator functions. In addition to appropriate constructors, the class should have the following member functions:
- isEthylFreezing This function should return the bool value true if the temperature stored in the temperature field is at or below the freezing point of ethyl alcohol. Otherwise, the function should return false.
- isEthylBoiling This function should return the bool value true if the temperature stored in the temperature field is at or above the boiling point of ethyl alcohol. Otherwise, the function should return false.
- isOxygenFreezing This function should return the bool value true if the temperature stored in the temperature field is at or below the freezing point of oxygen. Otherwise, the function should return false.
- isOxygenBoiling This function should return the bool value true if the temperature stored in the temperature field is at or above the boiling point of oxygen. Otherwise, the function should return false.
- isWaterFreezing This function should return the bool value true if the temperature stored in the temperature field is at or below the freezing point of water. Otherwise, the function should return false.
- isWaterBoiling This function should return the bool value true if the temperature stored in the temperature field is at or above the boiling point of water. Otherwise, the function should return false.

Write a driver program (main function) that demonstrates the class. The program should ask the user to enter a temperature and then display a list of the substances that will freeze at that temperature and those that will boil at that temperature. For example, if the temperature is −20 the class should report that water will freeze and oxygen will boil at that temperature.

Include Screenshots, source code and UML diagram of your class.

### Q4

##### Instructions
Write a class named Coin. The Coin class should have the following member variable:
- A string named sideUp. The sideUp member variable will hold either “heads” or “tails” indicating the side of the coin that is facing up.

The Coin class should have the following member functions:
- A default constructor that randomly determines the side of the coin that is facing up (“heads” or “tails”) and initializes the sideUp member variable accordingly.
- A void member function named toss that simulates the tossing of the coin.

When the toss member function is called, it randomly determines the side of the coin that is facing up (“heads” or “tails”) and sets the sideUp member variable accordingly.
- A member function named getSideUp that returns the value of the sideUp member variable.

Write a driver program (main function) that demonstrates the Coin class. The program should create an instance of the class and display the side that is initially facing up. Then, use a loop to toss the coin 20 times. Each time the coin is tossed, display the side that is facing up. The program should keep count of the number of times heads is facing up and the number of times tails is facing up, and display those values after the loop finishes.

Include Screenshots, source code and UML diagram of your class.