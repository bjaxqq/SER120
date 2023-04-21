# Temperature

### Instructions
The following table lists the freezing and boiling points of several substances.

| Substance | Freezing Point | Boiling Point |
| :--: | :--: | :--: |
| Ethyl Alcohol | -173 | 172 |
| Oxygen | -362 | -306 |
| Water | 32 | 212 |

Design a class that stores a temperature in a temperature member variable and has the appropriate accessor and mutator functions. In addition to appropriate constructors, the class should have the following member functions:
    
    i. isEthylFreezing This function should return the bool value true if the temperature stored in the temperature field is at or below the freezing point of ethyl alcohol. Otherwise, the function should return false.
    ii. isEthylBoiling This function should return the bool value true if the temperature stored in the temperature field is at or above the boiling point of ethyl alcohol. Otherwise, the function should return false.
    iii. isOxygenFreezing This function should return the bool value true if the temperature stored in the temperature field is at or below the freezing point of oxygen. Otherwise, the function should return false.
    iv. isOxygenBoiling This function should return the bool value true if the temperature stored in the temperature field is at or above the boiling point of oxygen. Otherwise, the function should return false.
    v. isWaterFreezing This function should return the bool value true if the temperature stored in the temperature field is at or below the freezing point of water. Otherwise, the function should return false.
    vi. isWaterBoiling This function should return the bool value true if the temperature stored in the temperature field is at or above the boiling point of water. Otherwise, the function should return false.

Write a driver program (main function) that demonstrates the class. The program should ask the user to enter a temperature and then display a list of the substances that will freeze at that temperature and those that will boil at that temperature. For example, if the temperature is −20 the class should report that water will freeze and oxygen will boil at that temperature.