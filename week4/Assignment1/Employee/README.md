# Employee

### Instructions
Write a class named Employee that has the following member variables:
   
    i. name. A string that holds the employee’s name.
    ii. idNumber. An int variable that holds the employee’s ID number.
    iii. department. A string that holds the name of the department where the employee works.
    iv. position. A string that holds the employee’s job title.

The class should have the following constructors:
   
    i. A constructor that accepts the following values as arguments and assigns them to the appropriate member variables: employee’s name, employee’s ID number, department, and position.
    ii. A constructor that accepts the following values as arguments and assigns them to the appropriate member variables: employee’s name and ID number. The department and position fields should be assigned an empty string ( "" ).
    iii. A default constructor that assigns empty strings ("") to the name, department, and position member variables, and 0 to the idNumber member variable.

Write appropriate mutator functions that set values in these member variables and accessor functions that return the values in these member variables. Once you have written the class, write a separate driver program (main function) that creates three Employee objects to hold the following data.

| Name | ID Number | Department | Position |
| :--: | :--: | :--: | :--: |
| Susan Meyers | 47899 | Accounting | Vice President |
| Mark Jones | 39119 | IT | Programmer |
| Joy Rogers | 81774 | Manufacturing | Engineer |

The program should store this data in the three objects and then display the data for each employee on the screen.